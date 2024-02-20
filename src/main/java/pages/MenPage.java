package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenPage extends BasePage {
    @FindBy(xpath = "//a[contains(text(),'Hoodies & Sweatshirts')]")
    WebElement hoodies;

    public MenPage(WebDriver driver) {
        super(driver);
    }
    public void clickHoodies(){
        hoodies.click();
    }

}
