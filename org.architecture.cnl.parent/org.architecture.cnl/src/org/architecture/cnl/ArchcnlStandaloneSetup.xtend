/*
 * generated by Xtext 2.14.0
 */
package org.architecture.cnl


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class ArchcnlStandaloneSetup extends ArchcnlStandaloneSetupGenerated {

	def static void doSetup() {
		new ArchcnlStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
