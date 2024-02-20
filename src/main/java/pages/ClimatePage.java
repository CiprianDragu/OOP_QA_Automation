package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClimatePage extends BasePage {
    @FindBy(xpath = "//div[normalize-space()='Climate']")
    WebElement clickClimate;

    @FindBy(xpath = "//a[contains(text(),'All-Weather')]")
    WebElement selectClimate;


    public ClimatePage(WebDriver driver) {
        super(driver);
    }

    public void clickClimate() {
        clickClimate.click();
    }

    public void selectClimate() {
        selectClimate.click();
    }
}
