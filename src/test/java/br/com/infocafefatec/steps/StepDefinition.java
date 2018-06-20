package br.com.infocafefatec.steps;

import br.com.infocafefatec.pageobjects.Inicial;
import br.com.infocafefatec.pageobjects.Login;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class StepDefinition {

	Login poLogin = new Login();
	Inicial poInicial = new Inicial();

	@Dado("^Que o usuário está na página de login$")
	public void acessarTelaLogin() {
		poLogin.acessarTelaLogin();
	}

	@Dado("^Que o usuário já está autenticado$")
	public void autenticarComUsuarioExistente() {
		poLogin.acessarTelaLogin();
		poLogin.autenticar("existente");
	}

	@Quando("^O usuário realiza login com um usuário (.*)$")
	public void realizarLogin(String perfil) {
		poLogin.autenticar(perfil);
	}

	@Quando("^Clica em \"Sair\"$")
	public void clicarBotaoSair() {
		poInicial.clicarBotaoSair();
	}

	@Quando("^Digita o um valor no campo usuário$")
	public void preencherCampoUsuario() {
		poLogin.preencherUsuario();
	}

	@Quando("^Digita o um valor no campo senha$")
	public void preencherCampoSenha() {
		poLogin.preencherSenha();
	}

	@Então("^O usuário é direcionado para a página inicial$")
	public void verificarDirecionamentoPaginaInicial() {
		poInicial.verificarExibicao();
	}

	@Então("^O usuário é direcionado para a tela de login$")
	public void verificarDirecionamentoPaginaLogin() {
		poLogin.verificarExibicao();
	}

	@E("^Clica em \"Entrar\"$")
	public void clicarEntrar() {
		poLogin.clicarBotaoEntrar();
	}

	@E("^É exibida uma mensagem de erro$")
	public void verificarMensagemErro() {

	}

}
