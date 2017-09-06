import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;

public class OpenUrl extends Test
{

    @Test
    public void openUrl(){
        GoogleHomePage googleHomePage = new GoogleHomePage(driver);
        googleHomePage.open();
        GoogleResultPage googleResults = googleHomePage.findByText("Wix");
        googleResults.followLinkToSite("https://www.wix.com/");
        WixHomePage wixMainPage = new WixHomePage(driver);
        assertEquals("Wix", wixMainPage.getTextFromLogo());
    }

}
