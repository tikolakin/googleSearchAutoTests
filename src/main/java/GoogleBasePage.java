import org.openqa.selenium.WebDriver;

public class GoogleBasePage extends BasePage {
    public String domainUrl = "https://www.google.com.ua";

    public GoogleBasePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public GoogleBasePage open(String path) {
        driver.get(this.domainUrl + '/' + path);
        return this;
    }
}
