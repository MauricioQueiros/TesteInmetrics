package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class ConfigWeb {

    WebDriver driver;

    public ConfigWeb(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        this.driver = new ChromeDriver();
        PageFactory.initElements(driver, this);
    }

    public WebDriver getDriver(){return driver;}
}
