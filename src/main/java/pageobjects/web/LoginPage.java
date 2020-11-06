package pageobjects.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.ConfigWeb;
import utils.FakerValues;
import utils.WebUtils;

public class LoginPage extends ConfigWeb {

    @FindBy(xpath = "//*[contains(@class, 'txt2 bo1')]")
    private WebElement link;

    @FindBy(className = "txt2 bo1")
    private WebElement btnLogin;

    @FindBy(xpath = "//input[@class= 'input100']")
    private WebElement userField;

    @FindBy(xpath = "//*[@name = 'pass']")
    private WebElement passField;

    @FindBy(xpath = "//*[@name = 'confirmpass']")
    private WebElement confirmPassField;

    @FindBy(xpath = "//span[contains(text(),'Login')]")
    private WebElement loginText;

    @FindBy(xpath = "//span[contains(text(),'Cadastre-se')]")
    private WebElement cadastroText;

    @FindBy(xpath = "//img")
    private WebElement inmLogo;

    @FindBy(xpath = "//button[contains(@class, 'login100-form-btn')]")
    private WebElement btn;

    @FindBy(xpath = "//div[contains(text(),'Senhas não combinam')]")
    private WebElement textSenhasDivergentes;

    @FindBy(xpath = "//div[@role='alert']")
    private WebElement errorText;

    WebUtils webUtils;
    FakerValues faker;
    WebDriver driver;

    public LoginPage() {
        this.webUtils = new WebUtils();
        this.driver = getDriver();
        PageFactory.initElements(driver, this);
        this.faker = new FakerValues();
    }

    public void acessLoginPage(String site) {
        driver.get(site);
    }

    public void validateWebPage() {
        ExpectedConditions.elementToBeSelected(inmLogo);
    }

    public void clickCadastro() {
        webUtils.clickElement(link);
    }

    public void setUsuario(int lenghtName) {
        webUtils.setText(userField, faker.getName(lenghtName));
    }

    public void setSenha() {
        String pass = faker.getPass();
        webUtils.setText(passField, pass);
        webUtils.setText(confirmPassField, pass);
    }

    public void setSenhaErrada() {
        webUtils.setText(passField, faker.getPass());
        webUtils.setText(confirmPassField, faker.getPass());
    }

    public void clickCadastrar() {
        webUtils.clickElement(btn);
    }

    public void validarCadastro() {
        webUtils.validateElement(loginText);
    }

    public void validarAlerta() {
        webUtils.validateAlert();
    }

    public void validarSenhaDivergente() {
        webUtils.validateElement(textSenhasDivergentes);
    }

    public void realizarLogin(String user, String pass){
        webUtils.setText(userField, user);
        webUtils.setText(passField, pass);
        webUtils.clickElement(btn);
    }

    public void validaLogin(){
        webUtils.validateElement(inmLogo);
    }

    public void validaErroLogin(){
        webUtils.validateElement(errorText);
    }

}
