package tests_with_login;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.LoginPage;
import utilities.PropertyManager;

import java.util.concurrent.TimeUnit;

public class BaseTestWithLogin {
    public WebDriver driver;
    public ChromeOptions options;
    public LoginPage logInPage;



    @Before
    public void setup (){
        options = new ChromeOptions();
        options.addArguments("--disable-notification");

        System.setProperty("webdriver.chrome.driver",
                PropertyManager.getInstance().getDriverPath());

        driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(PropertyManager.getInstance().getURL());

        logInPage = new LoginPage(driver);

        logInPage.login();
    }
    @After
    public void teardown(){
        driver.quit();
    }

    protected void logInPage(){

    }
}

