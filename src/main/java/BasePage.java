import org.openqa.selenium.support.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.*;

public class BasePage
{
    public String domainUrl;
    public String path;

    public WebDriver driver;

    public BasePage(WebDriver driver)
    {
      this.driver = driver;
    }

    public BasePage open(String path)
    {
      driver.get(domainUrl + '/' + path);
      return this;
    }

    public void click(String clickXpath)
    {
        driver.findElement(By.xpath(clickXpath)).click();
    }

    public void clickLinkByText(String linkText)
    {
        xpath = "//a[text()='" + linkText + "']";
        click(xpath);
        waitAjax();
    }

    public void sendText(String inputText,String sendXpath)
    {
        driver.findElement(By.xpath(sendXpath)).sendKeys(inputText);
    }

    public String getText(String inputXpath)
    {
        return driver.findElement(By.xpath(inputXpath)).getText();
    }

    public void waitFor(String locator)
    {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public void waitAjax(int time = 10)
    {
        new WebDriverWait(WebDriver, time).until(
        webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
        // Wix has jQuery, lets wait untill it finishes the magic on the page.
        webDriver -> ((JavascriptExecutor) webDriver).executeScript("(typeof(jQuery)==\"undefined\" || (0 === jQuery.active && 0 === jQuery(':animated').length))").equals("true"));
    }
}
