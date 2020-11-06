package utils;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WebUtils extends ConfigWeb{

    WebDriver driver;

    public WebUtils() {
        this.driver = getDriver();
        PageFactory.initElements(driver, this);
    }

    public void clickElement(WebElement element) {
        try {
            element.click();
        } catch (Exception e) {
            Assert.fail("Não foi possível clicar no elemento");
        }
    }

    public void clickElement(By by){
        driver.findElement(by).click();
    }

    public void setText(WebElement element, String text) {
        try {
            element.click();
            element.sendKeys(text);
        } catch (Exception e) {
            Assert.fail("Não foi possível enviar o texto para elemento");
        }
    }

    public void setText(WebElement element, int text) {
        try {
            element.sendKeys(String.valueOf(text));
        } catch (Exception e) {
            Assert.fail("Não foi possível enviar o texto para elemento");
        }
    }

    public void setText(WebElement element, double text) {
        try {
            element.sendKeys(String.valueOf(text));
        } catch (Exception e) {
            Assert.fail("Não foi possível enviar o texto para elemento");
        }
    }

    public void validateElement(WebElement element) {
        try {
            ExpectedConditions.visibilityOf(element);
        } catch (Exception e) {
            Assert.fail("Não foi possível localizar o para elemento");
        }
    }

    public void validateAlert() {
        try {
            ExpectedConditions.alertIsPresent();
        } catch (Exception e) {
            Assert.fail("Não foi possível localizar o para elemento");
        }
    }

    public String getText(WebElement element){
        return element.getText();
    }

    public void clearText(WebElement element){
        element.clear();
    }
}
