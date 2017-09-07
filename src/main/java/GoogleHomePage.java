import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class GoogleHomePage extends GoogleBasePage {
    private String path = "";

    private String searchField = ".//input[@name='q']";
    private String hintList = ".//ul[@role='listbox']";

    GoogleHomePage(WebDriver driver) {
        super(driver);
    }

    public GoogleHomePage open() throws Exception {
        super.open(this.path);
        verifyPage();
        return this;
    }

    public void verifyPage() throws Exception {
        WebElement logo =  driver.findElement(By.id("hplogo"));
        if (!logo.isDisplayed()) {
            throw new Exception("Current page is not Google homepage.");
        }
    }

    public GoogleResultPage findByText(String text) {
        sendText(text, searchField);
        return selectAutosugestion(text);
    }

    public GoogleResultPage selectAutosugestion(String text) {
        click(hintList + "/*/div[string()='" + text.toLowerCase() + "']");
        return new GoogleResultPage(driver);
    }
}
