import org.openqa.selenium.WebDriver;

class GoogleHomePage extends BasePage
{
    private String path = "";

    private String searchField = ".//input[@title='Search']";
    private String hintList = ".//ul[@role='listbox']";

    public GoogleHomePage open()
    {
      super.open(this.path);
      verifyPage();
      return this;
    }

    public void verifyPage()
    {
        assertEquals("Current page is not Google homepage.", "Go to Google Home.", getText(".//h1"));
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
