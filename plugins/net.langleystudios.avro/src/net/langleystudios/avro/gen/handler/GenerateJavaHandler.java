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
package net.langleystudios.avro.gen.handler;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import org.apache.avro.tool.SpecificCompilerTool;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The GenerateJavaHandler will use the Avro Tools package to generate java source
 * for an Apache Avro schema.  The command is enabled by the selection of a single
 * Avro Schema or a directory containing Avro Schemas.
 * 
 * @author jlangley
 *
 */
public class GenerateJavaHandler {

	private static final Logger logger = LoggerFactory.getLogger(GenerateJavaHandler.class);
	
	private static final String extension = "avsc";
	private IResource selectedResource;

	@Execute
	public void execute() {

		ContainerSelectionDialog dialog = new ContainerSelectionDialog(Display
				.getCurrent().getActiveShell(), null, true,
				"Select a folder to contain the generated java");
		if (dialog.open() == ContainerSelectionDialog.OK) {
			Object[] results = dialog.getResult();
			if (results != null && results.length > 0) {
				Object first = results[0];
				if (first instanceof IPath) {
					IPath path = (IPath) first;
					IWorkspace workspace = ResourcesPlugin.getWorkspace();
					IWorkspaceRoot workspaceRoot = workspace.getRoot();
					IResource selectedDirectory = workspaceRoot
							.findMember(path);
					java.net.URI fileURI = selectedDirectory.getLocationURI();
					File locationFile = new File(fileURI);

					if (selectedResource instanceof IContainer) {
						IContainer container = (IContainer) selectedResource;
						try {
							for (IResource resource : container.members()) {
								if (extension.equals(resource
										.getFileExtension())) {

									IResource schemaResource = workspaceRoot
											.findMember(resource.getFullPath()
													.toFile().toString());

									if (selectedDirectory != null) {
										java.net.URI schemaURI = schemaResource
												.getLocationURI();
										File schemaFile = new File(schemaURI);

										generateCode(schemaFile, locationFile);

									}
								}
							}
						} catch (CoreException e) {
							e.printStackTrace();
						}
					} else {
						IResource schemaResource = workspaceRoot
								.findMember(selectedResource.getFullPath()
										.toFile().toString());

						if (selectedDirectory != null) {
							java.net.URI schemaURI = schemaResource
									.getLocationURI();
							File schemaFile = new File(schemaURI);

							generateCode(schemaFile, locationFile);

						}
					}
				}
			}
		}
	}

	public synchronized static void generateCode(File schemaFile, File locationFile) {
		try {
			SpecificCompilerTool tool = new SpecificCompilerTool();
			List<String> args = new ArrayList<String>();
			args.add("schema");
			args.add(schemaFile.getAbsolutePath());
			args.add(locationFile.getAbsolutePath());
			tool.run(System.in, System.out, System.err, args);
		} catch (Exception e) {
			logger.error("Problem generating java code for {}", schemaFile.getName());
			logger.error(e.getMessage());
		}
	}

	@CanExecute
	public boolean canExecute(
			@Optional @Named(IServiceConstants.ACTIVE_SELECTION) ISelection selection) {
		boolean rvalue = false;
		selectedResource = null;

		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structured = (IStructuredSelection) selection;
			Object object = structured.getFirstElement();
			if (object instanceof IContainer) {
				IContainer container = (IContainer) object;
				try {
					for (IResource resource : container.members()) {
						if (extension.equals(resource.getFileExtension())) {
							selectedResource = container;
							rvalue = true;
							break;
						}
					}
				} catch (CoreException e) {
					e.printStackTrace();
				}
			} else if (object instanceof IResource) {
				IResource resource = (IResource) object;
				if (extension.equals(resource.getFileExtension())) {
					selectedResource = resource;
					rvalue = true;
				}
			}
		}
		return rvalue;
	}

}