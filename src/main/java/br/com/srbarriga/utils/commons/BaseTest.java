package br.com.srbarriga.utils.commons;


import br.com.srbarriga.utils.configuration.WebApplication;
import br.com.srbarriga.utils.reports.evidence.Evidence;
import br.com.srbarriga.utils.reports.evidence.SeleniumEvidence;
import cucumber.api.Scenario;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author
 * @since 2020-02-11
 */
public class BaseTest {

    protected static AndroidDriver<WebElement> driver;
    protected static AndroidDriver<WebElement> webViewDriver;
    protected static WebDriver webDriver;
    protected static List<SeleniumEvidence> evidenceList = new ArrayList<SeleniumEvidence>();
    protected static WebDriverWait wait;
    protected static WebDriverWait shortWait;
    protected static boolean initialized;

    public static Evidence evidence;

    public void setCtName(String ctName) {
        evidence.setCtName(ctName);
    }

    public void setCiclo(String cycle) {
        evidence.setCiclo(cycle);
    }

    public void setTester(String tester) {
        evidence.setTester(tester);
    }

    public void setCtNumber(String ctNumber) {
        evidence.setCtNumber(ctNumber);
    }

    public void initializeEvidence() {
        BaseTest.evidence = new Evidence(evidenceList);
    }

    /**
     * Inicializa o {@code WebDriver} e o {@code WebDriverWait}
     */
    protected void initializeWebApplication(WebApplication webApplication) {
        webDriver = webApplication.getDriver();
        webDriver.manage().window().fullscreen();
        wait = new WebDriverWait(webDriver, 80);
    }

    /**
     * Método para adicionar na evidência web
     *
     * @param mensagem
     */
    protected void addEvidenciaWeb(String mensagem) {
        try {
            evidenceList.add(new SeleniumEvidence("RESULTADO OBTIDO: " + mensagem + "", takeScreenshot(webDriver)));
        } catch (Exception e) {
            System.out.println("Erro ao adicionar na evidência: " + e.getMessage());
            e.printStackTrace();
        }

    }

    /**
     * Gera evidência
     */
    protected void generateEvidence(Scenario scenario) {
        try {
            evidence.generateEvidence(scenario);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Adiciona o erro.
     *
     * @param e
     */
    protected void setError(Throwable e) {
        evidence.setError(e, driver);
    }

    /**
     * fecha o driver web
     */
    protected static void closeWeb() {
        webDriver.quit();
    }

    /**
     * tira prints
     *
     * @param driver
     */
    private String takeScreenshot(WebDriver driver) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
    }
}
