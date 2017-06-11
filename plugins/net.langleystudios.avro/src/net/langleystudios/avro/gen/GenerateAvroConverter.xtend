package net.langleystudios.avro.gen

import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.generator.IFileSystemAccess

class GenerateAvroConverter {

	def generateConverter(EPackage anEPackage, IFileSystemAccess fsa) {

		var String basePackage = Utility.basePackage
		var String avroPrefix = basePackage.concat('.avro.')
		var String emfPrefix = basePackage.concat('.')
		var String emfFactory = emfPrefix.concat(Utility.getFactory)

		fsa.generateFile("ConvertEMFtoAvro.java", '''

package «basePackage».avro;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import net.langleystudios.avro.AvroEMFConverter;

import org.apache.avro.Schema;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;

// Main class definition
public class ConvertEMFtoAvro implements AvroEMFConverter {

public Schema getSchema() {
	List<Schema> schemaList = new ArrayList<Schema>();
	«FOR eclass : anEPackage.EClassifiers.filter(typeof(EClass))»
	schemaList.add(«avroPrefix.concat(eclass.name)».SCHEMA$);
	«ENDFOR»	
	Schema unionSchema = Schema.createUnion(schemaList);
	return unionSchema;
}

public Object convertEObject(EObject eobject) {
	«FOR eclass : anEPackage.EClassifiers.filter(typeof(EClass))»
	if(eobject instanceof «emfPrefix.concat(eclass.name)»)
	{
		return convert«eclass.name»((«emfPrefix.concat(eclass.name)»)eobject);
	}
	«ENDFOR»
	return null;
}

public Schema getSchema(EObject eobject) {
	«FOR eclass : anEPackage.EClassifiers.filter(typeof(EClass))»
	if(eobject instanceof «emfPrefix.concat(eclass.name)»)
	{
		return «avroPrefix.concat(eclass.name)».getClassSchema();
	}
	«ENDFOR»
	return null;
}

	«FOR eclass : anEPackage.EClassifiers.filter(typeof(EClass))»
public «avroPrefix.concat(eclass.name)» convert«eclass.name»(
	«emfPrefix.concat(eclass.name)» input) {

	// If the input is null, then return null 
	if(input == null)
	{
		return null;
	}
	«avroPrefix.concat(eclass.name)» output = new «avroPrefix.concat(eclass.name)»();

«FOR aFeature : eclass.EAllStructuralFeatures»
«IF !aFeature.EType.name.equalsIgnoreCase('EFeatureMapEntry')»
«IF aFeature.upperBound != 1»
	// Handle array of non-containment references
	«IF aFeature instanceof EReference && ! (aFeature as EReference).containment»
		List<CharSequence> «aFeature.name»List = new ArrayList<CharSequence>();
		for(«emfPrefix.concat(aFeature.EType.name)» itr : input.get«aFeature.name.toFirstUpper») {
			String uri = getURI(itr);
			«aFeature.name»List.add(uri);
		}
		if(«aFeature.name»List.size() > 0)
		{
			output.set«aFeature.name.toFirstUpper»(«aFeature.name»List);
		} else {
			output.set«aFeature.name.toFirstUpper»(null);
		}
	// Now handle normal array
	«ELSE»
		List<«avroPrefix.concat(aFeature.EType.name)»> «aFeature.name»List = new ArrayList<«avroPrefix.concat(aFeature.EType.name)»>();
		for(«emfPrefix.concat(aFeature.EType.name)» itr : input.get«aFeature.name.toFirstUpper»()) {
			«aFeature.name»List.add(convert«aFeature.EType.name»(itr));
		}
		if(«aFeature.name»List.size() > 0)
		{
			output.set«aFeature.name.toFirstUpper»(«aFeature.name»List);
		} else {
			output.set«aFeature.name.toFirstUpper»(null);
		}
	«ENDIF»
«ELSEIF aFeature instanceof EAttribute»
	«IF aFeature.EType instanceof EEnum»
	if(input.get«aFeature.name.toFirstUpper»() != null) {
		output.set«aFeature.name.toFirstUpper»(«avroPrefix.concat(aFeature.EType.name)».valueOf(input.get«aFeature.name.toFirstUpper»().getLiteral()));
	}
	«ELSEIF aFeature.EType.name.equalsIgnoreCase('EBoolean')»
	output.set«aFeature.name.toFirstUpper»(input.is«aFeature.name.toFirstUpper»());
	«ELSEIF aFeature.EType.name.equalsIgnoreCase('EDate')»
	if(input.get«aFeature.name.toFirstUpper»() != null) {
		output.set«aFeature.name.toFirstUpper»(input.get«aFeature.name.toFirstUpper»().toString());
	}
	«ELSE»
	output.set«aFeature.name.toFirstUpper»(input.get«aFeature.name.toFirstUpper»());
	«ENDIF»
«ELSE»
	// Handle non-containment references
	«IF aFeature instanceof EReference && ! (aFeature as EReference).containment»
	if(input.get«aFeature.name.toFirstUpper»() != null)
	{
		String uri = getURI(input.get«aFeature.name.toFirstUpper»());
		output.set«aFeature.name.toFirstUpper»(uri);
	}
	«ELSE»
	output.set«aFeature.name.toFirstUpper»(convert«aFeature.EType.name»(input.get«aFeature.name.toFirstUpper»()));
«ENDIF»
«ENDIF»
«ENDIF»

	«ENDFOR»

	return output;
}

«ENDFOR»

public EObject convertAvroObject(Object object) {
«FOR eclass : anEPackage.EClassifiers.filter(typeof(EClass))»
«IF !eclass.abstract»
	if(object instanceof «avroPrefix.concat(eclass.name)»)
	{
		return convert«eclass.name»((«avroPrefix.concat(eclass.name)»)object);
	}
«ENDIF»
«ENDFOR»
	return null;
}

«FOR eclass : anEPackage.EClassifiers.filter(typeof(EClass))»
«IF !eclass.abstract»
public «emfPrefix.concat(eclass.name)» convert«eclass.name»(
	«avroPrefix.concat(eclass.name)» input) {

	«emfPrefix.concat(eclass.name)» output = «emfFactory».eINSTANCE.create«eclass.name»();

«FOR aFeature : eclass.EAllStructuralFeatures»
«IF !aFeature.EType.name.equalsIgnoreCase('EFeatureMapEntry')»
	if(input.get«aFeature.name.toFirstUpper»() != null) {
«IF aFeature.upperBound != 1»
	«IF aFeature instanceof EReference && !(aFeature as EReference).containment»
	EList<«emfPrefix.concat(aFeature.EType.name)»> «aFeature.name»List = output.get«aFeature.name.toFirstUpper»();
	for(CharSequence itr : input.get«aFeature.name.toFirstUpper»()) {
		«emfPrefix.concat(aFeature.EType.name)» «aFeature.name»Proxy = 
			(«emfPrefix.concat(aFeature.EType.name)»)getEObject(itr.toString());
		«aFeature.name»List.add(«aFeature.name»Proxy);
	}
	«ELSE»
	EList<«emfPrefix.concat(aFeature.EType.name)»> «aFeature.name»List = output.get«aFeature.name.toFirstUpper»();
	for(«avroPrefix.concat(aFeature.EType.name)» itr : input.get«aFeature.name.toFirstUpper»()) {
		«aFeature.name»List.add((«emfPrefix.concat(aFeature.EType.name)»)convertAvroObject(itr));
	}
	«ENDIF»
«ELSEIF aFeature instanceof EAttribute»
	«IF aFeature.EType instanceof EEnum»
	output.set«aFeature.name.toFirstUpper»(«emfPrefix.concat(aFeature.EType.name)».get(input.get«aFeature.name.toFirstUpper»().name()));
	«ELSEIF aFeature.EType.name.equalsIgnoreCase('EBoolean')»
	output.set«aFeature.name.toFirstUpper»(input.get«aFeature.name.toFirstUpper»());
	«ELSEIF aFeature.EType.name.equalsIgnoreCase('EDate')»
	try {
		Date «aFeature.name»Date = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(input.get«aFeature.name.toFirstUpper»().toString());
		output.set«aFeature.name.toFirstUpper»(«aFeature.name»Date);
	} catch(ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	«ELSEIF aFeature.EType.name.equalsIgnoreCase('EString')»
	output.set«aFeature.name.toFirstUpper»(input.get«aFeature.name.toFirstUpper»().toString());
	«ELSE»
		output.set«aFeature.name.toFirstUpper»(input.get«aFeature.name.toFirstUpper»());
	«ENDIF»
«ELSE»
	// Handle non-containment references
	«IF aFeature instanceof EReference && !(aFeature as EReference).containment»
	«emfPrefix.concat(aFeature.EType.name)» «aFeature.name»Proxy = 
		(«emfPrefix.concat(aFeature.EType.name)»)getEObject(input.get«aFeature.name.toFirstUpper»().toString());
	output.set«aFeature.name.toFirstUpper»(«aFeature.name»Proxy);
	«ELSE»
	output.set«aFeature.name.toFirstUpper»(convert«aFeature.EType.name»(input.get«aFeature.name.toFirstUpper»()));
	«ENDIF»
«ENDIF»
	}
«ENDIF»
«ENDFOR»

	return output;
}
«ENDIF»
«ENDFOR»

	private EObject getEObject(String input) {
		EObject rvalue = null;
		String«'«'»«']'» pieces = input.split(" ");
		if (pieces.length == 3) {
			String ns = pieces«'«'»0«']'»;
			String className = pieces«'«'»1«']'»;
			String fragment = pieces«'«'»2«']'»;
			EPackage pkg = EPackage.Registry.INSTANCE.getEPackage(ns);
			if (pkg != null) {
				EClassifier classifier = pkg.getEClassifier(className);
				if (classifier instanceof EClass) {
					InternalEObject eobject = (InternalEObject) EcoreUtil
							.create((EClass) classifier);
					URI uri = URI.createURI(fragment);
					eobject.eSetProxyURI(uri);
					rvalue = eobject;
				}
			}
		}
		return rvalue;
	}

	private StringBuilder builder = new StringBuilder();
	private String getURI(EObject eobject) {
		if(eobject.eResource() == null)
		{
			throw new NullPointerException("child object not contained in a resource");
		}
		builder.setLength(0);
		builder.append(eobject.eClass().getEPackage().getNsURI());
		builder.append(" ");
		builder.append(eobject.eClass().getName());
		builder.append(" ");
		builder.append(EcoreUtil.getURI(eobject));
		return builder.toString();
	}

}
''')

	}
}
