package br.com.srbarriga.web.funcionalidades;

import br.com.srbarriga.utils.commons.BaseTest;
import br.com.srbarriga.web.funcionalidades.users.utils.UserCredentials;
import br.com.srbarriga.web.pages.HomePage;
import br.com.srbarriga.web.pages.LoginPage;

public class LoginFuncionalidade extends BaseTest {

	private LoginPage loginPage;
	private HomePage homePage;
	private String usuario;

	public LoginFuncionalidade(){
		this.loginPage = new LoginPage(webDriver);
		this.homePage = new HomePage(webDriver);
	}

	public void loginAplicacao(String user) {
		user = "USUARIO_"+user;
		usuario = UserCredentials.valueOf(user.replace(" ", "_").toUpperCase()).nome();
		this.loginPage.getInputUser().sendKeys(UserCredentials.valueOf(user.replace(" ", "_").toUpperCase()).user());
		this.loginPage.getInputPass().sendKeys(UserCredentials.valueOf(user.replace(" ", "_").toUpperCase()).password());
		addEvidenciaWeb("Usuario e senha inseridos.");
		this.loginPage.getBtnLogin().click();
	}

	public boolean retornaMensagemDeSucesso(){
		addEvidenciaWeb("Mensagem de sucesso");
		return this.homePage.getMensagemSucesso().getText().equals("Bem vindo, " + usuario + "!");
	}




}
