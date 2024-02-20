package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Constants;

public class SignInPage extends BasePage {
    @FindBy(xpath = "(//a[contains(text(),'Sign In')])[1]")
    WebElement signIn;
    @FindBy(css = "#email")
    WebElement email;
    @FindBy(css = "#pass")
    WebElement password;
    @FindBy(xpath = "(//button[@id='send2'])[1]")
    WebElement submit;


    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void clickSignInLink () {
        signIn.click();
    }

    public void inputLoginEmail() {
        email.sendKeys(Constants.LOGIN_EMAIL2);
    }

    public void inputPasswordEmail() {

        password.sendKeys(Constants.PASS);
    }

    public void clickSubmitButton() {
        submit.click();
    }
}
