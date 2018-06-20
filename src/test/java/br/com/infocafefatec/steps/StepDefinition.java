package br.com.infocafefatec.steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class StepDefinition {

	@Dado("^Que o usuário está na página de login$")
	public void acessarTelaLogin() {
		
	}

	@Dado("^Que o usuário já está autenticado$")
	public void autenticarComUsuarioValido() {

	}

	@Quando("^O usuário realiza login com um usuário (.*)$")
	public void realizarLogin(String perfil) {

	}

	@Quando("^Clica em \"Sair\"$")
	public void clicarBotaoSair() {

	}

	@Quando("^Digita o um valor no campo senha$")
	public void preencherCampoSenha() {

	}

	@Quando("^Digita o um valor no campo usuário$")
	public void preencherCampoUsuario() {

	}

	@Então("^O usuário é direcionado para a página inicial$")
	public void verificarDirecionamentoPaginaInicial() {

	}

	@Então("^O usuário é direcionado para a tela de login$")
	public void verificarDirecionamentoPaginaLogin() {

	}

	@E("^Clica em \"Entrar\"$")
	public void clicarEntrar() {

	}

	@E("^É exibida uma mensagem de erro$")
	public void verificarMensagemErro() {

	}

}
