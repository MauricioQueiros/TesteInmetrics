package pageobjects.web;

import com.sun.tracing.dtrace.FunctionName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ConfigWeb;
import utils.WebUtils;

public class ExcluirFuncionarioPage extends ConfigWeb {

    @FindBy(xpath = "//input[@type='search']")
    private WebElement searchBox;

    @FindBy(xpath = "//tbody/tr[1]/td[6]/a[1]/button")
    private WebElement trashButton;

    @FindBy(xpath = "//tbody/tr[1]/td[1]")
    private WebElement name;

    @FindBy(xpath = "//div[@role='alert']")
    private WebElement sucessText;


    WebUtils webUtils;
    WebDriver driver;

    public ExcluirFuncionarioPage(){
        this.webUtils = new WebUtils();
        this.driver = getDriver();
        PageFactory.initElements(driver, this);
    }

    public void serchEmployee(){
        webUtils.setText(searchBox, webUtils.getText(name));
    }

    public void clickDelete(){
        webUtils.clickElement(trashButton);
    }

    public void validarEclusao(){
        webUtils.validateElement(sucessText);
    }
}
