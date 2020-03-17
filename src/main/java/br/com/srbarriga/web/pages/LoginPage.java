package br.com.srbarriga.web.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	

	@FindBy(id = "email")
	private WebElement inputUser;
	
	@FindBy(id = "senha")
	private WebElement inputPass;
	
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	private WebElement buttonLogin;

	@FindBy(xpath = "//div[@class='alert alert-success']")
	private WebElement mensagemSucesso;
	
	
	public LoginPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}
	

	// **********************getter and setters**********************//


	public WebElement getMensagemSucesso() {
		return mensagemSucesso;
	}

	public WebElement getInputUser() {
		return inputUser;
	}

	public void setInputUser(WebElement inputUser) {
		this.inputUser = inputUser;
	}

	public WebElement getInputPass() {
		return inputPass;
	}

	public void setInputPass(WebElement inputPass) {
		this.inputPass = inputPass;
	}


	public WebElement getBtnLogin() {
		return buttonLogin;
	}


}
