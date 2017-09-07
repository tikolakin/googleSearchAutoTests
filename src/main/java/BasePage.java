import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage
{
    public String domainUrl;
    public String path;

    public WebDriver driver;


    public BasePage(WebDriver driver) {
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
        String xpath = ".//a[contains(text(), '" + linkText + "')]";
        click(xpath);
    }

    public void sendText(String inputText, String sendXpath)
    {
        driver.findElement(By.xpath(sendXpath)).sendKeys(inputText);
    }

    public String getText(String inputXpath)
    {
        return driver.findElement(By.xpath(inputXpath)).getText();
    }
}
