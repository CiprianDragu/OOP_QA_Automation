package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Constants;

public class CreateAccountPage extends BasePage {
    @FindBy(css = "#firstname")
    WebElement firstName;
    @FindBy(css = "#lastname")
    WebElement lastName;
    @FindBy(css = "#email_address")
    WebElement email;
    @FindBy(css = "#password")
    WebElement password;
    @FindBy(css = "#password-confirmation")
    WebElement passwordConfirmation;
    @FindBy(css = "button.action.submit.primary")
    WebElement submit;


    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    public void inputFirstName() {
        firstName.sendKeys(Constants.FIRS_NAME);
    }

    public void inputLastName() {
        lastName.sendKeys(Constants.LAST_NAME);
    }

    public void inputEmail() {
        email.sendKeys(Constants.MAIL);

    }

    public void inputPass() {
        password.sendKeys(Constants.PASS);
    }

    public void inputConfirmPass() {
        passwordConfirmation.sendKeys(Constants.CONFIRMPASS);
    }

    public void submitButton() {
        submit.click();
    }
}
