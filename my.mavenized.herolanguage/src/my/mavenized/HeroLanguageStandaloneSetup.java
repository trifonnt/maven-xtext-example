/*
* generated by Xtext
*/
package my.mavenized;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class HeroLanguageStandaloneSetup extends HeroLanguageStandaloneSetupGenerated{

	public static void doSetup() {
		new HeroLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

