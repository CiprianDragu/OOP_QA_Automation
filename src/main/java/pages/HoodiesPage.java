package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HoodiesPage extends BasePage {
    @FindBy(xpath = "//div[normalize-space()='Size']")
    WebElement clickSize;
    @FindBy(xpath = "(//div[contains(text(),'M')])[13]")
    WebElement selectSize;
    @FindBy(xpath = "//div[contains(text(),'Price')]")
    WebElement price;
    @FindBy(xpath = "//span[contains(text(),'$40.00')]")
    WebElement selectPrice;
    @FindBy(xpath = "//div[contains(text(),'Color')]")
    WebElement color;
    @FindBy(xpath = "(//div[@option-label='Black'])[2]")
    WebElement selectColor;


    public HoodiesPage(WebDriver driver) {
        super(driver);
    }

    public void clickSizeButton() {
        clickSize.click();
    }

    public void clickSelectSizeButton() {
        selectSize.click();
    }

    public void clickPriceButton() {
        price.click();
    }

    public void selectPrice() {
        selectPrice.click();
    }

    public void clickColorButton() {
        color.click();
    }

    public void clickSelectedColor() {
        selectColor.click();
    }
}
