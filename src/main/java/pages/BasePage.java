package pages;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 20);
    }

    public void waitVisibility(By elementBy) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    public void click(By elementBy) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();
    }

    public void writeText(By elementBy, String text) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).clear();
        driver.findElement(elementBy).sendKeys(text);
    }

    public String readText(By elementBy) {
        waitVisibility(elementBy);
        return driver.findElement(elementBy).getText();
    }

    public void assertStringEquals(String string, String expectedText) {
        Assert.assertEquals(string, expectedText);
    }

    public String readTextByAttribute(By elementBy, String value) {
        waitVisibility(elementBy);
        WebElement attributeText = driver.findElement(elementBy);
        return attributeText.getAttribute(value);
    }

    public boolean checkVisibilityElement(By elementBy) {
        try {
            driver.findElement(elementBy);
            System.out.print("item is visible. ");

            return true;
        } catch (ElementNotVisibleException e) {
            System.out.print("item is not visible");
            return false;
        }
    }
    public String getText(By elementBy){
        waitVisibility(elementBy);
        WebElement getText = driver.findElement(elementBy);
      return getText.getText();
    }
}

