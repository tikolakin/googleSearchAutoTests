import org.openqa.selenium.WebDriver;

class WixHomePage extends BasePage {
    private String domainUrl = "http://www.wix.com/";
    private String path = "";

    private String logoPath = ".//*[@id='wm-logo']";
    private final String brandName = "Wix";

    public WixHomePage(WebDriver driver) {
        super(driver);
    }

    public WixHomePage open() throws Exception {
        super.open(this.domainUrl + "/" + this.path);
        verifyPage();
        return this;
    }

    public void verifyPage() throws Exception {
        if (!brandName.equals(getText(logoPath))) {
            throw new Exception("Current page is not Wix page.");
        }
    }

    public String getTextFromLogo() {
        return getText(logoPath);
    }

}
