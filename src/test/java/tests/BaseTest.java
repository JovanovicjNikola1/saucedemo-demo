package tests;

import org.junit.After;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.PropertyManager;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    public WebDriver driver;
    public ChromeOptions options;

    @Before
    public void setup (){
        options = new ChromeOptions();
        options.addArguments("--disable-notification");

        System.setProperty("webdriver.chrome.driver", PropertyManager.getInstance().getDriverPath());

        driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(PropertyManager.getInstance().getURL());
    }
    @After
    public void teardown(){
        driver.quit();
    }
}

