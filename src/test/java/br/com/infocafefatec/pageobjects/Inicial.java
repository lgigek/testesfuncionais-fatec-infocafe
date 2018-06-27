package br.com.infocafefatec.pageobjects;

import org.openqa.selenium.By;

import br.com.lgigek.thrall.core.Browser;
import br.com.lgigek.thrall.core.Element;
import br.com.lgigek.thrall.scenario.Scenario;

public class Inicial {

	private Browser browser;

	private static final String TITULO = "Cadastro";
	private static final String URI = "/generic/layout/painellist";

	private Element btnSair = new Element(By.cssSelector("a[href='/users/logoff']"));

	public Inicial() {
		browser = Browser.getInstance();
	}

	public void verificarExibicao() {
		if (!browser.getTabTitle().equals(TITULO) || !browser.getTabUrl().contains(URI))
			Scenario.fail("A tela inicial não foi exibida corretamente");
	}

	public void clicarBotaoSair() {
		btnSair.click();
	}

}
