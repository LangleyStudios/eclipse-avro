package org.eclipse.emf.examples.avro;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import net.langleystudios.avro.AvroEMFConverter;

import org.apache.avro.Schema;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.EList;

public class ConvertEMFtoAvro implements AvroEMFConverter {

public Schema getSchema() {
	List<Schema> schemaList = new ArrayList<Schema>();
	Schema unionSchema = Schema.createUnion(schemaList);
	return unionSchema;
}

public Object convertEObject(EObject eobject) {
	return null;
}


public EObject convertAvroObject(Object object) {
	return null;
}


}
