import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;

 class WixHomePage extends BasePage
 {
    public String domainUrl = "http://www.wix.com/";
    private String path = "";

    private String logoPath = ".//*[@id='wm-logo']";
    private final String brandName = "Wix";

    public WixHomePage open()
    {
      super.open(this.domainUrl + "/" + this.path);
      return this;
    }

    public void verifyPage()
    {
        assertEquals("Current page is not Wix page.", brandName, getText(logoPath));
    }

    public String getTextFromLogo(){
        return String getText(logoPath);
    }

}
