package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

/**
 * Created by Bilal on 08-02-2017.
 */
public class CommonAPI {
    public WebDriver driver = null;

    @Parameters({"useCloudEnv","cloudEnv","os","browserName","url"})
    @BeforeMethod
    public void setUp(String useCloudEnv, String cloudEnv, String os, String browserName, String url){
        if(useCloudEnv.equals("true")){
            //create cloud driver here
        }else if(useCloudEnv.equals("false")){
            //local driver here
            if(browserName.equals("chrome")){
                System.setProperty("webdriver.chrome.driver", "../Generic/drivers/chromedriver");
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--kiosk");
                driver = new ChromeDriver(chromeOptions);
            }
            if (browserName.equalsIgnoreCase("firefox")){
                //create firefox driver here
            }
        }
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(35, TimeUnit.SECONDS);
        driver.get(url);
//        driver.manage().window().fullscreen();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    public void typeByXpath(String locator, String value) {
        try {
            driver.findElement(By.xpath(locator)).sendKeys(value);
        } catch (Exception ex) {
            driver.findElement(By.xpath(locator)).click();
        }
    }
    public void clickByXpath(String locator) {
        try {
            driver.findElement(By.xpath(locator)).click();
        }catch (Exception ex){
            driver.findElement(By.xpath(locator)).click();
        }
    }
    public String getTextByXpath(String locator){
        String st = driver.findElement(By.xpath(locator)).getText();
        return st;
    }
}
