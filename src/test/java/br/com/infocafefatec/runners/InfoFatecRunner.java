package br.com.infocafefatec.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format = { "pretty",
		"html:results/infocafe" }, glue = "br.com.infocafefatec.steps", features = "classpath:features/info-cafe")
public class InfoFatecRunner {
}
