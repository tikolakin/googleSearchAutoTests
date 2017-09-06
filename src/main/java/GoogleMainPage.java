import org.openqa.selenium.WebDriver;

class GoogleMainPage extends Data{

    public GoogleMainPage(WebDriver driver) {
        this.driver = driver;
    }

    private final String searchField = ".//*[@id='gs_lc0']/input";
    private String hintList = ".//*[@class='sbdd_b']/div/ul";
    private String searchGoogleButton = ".//*[@class='sbsb_g']/span[1]/span/input";

     public GoogleResultPage findByText(String text){
        sendText(text,searchField);

        if (System.currentTimeMillis()% 2 == 0){
            click(hintList+"/*/div[string()='"+text.toLowerCase()+"']");
        }else {
            click(searchGoogleButton);
        }

        return new GoogleResultPage(driver);
    }
}
