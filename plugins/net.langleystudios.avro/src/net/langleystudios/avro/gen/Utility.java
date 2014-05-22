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
package net.langleystudios.avro.gen;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;

public class Utility {
	
	private ArrayList<String> list = new ArrayList<String>();

	public void startList(EClass eclass) {
		list.clear();
		StringBuilder builder = new StringBuilder();
		builder.setLength(0);
		EPackage epackage = eclass.getEPackage();
		builder.append(epackage.getNsURI());
		builder.append("/");
		builder.append(epackage.getName());
		builder.append('.');
		builder.append(eclass.getName());
		list.add(builder.toString());
	}
	
	public void printFeature(EStructuralFeature feature)
	{
		System.out.println(feature.getName());
	}
	
	public void printClass(EClass eclass)
	{
		System.out.println(eclass.getName());
	}
	
	public boolean addClass(EClass eclass) {
		StringBuilder builder = new StringBuilder();
		builder.setLength(0);
		EPackage epackage = eclass.getEPackage();
		builder.append(epackage.getNsURI());
		builder.append("/");
		builder.append(epackage.getName());
		builder.append('.');
		builder.append(eclass.getName());
		if (list.contains(builder.toString())) {
			return false;
		} else {
			list.add(builder.toString());
		}
		return true;
	}
}
