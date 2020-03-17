package br.com.srbarriga.web.pages;

import br.com.srbarriga.utils.commons.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseTest {

    public HomePage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//div[@class='alert alert-success']")
    private WebElement mensagemSucesso;

    public WebElement getMensagemSucesso() {
        return mensagemSucesso;
    }

}
