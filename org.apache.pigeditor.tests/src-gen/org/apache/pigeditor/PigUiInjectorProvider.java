/*
* generated by Xtext
*/
package org.apache.pigeditor;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class PigUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.apache.pigeditor.ui.internal.PigActivator.getInstance().getInjector("org.apache.pigeditor.Pig");
	}
	
}
