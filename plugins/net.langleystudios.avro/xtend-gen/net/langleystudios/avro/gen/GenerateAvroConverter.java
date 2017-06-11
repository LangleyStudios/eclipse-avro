package net.langleystudios.avro.gen;

import com.google.common.collect.Iterables;
import net.langleystudios.avro.gen.Utility;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class GenerateAvroConverter {
  public void generateConverter(final EPackage anEPackage, final IFileSystemAccess fsa) {
    String basePackage = Utility.getBasePackage();
    String avroPrefix = basePackage.concat(".avro.");
    String emfPrefix = basePackage.concat(".");
    String _factory = Utility.getFactory();
    String emfFactory = emfPrefix.concat(_factory);
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("package ");
    _builder.append(basePackage, "");
    _builder.append(".avro;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    _builder.append("import java.util.Date;");
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.append("import java.util.Locale;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.text.ParseException;");
    _builder.newLine();
    _builder.append("import java.text.SimpleDateFormat;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import net.langleystudios.avro.AvroEMFConverter;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.apache.avro.Schema;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.eclipse.emf.ecore.EObject;");
    _builder.newLine();
    _builder.append("import org.eclipse.emf.ecore.InternalEObject;");
    _builder.newLine();
    _builder.append("import org.eclipse.emf.ecore.EClass;");
    _builder.newLine();
    _builder.append("import org.eclipse.emf.ecore.EClassifier;");
    _builder.newLine();
    _builder.append("import org.eclipse.emf.ecore.EPackage;");
    _builder.newLine();
    _builder.append("import org.eclipse.emf.ecore.util.EcoreUtil;");
    _builder.newLine();
    _builder.append("import org.eclipse.emf.common.util.EList;");
    _builder.newLine();
    _builder.append("import org.eclipse.emf.common.util.URI;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("// Main class definition");
    _builder.newLine();
    _builder.append("public class ConvertEMFtoAvro implements AvroEMFConverter {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public Schema getSchema() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("List<Schema> schemaList = new ArrayList<Schema>();");
    _builder.newLine();
    {
      EList<EClassifier> _eClassifiers = anEPackage.getEClassifiers();
      Iterable<EClass> _filter = Iterables.<EClass>filter(_eClassifiers, EClass.class);
      for(final EClass eclass : _filter) {
        _builder.append("\t");
        _builder.append("schemaList.add(");
        String _name = eclass.getName();
        String _concat = avroPrefix.concat(_name);
        _builder.append(_concat, "\t");
        _builder.append(".SCHEMA$);");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("Schema unionSchema = Schema.createUnion(schemaList);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return unionSchema;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public Object convertEObject(EObject eobject) {");
    _builder.newLine();
    {
      EList<EClassifier> _eClassifiers_1 = anEPackage.getEClassifiers();
      Iterable<EClass> _filter_1 = Iterables.<EClass>filter(_eClassifiers_1, EClass.class);
      for(final EClass eclass_1 : _filter_1) {
        _builder.append("\t");
        _builder.append("if(eobject instanceof ");
        String _name_1 = eclass_1.getName();
        String _concat_1 = emfPrefix.concat(_name_1);
        _builder.append(_concat_1, "\t");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("{");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return convert");
        String _name_2 = eclass_1.getName();
        _builder.append(_name_2, "\t\t");
        _builder.append("((");
        String _name_3 = eclass_1.getName();
        String _concat_2 = emfPrefix.concat(_name_3);
        _builder.append(_concat_2, "\t\t");
        _builder.append(")eobject);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("return null;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public Schema getSchema(EObject eobject) {");
    _builder.newLine();
    {
      EList<EClassifier> _eClassifiers_2 = anEPackage.getEClassifiers();
      Iterable<EClass> _filter_2 = Iterables.<EClass>filter(_eClassifiers_2, EClass.class);
      for(final EClass eclass_2 : _filter_2) {
        _builder.append("\t");
        _builder.append("if(eobject instanceof ");
        String _name_4 = eclass_2.getName();
        String _concat_3 = emfPrefix.concat(_name_4);
        _builder.append(_concat_3, "\t");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("{");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return ");
        String _name_5 = eclass_2.getName();
        String _concat_4 = avroPrefix.concat(_name_5);
        _builder.append(_concat_4, "\t\t");
        _builder.append(".getClassSchema();");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("return null;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    {
      EList<EClassifier> _eClassifiers_3 = anEPackage.getEClassifiers();
      Iterable<EClass> _filter_3 = Iterables.<EClass>filter(_eClassifiers_3, EClass.class);
      for(final EClass eclass_3 : _filter_3) {
        _builder.append("public ");
        String _name_6 = eclass_3.getName();
        String _concat_5 = avroPrefix.concat(_name_6);
        _builder.append(_concat_5, "");
        _builder.append(" convert");
        String _name_7 = eclass_3.getName();
        _builder.append(_name_7, "");
        _builder.append("(");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        String _name_8 = eclass_3.getName();
        String _concat_6 = emfPrefix.concat(_name_8);
        _builder.append(_concat_6, "\t");
        _builder.append(" input) {");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("// If the input is null, then return null ");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("if(input == null)");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("{");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("return null;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        String _name_9 = eclass_3.getName();
        String _concat_7 = avroPrefix.concat(_name_9);
        _builder.append(_concat_7, "\t");
        _builder.append(" output = new ");
        String _name_10 = eclass_3.getName();
        String _concat_8 = avroPrefix.concat(_name_10);
        _builder.append(_concat_8, "\t");
        _builder.append("();");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        {
          EList<EStructuralFeature> _eAllStructuralFeatures = eclass_3.getEAllStructuralFeatures();
          for(final EStructuralFeature aFeature : _eAllStructuralFeatures) {
            {
              EClassifier _eType = aFeature.getEType();
              String _name_11 = _eType.getName();
              boolean _equalsIgnoreCase = _name_11.equalsIgnoreCase("EFeatureMapEntry");
              boolean _not = (!_equalsIgnoreCase);
              if (_not) {
                {
                  int _upperBound = aFeature.getUpperBound();
                  boolean _notEquals = (_upperBound != 1);
                  if (_notEquals) {
                    _builder.append("// Handle array of non-containment references");
                    _builder.newLine();
                    {
                      if (((aFeature instanceof EReference) && (!((EReference) aFeature).isContainment()))) {
                        _builder.append("List<CharSequence> ");
                        String _name_12 = aFeature.getName();
                        _builder.append(_name_12, "");
                        _builder.append("List = new ArrayList<CharSequence>();");
                        _builder.newLineIfNotEmpty();
                        _builder.append("for(");
                        EClassifier _eType_1 = aFeature.getEType();
                        String _name_13 = _eType_1.getName();
                        String _concat_9 = emfPrefix.concat(_name_13);
                        _builder.append(_concat_9, "");
                        _builder.append(" itr : input.get");
                        String _name_14 = aFeature.getName();
                        String _firstUpper = StringExtensions.toFirstUpper(_name_14);
                        _builder.append(_firstUpper, "");
                        _builder.append(") {");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t");
                        _builder.append("String uri = getURI(itr);");
                        _builder.newLine();
                        _builder.append("\t");
                        String _name_15 = aFeature.getName();
                        _builder.append(_name_15, "\t");
                        _builder.append("List.add(uri);");
                        _builder.newLineIfNotEmpty();
                        _builder.append("}");
                        _builder.newLine();
                        _builder.append("if(");
                        String _name_16 = aFeature.getName();
                        _builder.append(_name_16, "");
                        _builder.append("List.size() > 0)");
                        _builder.newLineIfNotEmpty();
                        _builder.append("{");
                        _builder.newLine();
                        _builder.append("\t");
                        _builder.append("output.set");
                        String _name_17 = aFeature.getName();
                        String _firstUpper_1 = StringExtensions.toFirstUpper(_name_17);
                        _builder.append(_firstUpper_1, "\t");
                        _builder.append("(");
                        String _name_18 = aFeature.getName();
                        _builder.append(_name_18, "\t");
                        _builder.append("List);");
                        _builder.newLineIfNotEmpty();
                        _builder.append("} else {");
                        _builder.newLine();
                        _builder.append("\t");
                        _builder.append("output.set");
                        String _name_19 = aFeature.getName();
                        String _firstUpper_2 = StringExtensions.toFirstUpper(_name_19);
                        _builder.append(_firstUpper_2, "\t");
                        _builder.append("(null);");
                        _builder.newLineIfNotEmpty();
                        _builder.append("}");
                        _builder.newLine();
                        _builder.append("\t");
                        _builder.append("// Now handle normal array");
                        _builder.newLine();
                      } else {
                        _builder.append("List<");
                        EClassifier _eType_2 = aFeature.getEType();
                        String _name_20 = _eType_2.getName();
                        String _concat_10 = avroPrefix.concat(_name_20);
                        _builder.append(_concat_10, "");
                        _builder.append("> ");
                        String _name_21 = aFeature.getName();
                        _builder.append(_name_21, "");
                        _builder.append("List = new ArrayList<");
                        EClassifier _eType_3 = aFeature.getEType();
                        String _name_22 = _eType_3.getName();
                        String _concat_11 = avroPrefix.concat(_name_22);
                        _builder.append(_concat_11, "");
                        _builder.append(">();");
                        _builder.newLineIfNotEmpty();
                        _builder.append("for(");
                        EClassifier _eType_4 = aFeature.getEType();
                        String _name_23 = _eType_4.getName();
                        String _concat_12 = emfPrefix.concat(_name_23);
                        _builder.append(_concat_12, "");
                        _builder.append(" itr : input.get");
                        String _name_24 = aFeature.getName();
                        String _firstUpper_3 = StringExtensions.toFirstUpper(_name_24);
                        _builder.append(_firstUpper_3, "");
                        _builder.append("()) {");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t");
                        String _name_25 = aFeature.getName();
                        _builder.append(_name_25, "\t");
                        _builder.append("List.add(convert");
                        EClassifier _eType_5 = aFeature.getEType();
                        String _name_26 = _eType_5.getName();
                        _builder.append(_name_26, "\t");
                        _builder.append("(itr));");
                        _builder.newLineIfNotEmpty();
                        _builder.append("}");
                        _builder.newLine();
                        _builder.append("if(");
                        String _name_27 = aFeature.getName();
                        _builder.append(_name_27, "");
                        _builder.append("List.size() > 0)");
                        _builder.newLineIfNotEmpty();
                        _builder.append("{");
                        _builder.newLine();
                        _builder.append("\t");
                        _builder.append("output.set");
                        String _name_28 = aFeature.getName();
                        String _firstUpper_4 = StringExtensions.toFirstUpper(_name_28);
                        _builder.append(_firstUpper_4, "\t");
                        _builder.append("(");
                        String _name_29 = aFeature.getName();
                        _builder.append(_name_29, "\t");
                        _builder.append("List);");
                        _builder.newLineIfNotEmpty();
                        _builder.append("} else {");
                        _builder.newLine();
                        _builder.append("\t");
                        _builder.append("output.set");
                        String _name_30 = aFeature.getName();
                        String _firstUpper_5 = StringExtensions.toFirstUpper(_name_30);
                        _builder.append(_firstUpper_5, "\t");
                        _builder.append("(null);");
                        _builder.newLineIfNotEmpty();
                        _builder.append("}");
                        _builder.newLine();
                      }
                    }
                  } else {
                    if ((aFeature instanceof EAttribute)) {
                      {
                        EClassifier _eType_6 = aFeature.getEType();
                        if ((_eType_6 instanceof EEnum)) {
                          _builder.append("if(input.get");
                          String _name_31 = aFeature.getName();
                          String _firstUpper_6 = StringExtensions.toFirstUpper(_name_31);
                          _builder.append(_firstUpper_6, "");
                          _builder.append("() != null) {");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t");
                          _builder.append("output.set");
                          String _name_32 = aFeature.getName();
                          String _firstUpper_7 = StringExtensions.toFirstUpper(_name_32);
                          _builder.append(_firstUpper_7, "\t");
                          _builder.append("(");
                          EClassifier _eType_7 = aFeature.getEType();
                          String _name_33 = _eType_7.getName();
                          String _concat_13 = avroPrefix.concat(_name_33);
                          _builder.append(_concat_13, "\t");
                          _builder.append(".valueOf(input.get");
                          String _name_34 = aFeature.getName();
                          String _firstUpper_8 = StringExtensions.toFirstUpper(_name_34);
                          _builder.append(_firstUpper_8, "\t");
                          _builder.append("().getLiteral()));");
                          _builder.newLineIfNotEmpty();
                          _builder.append("}");
                          _builder.newLine();
                        } else {
                          EClassifier _eType_8 = aFeature.getEType();
                          String _name_35 = _eType_8.getName();
                          boolean _equalsIgnoreCase_1 = _name_35.equalsIgnoreCase("EBoolean");
                          if (_equalsIgnoreCase_1) {
                            _builder.append("output.set");
                            String _name_36 = aFeature.getName();
                            String _firstUpper_9 = StringExtensions.toFirstUpper(_name_36);
                            _builder.append(_firstUpper_9, "");
                            _builder.append("(input.is");
                            String _name_37 = aFeature.getName();
                            String _firstUpper_10 = StringExtensions.toFirstUpper(_name_37);
                            _builder.append(_firstUpper_10, "");
                            _builder.append("());");
                            _builder.newLineIfNotEmpty();
                          } else {
                            EClassifier _eType_9 = aFeature.getEType();
                            String _name_38 = _eType_9.getName();
                            boolean _equalsIgnoreCase_2 = _name_38.equalsIgnoreCase("EDate");
                            if (_equalsIgnoreCase_2) {
                              _builder.append("if(input.get");
                              String _name_39 = aFeature.getName();
                              String _firstUpper_11 = StringExtensions.toFirstUpper(_name_39);
                              _builder.append(_firstUpper_11, "");
                              _builder.append("() != null) {");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t");
                              _builder.append("output.set");
                              String _name_40 = aFeature.getName();
                              String _firstUpper_12 = StringExtensions.toFirstUpper(_name_40);
                              _builder.append(_firstUpper_12, "\t");
                              _builder.append("(input.get");
                              String _name_41 = aFeature.getName();
                              String _firstUpper_13 = StringExtensions.toFirstUpper(_name_41);
                              _builder.append(_firstUpper_13, "\t");
                              _builder.append("().toString());");
                              _builder.newLineIfNotEmpty();
                              _builder.append("}");
                              _builder.newLine();
                            } else {
                              _builder.append("output.set");
                              String _name_42 = aFeature.getName();
                              String _firstUpper_14 = StringExtensions.toFirstUpper(_name_42);
                              _builder.append(_firstUpper_14, "");
                              _builder.append("(input.get");
                              String _name_43 = aFeature.getName();
                              String _firstUpper_15 = StringExtensions.toFirstUpper(_name_43);
                              _builder.append(_firstUpper_15, "");
                              _builder.append("());");
                              _builder.newLineIfNotEmpty();
                            }
                          }
                        }
                      }
                    } else {
                      _builder.append("// Handle non-containment references");
                      _builder.newLine();
                      {
                        if (((aFeature instanceof EReference) && (!((EReference) aFeature).isContainment()))) {
                          _builder.append("if(input.get");
                          String _name_44 = aFeature.getName();
                          String _firstUpper_16 = StringExtensions.toFirstUpper(_name_44);
                          _builder.append(_firstUpper_16, "");
                          _builder.append("() != null)");
                          _builder.newLineIfNotEmpty();
                          _builder.append("{");
                          _builder.newLine();
                          _builder.append("\t");
                          _builder.append("String uri = getURI(input.get");
                          String _name_45 = aFeature.getName();
                          String _firstUpper_17 = StringExtensions.toFirstUpper(_name_45);
                          _builder.append(_firstUpper_17, "\t");
                          _builder.append("());");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t");
                          _builder.append("output.set");
                          String _name_46 = aFeature.getName();
                          String _firstUpper_18 = StringExtensions.toFirstUpper(_name_46);
                          _builder.append(_firstUpper_18, "\t");
                          _builder.append("(uri);");
                          _builder.newLineIfNotEmpty();
                          _builder.append("}");
                          _builder.newLine();
                        } else {
                          _builder.append("output.set");
                          String _name_47 = aFeature.getName();
                          String _firstUpper_19 = StringExtensions.toFirstUpper(_name_47);
                          _builder.append(_firstUpper_19, "");
                          _builder.append("(convert");
                          EClassifier _eType_10 = aFeature.getEType();
                          String _name_48 = _eType_10.getName();
                          _builder.append(_name_48, "");
                          _builder.append("(input.get");
                          String _name_49 = aFeature.getName();
                          String _firstUpper_20 = StringExtensions.toFirstUpper(_name_49);
                          _builder.append(_firstUpper_20, "");
                          _builder.append("()));");
                          _builder.newLineIfNotEmpty();
                        }
                      }
                    }
                  }
                }
              }
            }
            _builder.newLine();
          }
        }
        _builder.newLine();
        _builder.append("\t");
        _builder.append("return output;");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
      }
    }
    _builder.newLine();
    _builder.append("public EObject convertAvroObject(Object object) {");
    _builder.newLine();
    {
      EList<EClassifier> _eClassifiers_4 = anEPackage.getEClassifiers();
      Iterable<EClass> _filter_4 = Iterables.<EClass>filter(_eClassifiers_4, EClass.class);
      for(final EClass eclass_4 : _filter_4) {
        {
          boolean _isAbstract = eclass_4.isAbstract();
          boolean _not_1 = (!_isAbstract);
          if (_not_1) {
            _builder.append("if(object instanceof ");
            String _name_50 = eclass_4.getName();
            String _concat_14 = avroPrefix.concat(_name_50);
            _builder.append(_concat_14, "");
            _builder.append(")");
            _builder.newLineIfNotEmpty();
            _builder.append("{");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("return convert");
            String _name_51 = eclass_4.getName();
            _builder.append(_name_51, "\t");
            _builder.append("((");
            String _name_52 = eclass_4.getName();
            String _concat_15 = avroPrefix.concat(_name_52);
            _builder.append(_concat_15, "\t");
            _builder.append(")object);");
            _builder.newLineIfNotEmpty();
            _builder.append("}");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("\t");
    _builder.append("return null;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    {
      EList<EClassifier> _eClassifiers_5 = anEPackage.getEClassifiers();
      Iterable<EClass> _filter_5 = Iterables.<EClass>filter(_eClassifiers_5, EClass.class);
      for(final EClass eclass_5 : _filter_5) {
        {
          boolean _isAbstract_1 = eclass_5.isAbstract();
          boolean _not_2 = (!_isAbstract_1);
          if (_not_2) {
            _builder.append("public ");
            String _name_53 = eclass_5.getName();
            String _concat_16 = emfPrefix.concat(_name_53);
            _builder.append(_concat_16, "");
            _builder.append(" convert");
            String _name_54 = eclass_5.getName();
            _builder.append(_name_54, "");
            _builder.append("(");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            String _name_55 = eclass_5.getName();
            String _concat_17 = avroPrefix.concat(_name_55);
            _builder.append(_concat_17, "\t");
            _builder.append(" input) {");
            _builder.newLineIfNotEmpty();
            _builder.newLine();
            _builder.append("\t");
            String _name_56 = eclass_5.getName();
            String _concat_18 = emfPrefix.concat(_name_56);
            _builder.append(_concat_18, "\t");
            _builder.append(" output = ");
            _builder.append(emfFactory, "\t");
            _builder.append(".eINSTANCE.create");
            String _name_57 = eclass_5.getName();
            _builder.append(_name_57, "\t");
            _builder.append("();");
            _builder.newLineIfNotEmpty();
            _builder.newLine();
            {
              EList<EStructuralFeature> _eAllStructuralFeatures_1 = eclass_5.getEAllStructuralFeatures();
              for(final EStructuralFeature aFeature_1 : _eAllStructuralFeatures_1) {
                {
                  EClassifier _eType_11 = aFeature_1.getEType();
                  String _name_58 = _eType_11.getName();
                  boolean _equalsIgnoreCase_3 = _name_58.equalsIgnoreCase("EFeatureMapEntry");
                  boolean _not_3 = (!_equalsIgnoreCase_3);
                  if (_not_3) {
                    _builder.append("if(input.get");
                    String _name_59 = aFeature_1.getName();
                    String _firstUpper_21 = StringExtensions.toFirstUpper(_name_59);
                    _builder.append(_firstUpper_21, "");
                    _builder.append("() != null) {");
                    _builder.newLineIfNotEmpty();
                    {
                      int _upperBound_1 = aFeature_1.getUpperBound();
                      boolean _notEquals_1 = (_upperBound_1 != 1);
                      if (_notEquals_1) {
                        {
                          if (((aFeature_1 instanceof EReference) && (!((EReference) aFeature_1).isContainment()))) {
                            _builder.append("EList<");
                            EClassifier _eType_12 = aFeature_1.getEType();
                            String _name_60 = _eType_12.getName();
                            String _concat_19 = emfPrefix.concat(_name_60);
                            _builder.append(_concat_19, "");
                            _builder.append("> ");
                            String _name_61 = aFeature_1.getName();
                            _builder.append(_name_61, "");
                            _builder.append("List = output.get");
                            String _name_62 = aFeature_1.getName();
                            String _firstUpper_22 = StringExtensions.toFirstUpper(_name_62);
                            _builder.append(_firstUpper_22, "");
                            _builder.append("();");
                            _builder.newLineIfNotEmpty();
                            _builder.append("for(CharSequence itr : input.get");
                            String _name_63 = aFeature_1.getName();
                            String _firstUpper_23 = StringExtensions.toFirstUpper(_name_63);
                            _builder.append(_firstUpper_23, "");
                            _builder.append("()) {");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t");
                            EClassifier _eType_13 = aFeature_1.getEType();
                            String _name_64 = _eType_13.getName();
                            String _concat_20 = emfPrefix.concat(_name_64);
                            _builder.append(_concat_20, "\t");
                            _builder.append(" ");
                            String _name_65 = aFeature_1.getName();
                            _builder.append(_name_65, "\t");
                            _builder.append("Proxy = ");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t");
                            _builder.append("(");
                            EClassifier _eType_14 = aFeature_1.getEType();
                            String _name_66 = _eType_14.getName();
                            String _concat_21 = emfPrefix.concat(_name_66);
                            _builder.append(_concat_21, "\t\t");
                            _builder.append(")getEObject(itr.toString());");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t");
                            String _name_67 = aFeature_1.getName();
                            _builder.append(_name_67, "\t");
                            _builder.append("List.add(");
                            String _name_68 = aFeature_1.getName();
                            _builder.append(_name_68, "\t");
                            _builder.append("Proxy);");
                            _builder.newLineIfNotEmpty();
                            _builder.append("}");
                            _builder.newLine();
                          } else {
                            _builder.append("EList<");
                            EClassifier _eType_15 = aFeature_1.getEType();
                            String _name_69 = _eType_15.getName();
                            String _concat_22 = emfPrefix.concat(_name_69);
                            _builder.append(_concat_22, "");
                            _builder.append("> ");
                            String _name_70 = aFeature_1.getName();
                            _builder.append(_name_70, "");
                            _builder.append("List = output.get");
                            String _name_71 = aFeature_1.getName();
                            String _firstUpper_24 = StringExtensions.toFirstUpper(_name_71);
                            _builder.append(_firstUpper_24, "");
                            _builder.append("();");
                            _builder.newLineIfNotEmpty();
                            _builder.append("for(");
                            EClassifier _eType_16 = aFeature_1.getEType();
                            String _name_72 = _eType_16.getName();
                            String _concat_23 = avroPrefix.concat(_name_72);
                            _builder.append(_concat_23, "");
                            _builder.append(" itr : input.get");
                            String _name_73 = aFeature_1.getName();
                            String _firstUpper_25 = StringExtensions.toFirstUpper(_name_73);
                            _builder.append(_firstUpper_25, "");
                            _builder.append("()) {");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t");
                            String _name_74 = aFeature_1.getName();
                            _builder.append(_name_74, "\t");
                            _builder.append("List.add((");
                            EClassifier _eType_17 = aFeature_1.getEType();
                            String _name_75 = _eType_17.getName();
                            String _concat_24 = emfPrefix.concat(_name_75);
                            _builder.append(_concat_24, "\t");
                            _builder.append(")convertAvroObject(itr));");
                            _builder.newLineIfNotEmpty();
                            _builder.append("}");
                            _builder.newLine();
                          }
                        }
                      } else {
                        if ((aFeature_1 instanceof EAttribute)) {
                          {
                            EClassifier _eType_18 = aFeature_1.getEType();
                            if ((_eType_18 instanceof EEnum)) {
                              _builder.append("output.set");
                              String _name_76 = aFeature_1.getName();
                              String _firstUpper_26 = StringExtensions.toFirstUpper(_name_76);
                              _builder.append(_firstUpper_26, "");
                              _builder.append("(");
                              EClassifier _eType_19 = aFeature_1.getEType();
                              String _name_77 = _eType_19.getName();
                              String _concat_25 = emfPrefix.concat(_name_77);
                              _builder.append(_concat_25, "");
                              _builder.append(".get(input.get");
                              String _name_78 = aFeature_1.getName();
                              String _firstUpper_27 = StringExtensions.toFirstUpper(_name_78);
                              _builder.append(_firstUpper_27, "");
                              _builder.append("().name()));");
                              _builder.newLineIfNotEmpty();
                            } else {
                              EClassifier _eType_20 = aFeature_1.getEType();
                              String _name_79 = _eType_20.getName();
                              boolean _equalsIgnoreCase_4 = _name_79.equalsIgnoreCase("EBoolean");
                              if (_equalsIgnoreCase_4) {
                                _builder.append("output.set");
                                String _name_80 = aFeature_1.getName();
                                String _firstUpper_28 = StringExtensions.toFirstUpper(_name_80);
                                _builder.append(_firstUpper_28, "");
                                _builder.append("(input.get");
                                String _name_81 = aFeature_1.getName();
                                String _firstUpper_29 = StringExtensions.toFirstUpper(_name_81);
                                _builder.append(_firstUpper_29, "");
                                _builder.append("());");
                                _builder.newLineIfNotEmpty();
                              } else {
                                EClassifier _eType_21 = aFeature_1.getEType();
                                String _name_82 = _eType_21.getName();
                                boolean _equalsIgnoreCase_5 = _name_82.equalsIgnoreCase("EDate");
                                if (_equalsIgnoreCase_5) {
                                  _builder.append("try {");
                                  _builder.newLine();
                                  _builder.append("\t");
                                  _builder.append("Date ");
                                  String _name_83 = aFeature_1.getName();
                                  _builder.append(_name_83, "\t");
                                  _builder.append("Date = new SimpleDateFormat(\"MMMM d, yyyy\", Locale.ENGLISH).parse(input.get");
                                  String _name_84 = aFeature_1.getName();
                                  String _firstUpper_30 = StringExtensions.toFirstUpper(_name_84);
                                  _builder.append(_firstUpper_30, "\t");
                                  _builder.append("().toString());");
                                  _builder.newLineIfNotEmpty();
                                  _builder.append("\t");
                                  _builder.append("output.set");
                                  String _name_85 = aFeature_1.getName();
                                  String _firstUpper_31 = StringExtensions.toFirstUpper(_name_85);
                                  _builder.append(_firstUpper_31, "\t");
                                  _builder.append("(");
                                  String _name_86 = aFeature_1.getName();
                                  _builder.append(_name_86, "\t");
                                  _builder.append("Date);");
                                  _builder.newLineIfNotEmpty();
                                  _builder.append("} catch(ParseException e) {");
                                  _builder.newLine();
                                  _builder.append("\t");
                                  _builder.append("// TODO Auto-generated catch block");
                                  _builder.newLine();
                                  _builder.append("\t");
                                  _builder.append("e.printStackTrace();");
                                  _builder.newLine();
                                  _builder.append("}");
                                  _builder.newLine();
                                } else {
                                  EClassifier _eType_22 = aFeature_1.getEType();
                                  String _name_87 = _eType_22.getName();
                                  boolean _equalsIgnoreCase_6 = _name_87.equalsIgnoreCase("EString");
                                  if (_equalsIgnoreCase_6) {
                                    _builder.append("output.set");
                                    String _name_88 = aFeature_1.getName();
                                    String _firstUpper_32 = StringExtensions.toFirstUpper(_name_88);
                                    _builder.append(_firstUpper_32, "");
                                    _builder.append("(input.get");
                                    String _name_89 = aFeature_1.getName();
                                    String _firstUpper_33 = StringExtensions.toFirstUpper(_name_89);
                                    _builder.append(_firstUpper_33, "");
                                    _builder.append("().toString());");
                                    _builder.newLineIfNotEmpty();
                                  } else {
                                    _builder.append("output.set");
                                    String _name_90 = aFeature_1.getName();
                                    String _firstUpper_34 = StringExtensions.toFirstUpper(_name_90);
                                    _builder.append(_firstUpper_34, "");
                                    _builder.append("(input.get");
                                    String _name_91 = aFeature_1.getName();
                                    String _firstUpper_35 = StringExtensions.toFirstUpper(_name_91);
                                    _builder.append(_firstUpper_35, "");
                                    _builder.append("());");
                                    _builder.newLineIfNotEmpty();
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          _builder.append("// Handle non-containment references");
                          _builder.newLine();
                          {
                            if (((aFeature_1 instanceof EReference) && (!((EReference) aFeature_1).isContainment()))) {
                              EClassifier _eType_23 = aFeature_1.getEType();
                              String _name_92 = _eType_23.getName();
                              String _concat_26 = emfPrefix.concat(_name_92);
                              _builder.append(_concat_26, "");
                              _builder.append(" ");
                              String _name_93 = aFeature_1.getName();
                              _builder.append(_name_93, "");
                              _builder.append("Proxy = ");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t");
                              _builder.append("(");
                              EClassifier _eType_24 = aFeature_1.getEType();
                              String _name_94 = _eType_24.getName();
                              String _concat_27 = emfPrefix.concat(_name_94);
                              _builder.append(_concat_27, "\t");
                              _builder.append(")getEObject(input.get");
                              String _name_95 = aFeature_1.getName();
                              String _firstUpper_36 = StringExtensions.toFirstUpper(_name_95);
                              _builder.append(_firstUpper_36, "\t");
                              _builder.append("().toString());");
                              _builder.newLineIfNotEmpty();
                              _builder.append("output.set");
                              String _name_96 = aFeature_1.getName();
                              String _firstUpper_37 = StringExtensions.toFirstUpper(_name_96);
                              _builder.append(_firstUpper_37, "");
                              _builder.append("(");
                              String _name_97 = aFeature_1.getName();
                              _builder.append(_name_97, "");
                              _builder.append("Proxy);");
                              _builder.newLineIfNotEmpty();
                            } else {
                              _builder.append("output.set");
                              String _name_98 = aFeature_1.getName();
                              String _firstUpper_38 = StringExtensions.toFirstUpper(_name_98);
                              _builder.append(_firstUpper_38, "");
                              _builder.append("(convert");
                              EClassifier _eType_25 = aFeature_1.getEType();
                              String _name_99 = _eType_25.getName();
                              _builder.append(_name_99, "");
                              _builder.append("(input.get");
                              String _name_100 = aFeature_1.getName();
                              String _firstUpper_39 = StringExtensions.toFirstUpper(_name_100);
                              _builder.append(_firstUpper_39, "");
                              _builder.append("()));");
                              _builder.newLineIfNotEmpty();
                            }
                          }
                        }
                      }
                    }
                    _builder.append("}");
                    _builder.newLine();
                  }
                }
              }
            }
            _builder.newLine();
            _builder.append("\t");
            _builder.append("return output;");
            _builder.newLine();
            _builder.append("}");
            _builder.newLine();
          }
        }
      }
    }
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private EObject getEObject(String input) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("EObject rvalue = null;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("String");
    _builder.append("«", "\t\t");
    _builder.append("]", "\t\t");
    _builder.append(" pieces = input.split(\" \");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("if (pieces.length == 3) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("String ns = pieces");
    _builder.append("«", "\t\t\t");
    _builder.append("0");
    _builder.append("]", "\t\t\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("String className = pieces");
    _builder.append("«", "\t\t\t");
    _builder.append("1");
    _builder.append("]", "\t\t\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("String fragment = pieces");
    _builder.append("«", "\t\t\t");
    _builder.append("2");
    _builder.append("]", "\t\t\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("EPackage pkg = EPackage.Registry.INSTANCE.getEPackage(ns);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("if (pkg != null) {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("EClassifier classifier = pkg.getEClassifier(className);");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("if (classifier instanceof EClass) {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("InternalEObject eobject = (InternalEObject) EcoreUtil");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append(".create((EClass) classifier);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("URI uri = URI.createURI(fragment);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("eobject.eSetProxyURI(uri);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("rvalue = eobject;");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return rvalue;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private StringBuilder builder = new StringBuilder();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private String getURI(EObject eobject) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if(eobject.eResource() == null)");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("throw new NullPointerException(\"child object not contained in a resource\");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("builder.setLength(0);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("builder.append(eobject.eClass().getEPackage().getNsURI());");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("builder.append(\" \");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("builder.append(eobject.eClass().getName());");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("builder.append(\" \");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("builder.append(EcoreUtil.getURI(eobject));");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return builder.toString();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    fsa.generateFile("ConvertEMFtoAvro.java", _builder);
  }
}
