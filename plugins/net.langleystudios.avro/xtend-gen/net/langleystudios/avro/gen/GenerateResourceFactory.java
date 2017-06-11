/**
 * Copyright (c) 2014 Langley Studios
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Langley Studios - initial API and implementation
 */
package net.langleystudios.avro.gen;

import net.langleystudios.avro.gen.Utility;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;

@SuppressWarnings("all")
public class GenerateResourceFactory {
  public void generateResourceFactory(final EPackage anEPackage, final IFileSystemAccess fsa) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackage = Utility.getBasePackage();
    _builder.append(_basePackage, "");
    _builder.append(".avro;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import net.langleystudios.avro.ecore.AvroResource;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.eclipse.emf.common.util.URI;");
    _builder.newLine();
    _builder.append("import org.eclipse.emf.ecore.resource.Resource;");
    _builder.newLine();
    _builder.append("import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class AvroResourceFactory extends ResourceFactoryImpl {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Constructor for AvroResourceFactory.");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public AvroResourceFactory() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("super();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Resource createResource(URI uri) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("AvroResource resource = new AvroResource(uri);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("resource.setClassLoader(");
    String _basePackage_1 = Utility.getBasePackage();
    String _package = Utility.getPackage();
    String _concat = _basePackage_1.concat(_package);
    _builder.append(_concat, "\t\t");
    _builder.append(".class.getClassLoader());");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("ConvertEMFtoAvro converter = new ConvertEMFtoAvro();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("resource.setConverter(converter);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return resource;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    fsa.generateFile(
      "AvroResourceFactory.java", _builder);
  }
}
