import org.openqa.selenium.WebDriver;

public class GoogleResultPage extends BasePage {
    private String path = "/search";

    GoogleResultPage(WebDriver driver) {
        super(driver);
    }

    public BasePage followLinkToSite(String linkText) {
        clickLinkByText(linkText);
        return new BasePage(driver);
    }
}
