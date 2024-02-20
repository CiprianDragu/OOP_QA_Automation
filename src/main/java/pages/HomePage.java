package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    @FindBy(xpath = "(//a[contains(text(), 'Create an Account')])[1]")
    WebElement createAccount;
    @FindBy(xpath = "(//a[contains(text(),'Sign In')])[1]")
    WebElement signIn;
    @FindBy(css = "#ui-id-5")
    WebElement manLink;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickMyAccountLink() {
        createAccount.click();
    }

    public void clickSignInLink() {
        signIn.click();
    }

    public void clickManLink() {
        manLink.click();
    }
}

