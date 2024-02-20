package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends BasePage {
    @FindBy(css = ".product-image-photo")
    WebElement clickSelection;

    @FindBy(css = "#product-addtocart-button")
    WebElement addToCartButton;
    @FindBy(css = "#option-label-color-93-item-49")
    WebElement selectColor;
    @FindBy(css = "#option-label-size-143-item-168")
    WebElement selectSize;
    @FindBy(css = "#qty")
    WebElement selectQty;
    @FindBy(css = "#product-addtocart-button")
    WebElement addToCart;
    @FindBy(css = ".action.showcart")
    WebElement goToCart;
    @FindBy(css = "#top-cart-btn-checkout")
    WebElement checkOutButton;






    public ProductPage(WebDriver driver) {
        super(driver);
    }
    public void clickProduct(){
    clickSelection.click();
    }
    public void addToCartProduct(){
    addToCartButton.click();
    }
    public void selectColor(){
    selectColor.click();
    }

    public void selectSize(){
    selectSize.click();
    }
    public void selectQty(){
        scrollToElement(selectQty);
        selectQty.clear();
        selectQty.sendKeys("3");
    }
    public void clickAddToCartButton(){
    addToCart.click();
    }
    public void goToCartButton(){
    goToCart.click();
    }
    public void clickProceedToCheckOutButton(){
    checkOutButton.click();
    }
}
