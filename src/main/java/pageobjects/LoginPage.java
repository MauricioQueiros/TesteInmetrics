package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.FakerValues;
import utils.WebUtils;

public class LoginPage {

    @FindBy(xpath = "//*[contains(@class, 'txt2 bo1')]")
    private WebElement link;

    @FindBy(className = "txt2 bo1")
    private WebElement btnLogin;

    @FindBy(xpath = "//*[contains(@name, 'username')]")
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

    @FindBy(xpath = "/html/body/div/div/div/form/div[7]/button")
    private WebElement btn;

    @FindBy(xpath = "//div[contains(text(),'Senhas não combinam')]")
    private WebElement textSenhasDivergentes;

    WebUtils webUtils;
    WebDriver driver;
    FakerValues faker;

    public LoginPage() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        this.webUtils = new WebUtils();
        this.driver = new ChromeDriver();
        PageFactory.initElements(driver, this);
        this.faker = new FakerValues();
    }


    public void acessLoginPage(String site) {
        driver.manage().window().maximize();

        driver.get(site);
    }

    public void validateWebPage() {
        ExpectedConditions.elementToBeSelected(inmLogo);
    }

    public void clickCadastro() {
        link.click();
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

    public void validarCadatro() {
        webUtils.validateElement(loginText);
    }

    public void validarAlerta() {
        webUtils.validateAlert();
    }

    public void validarSenhaDivergente() {
        webUtils.validateElement(textSenhasDivergentes);
    }

}
