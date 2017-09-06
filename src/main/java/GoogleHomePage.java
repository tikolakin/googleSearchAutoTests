import org.openqa.selenium.WebDriver;

class GoogleHomePage extends BasePage
{
    private String path = "/";

    private String searchField = ".//input[@title='Search']";
    private String hintList = ".//ul[@role='listbox']";

    public GoogleHomePage open()
    {
      super.open(domainUrl + path);
      return this;
    }

    public GoogleResultPage findByText(String text){
        sendText(text,searchField);
        return selectAutosugestion();
    }

    public GoogleResultPage selectAutosugestion(){
        click(hintList + "/*/div[string()='" + text.toLowerCase() + "']");
        return new GoogleResultPage(driver);
    }
}
