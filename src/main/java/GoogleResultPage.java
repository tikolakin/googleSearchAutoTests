import org.openqa.selenium.WebDriver;

public class GoogleResultPage extends BasePage
{
    private String path = "/search";
    
    public BasePage followLinkToSite(String linkText)
    {
        return clickLinkByText(linkText);
    }
}
