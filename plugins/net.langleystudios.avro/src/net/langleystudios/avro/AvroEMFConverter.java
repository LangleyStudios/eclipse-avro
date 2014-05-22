package net.langleystudios.avro;

import org.apache.avro.Schema;
import org.eclipse.emf.ecore.EObject;

public interface AvroEMFConverter {
	
	EObject convertAvroObject(Object object);
	
	Object convertEObject(EObject eobject);

	Schema getSchema();
}
