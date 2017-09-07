import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class OpenUrl extends TestInit
{

    @Test
    public void openUrl() throws Exception {
        GoogleHomePage googleHomePage = new GoogleHomePage(driver);
        googleHomePage.open();
        GoogleResultPage googleResults = googleHomePage.findByText("Wix");
        googleResults.followLinkToSite("Wix:");
        WixHomePage wixMainPage = new WixHomePage(driver);
        assertEquals("Wix", wixMainPage.getTextFromLogo());
    }

}
