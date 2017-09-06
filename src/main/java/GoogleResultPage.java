import org.openqa.selenium.WebDriver;

public class GoogleResultPage extends Data{
    public GoogleResultPage(WebDriver driver){
        this.driver = driver;
    }
    private String firstResult=".//*[@id='rso']/div/*/div[contains(.,'wix.com')]/div/div/h3";
    public WixMainPage getWixMainPage(){
        click(firstResult);
        return new WixMainPage(driver);
    }
}
