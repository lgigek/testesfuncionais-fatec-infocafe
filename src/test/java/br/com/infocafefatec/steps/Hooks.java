package br.com.infocafefatec.steps;

import org.openqa.selenium.chrome.ChromeOptions;

import br.com.lgigek.thrall.core.Browser;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	private static Browser browser;

	@Before
	public void setUp(final cucumber.api.Scenario scenario) {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless");
		browser = Browser.createChromeInstance(chromeOptions, null);
	}

	@After
	public void tearDown(final cucumber.api.Scenario scenario) {
		browser.closeWindow();
	}

}
