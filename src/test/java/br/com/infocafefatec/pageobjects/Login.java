package br.com.infocafefatec.pageobjects;

import org.openqa.selenium.By;

import br.com.lgigek.core.Browser;
import br.com.lgigek.core.Element;
import br.com.lgigek.scenario.Scenario;
import br.com.lgigek.util.PropertiesReader;

public class Login {

	private PropertiesReader propertiesReader;

	private String url;
	private String usuario;
	private String senha;

	private Browser browser;

	private static final String TITULO = "Cadastros";

	private Element txtLogin = new Element(By.cssSelector("#txt_cpf"));
	private Element txtSenha = new Element(By.cssSelector("#txt_password"));

	private Element btnEntrar = new Element(By.cssSelector(".form-control.btn.btn-primary"));
	private Element btnEntrarLoading = new Element(By.cssSelector(".form-control.btn.btn-danger"));

	private Element warnErro = new Element(By.cssSelector("#btn_entrar_message"));

	public Login() {
		browser = Browser.getInstance();

		propertiesReader = new PropertiesReader("application");
		url = propertiesReader.read("url");
	}

	public void verificarExibicao() {
		if (!txtLogin.isDisplayed() || !txtSenha.isDisplayed() || !btnEntrar.isDisplayed()
				|| !browser.getTabTitle().equals(TITULO))
			Scenario.fail("A tela de login não foi exibida corretamente");
	}

	public void acessarTelaLogin() {
		browser.navigate(url);

		verificarExibicao();
	}

	public void autenticar(String perfil) {
		carregarUsuarioESenha(perfil);

		txtLogin.type(usuario);
		txtSenha.type(senha);
		btnEntrar.click();

		btnEntrarLoading.waitForElementToBeNotVisible(10);
	}

	public void preencherUsuario() {
		txtLogin.type("teste");
	}

	public void preencherSenha() {
		txtSenha.type("teste");
	}

	public void clicarBotaoEntrar() {
		btnEntrar.click();
	}

	public void verificarMensagemErro() {
		if(!warnErro.isDisplayed())
			Scenario.fail("Não foi exibida a mensagem de erro no login");
	}
	
	private void carregarUsuarioESenha(String perfil) {
		switch (perfil) {
		case "existente":
			usuario = propertiesReader.read("username");
			senha = propertiesReader.read("password");
			break;

		case "inexistente":
			usuario = "usuario_inexistente";
			senha = "senha_inexistente";
			break;

		default:
			Scenario.fail("Só é possível tentar autenticar um usuário existente ou inexistente");
		}
	}

}
