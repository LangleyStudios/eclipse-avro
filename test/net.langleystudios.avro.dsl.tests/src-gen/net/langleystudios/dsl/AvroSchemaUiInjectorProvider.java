/*
* generated by Xtext
*/
package net.langleystudios.dsl;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class AvroSchemaUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return net.langleystudios.dsl.ui.internal.AvroSchemaActivator.getInstance().getInjector("net.langleystudios.dsl.AvroSchema");
	}
	
}
