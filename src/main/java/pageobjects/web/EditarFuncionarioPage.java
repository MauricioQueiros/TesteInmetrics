package pageobjects.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ConfigWeb;
import utils.FakerValues;
import utils.WebUtils;

public class EditarFuncionarioPage extends ConfigWeb {

    @FindBy(xpath = "//input[@type='search']")
    private WebElement searchBox;

    @FindBy(xpath = "//tbody/tr[1]/td[1]")
    private WebElement name;

    @FindBy(xpath = "//tbody/tr[1]/td[6]/a[2]/button")
    private WebElement editButton;

    @FindBy(id = "inputNome")
    private WebElement fieldNome;

    @FindBy(className = "cadastrar-form-btn")
    private WebElement btnEnviar;

    @FindBy(xpath = "//div[@role='alert']")
    private WebElement sucessText;

    WebUtils webUtils;
    FakerValues faker;
    WebDriver driver;

    public EditarFuncionarioPage(){
        this.webUtils = new WebUtils();
        this.driver = getDriver();
        PageFactory.initElements(driver, this);
        this.faker = new FakerValues();
    }

    public void serchEmployee(){
        webUtils.setText(searchBox, webUtils.getText(name));
    }

    public void clickEdit(){
        webUtils.clickElement(editButton);
    }

    public void editEmployee(){
        webUtils.clearText(fieldNome);
        webUtils.setText(fieldNome, faker.getName(10));
        webUtils.clickElement(btnEnviar);
    }

    public void validarSucesso(){
        webUtils.validateElement(sucessText);
    }

}
