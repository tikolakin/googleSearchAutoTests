import org.openqa.selenium.support.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.*;

public class GoogleBasePage extends BasePage
{
    public String domainUrl = "https://www.google.com.ua";

    @Override
    public GoogleBasePage open(String path)
    {
      driver.get(domainUrl + '/' + path);
      return this;
    }
}
