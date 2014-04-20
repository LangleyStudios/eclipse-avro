package net.langleystudios.avro.gen.handler;

import java.io.File;
import java.util.ArrayList;

import javax.inject.Named;

import net.langleystudios.avro.gen.common.GenerateAvroSchema;

import org.eclipse.acceleo.common.preference.AcceleoPreferences;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;

public class GenerateAvroHandler {

	private static final String extension = "ecore";
	private IResource selectedResource;

	@Execute
	public void execute() {

		ContainerSelectionDialog dialog = new ContainerSelectionDialog(Display
				.getCurrent().getActiveShell(), null, true,
				"Select a folder to contain the generated schemas");
		if (dialog.open() == ContainerSelectionDialog.OK) {
			Object[] results = dialog.getResult();
			if (results != null && results.length > 0) {
				Object first = results[0];
				if (first instanceof IPath) {
					IPath path = (IPath) first;
					IWorkspace workspace = ResourcesPlugin.getWorkspace();
					IWorkspaceRoot workspaceRoot = workspace.getRoot();
					IResource ifile = workspaceRoot.findMember(path);
					if (ifile != null) {
						java.net.URI fileURI = ifile.getLocationURI();
						File locationFile = new File(fileURI);
						URI modelURI = URI.createFileURI(selectedResource
								.getFullPath().toFile().toString());
						try {
							AcceleoPreferences.switchQueryCache(false);
							GenerateAvroSchema generator = new GenerateAvroSchema(
									modelURI, locationFile, new ArrayList<Object>());
							generator.generate(new BasicMonitor());
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
	}

	@CanExecute
	public boolean canExecute(
			@Optional @Named(IServiceConstants.ACTIVE_SELECTION) ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structured = (IStructuredSelection) selection;
			Object object = structured.getFirstElement();
			if (object instanceof IResource) {
				IResource resource = (IResource) object;
				if (extension.equals(resource.getFileExtension())) {
					selectedResource = resource;
					return true;
				}
			}
		}
		selectedResource = null;
		return false;
	}

}