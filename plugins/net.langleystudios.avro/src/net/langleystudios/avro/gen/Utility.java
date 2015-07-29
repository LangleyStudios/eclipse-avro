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
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;

public class Utility {
	
	private ArrayList<String> classList = new ArrayList<String>();
	private ArrayList<String> enumList = new ArrayList<String>();

	private static String basePackage = "org.eclipse.emf.examples";
	private static String packageName = "EXTLibraryPackage";
	private static String factoryName = "EXTLibraryFactory";
	
	public static String getBasePackage() {
		return Utility.basePackage;
	}
	
	public static String getPackage() {
		return Utility.packageName;
	}
	
	public static String getFactory() {
		return Utility.factoryName;
	}
	
	public static void setBasePackage(String prefix)
	{
		Utility.basePackage = prefix;
	}
	
	public static void setPackage(String packageName) {
		Utility.packageName = packageName;
	}
	
	public static void setFactory(String factoryName) {
		Utility.factoryName = factoryName;
	}
	
	public void startList(EClass eclass) {
		classList.clear();
		enumList.clear();
		StringBuilder builder = new StringBuilder();
		builder.setLength(0);
		EPackage epackage = eclass.getEPackage();
		builder.append(epackage.getNsURI());
		builder.append("/");
		builder.append(epackage.getName());
		builder.append('.');
		builder.append(eclass.getName());
		classList.add(builder.toString());
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
		if (classList.contains(builder.toString())) {
			return false;
		} else {
			classList.add(builder.toString());
		}
		return true;
	}
	
	public boolean addEnum(EEnum enumeration) {
		StringBuilder builder = new StringBuilder();
		builder.setLength(0);
		EPackage epackage = enumeration.getEPackage();
		builder.append(epackage.getNsURI());
		builder.append("/");
		builder.append(epackage.getName());
		builder.append('.');
		builder.append(enumeration.getName());
		if (enumList.contains(builder.toString())) {
			return false;
		} else {
			enumList.add(builder.toString());
		}
		return true;
	}
}
