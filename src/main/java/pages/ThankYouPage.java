package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ThankYouPage extends BasePage {
    @FindBy(xpath = "//span[contains(text(),'Thank you for your purchase!')]")
    WebElement thankYouMessage;




    public ThankYouPage(WebDriver driver) {
        super(driver);
    }
    public String getThankYouMessage(){
         return thankYouMessage.getText();

    }
}
