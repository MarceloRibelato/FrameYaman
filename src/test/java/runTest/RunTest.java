package runTest;

import br.com.srbarriga.utils.commons.BaseTest;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, snippets = SnippetType.CAMELCASE, plugin = { "pretty",
		"json:target/cucumber.json" }, features = { ".//src//test//" }, glue = {
				"br.com.srbarriga.web","br.com.srbarriga.utils.configuration" },

//Limpar RunTest antes de subir

        tags = {"@login"})


public class RunTest extends BaseTest {
	@AfterClass
	public static void AfterTests() {
		if (webDriver != null)
			closeWeb();
	}
}