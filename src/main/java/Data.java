import org.openqa.selenium.support.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.*;

public class Data {
    static WebDriver driver;
    protected String DOMAIN_URL = "https://www.google.com";

    public void click(String clickXpath){
        driver.findElement(By.xpath(clickXpath)).click();
    }
    public void sendText(String inputText,String sendXpath){
        driver.findElement(By.xpath(sendXpath)).sendKeys(inputText);
    }
    public String getText (String inputXpath){
        return driver.findElement(By.xpath(inputXpath)).getText();
    }
    protected static void selectionByText(String inputXpath, String inputSelector) {
        new Select(driver.findElement(By.xpath(inputXpath))).selectByVisibleText(inputSelector);
    }
    protected static void selectionByValue(String inputXpath, String inputSelector) {
        new Select(driver.findElement(By.xpath(inputXpath))).selectByValue(inputSelector);
    }
    public void waitFor(String locator) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }
}
