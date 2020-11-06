package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class ConfigWeb {

    static WebDriver driver;

    public ConfigWeb(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
    }

    public void initDriver(){
        driver = new ChromeDriver();
        PageFactory.initElements(driver, this);
        driver.manage().window().maximize();
    }

    public WebDriver getDriver(){return driver;}

    public void closeDriver(){
        driver.close();
    }
}
