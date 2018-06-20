package br.com.infocafefatec.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import br.com.lgigek.core.Browser;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format = { "pretty",
		"html:results/infocafe" }, glue = "br.com.infocafefatec.steps", features = "classpath:features/info-cafe")
public class InfoFatecRunner {

	static Browser browser;

	@BeforeClass
	public static void setUp() {
		browser = Browser.createChromeInstance(null, null);
		browser.maximize();
	}

	@AfterClass
	public static void tearDown() {
		browser.closeWindow();
	}
}
