/*******************************************************************************
 * Copyright (c) 2014 Langley Studios
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Langley Studios - initial API and implementation
 *******************************************************************************/
package net.langleystudios.avro;

import org.apache.avro.Schema;
import org.eclipse.emf.ecore.EObject;

public interface AvroEMFConverter {
	
	EObject convertAvroObject(Object object);
	
	Object convertEObject(EObject eobject);

	Schema getSchema();
}
