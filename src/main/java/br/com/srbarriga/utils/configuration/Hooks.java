
package br.com.srbarriga.utils.configuration;

import br.com.srbarriga.utils.commons.BaseTest;
import br.com.srbarriga.utils.commons.PropertiesManager;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * @since 2020-02-11
 */
public class Hooks extends BaseTest {
	@Before(value = "@web")
	public void beforeScenarioWebWindows() {
		System.out.println("Teste execução Hooks Web");
		initializeWebApplication(Web.CHROME_WINDOWS);
		webDriver.get(PropertiesManager.getPropertiesValue("URL_SRBARRIGA"));
	}

	@After(value = "@web")
	public void afterScenarioWeb(Scenario scenario) {
		generateEvidence(scenario);
		evidenceList.clear();
		closeWeb();
	}
}