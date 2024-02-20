package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.Constants;

public class CheckOutPage extends BasePage {
    @FindBy(xpath = "//input[@name='street[0]']")
    WebElement clickAdrees;
    @FindBy(css = "input[name=\"city\"]")
    WebElement clickCity;

    @FindBy(xpath = "(//select[@class='select'])[1]")
    WebElement clickSelectProvince;
    @FindBy(xpath = "//option[@value='1']")
    WebElement optionAlabama;
    @FindBy(xpath = "//input[@name='postcode']")
    WebElement inputPostcode;
    @FindBy(css = "option[value='US']")
    WebElement optionUnitedStates;
    @FindBy(name = "telephone")
    WebElement inputTelephone;
    @FindBy(xpath = "//input[@value='tablerate_bestway']")
    WebElement inputUnique;
    @FindBy(css = "button[class*='continue']")
    WebElement buttonOpcContinue;
    @FindBy(css = "button[title='Place Order']")
    WebElement placeOrder;
    @FindBy(css = ".shipping-address-item.selected-item")
    WebElement completedAddress;


    public CheckOutPage(WebDriver driver) {
        super(driver);
    }

    public void selectAdrees() {
        scrollToElement(clickAdrees);
        clickAdrees.sendKeys("NY 234_B");
    }

    public void selectCity() {
        clickCity.sendKeys("Texas");
    }

    public void selectProvince() {
        clickSelectProvince.click();
    }

    public void selectFromDr() {
        optionAlabama.click();
    }

    public void selectZipeCode() {
        inputPostcode.sendKeys(Constants.ZIPE_CODE);
    }

    public void selectCountry() {
        optionUnitedStates.click();
    }

    public void selectFoneNumber() {
        inputTelephone.sendKeys(Constants.FONE_NUMBER);
    }

    public void selectRadioButton() {
        inputUnique.click();
    }

    public void selectShippingMethod() {
        buttonOpcContinue.click();
    }

    public void placeOrderButton() {
        scrollToElement(placeOrder);
        placeOrder.click();
    }
    public boolean isUserMemorized(){
        try {
           completedAddress.isDisplayed();
            return true;
        }
        catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
    public void selectCountryBySelectClass(){
        Select select = new Select(driver.findElement(By.xpath("//select[@name='country_id'])")));
        select.selectByValue("AD");
    }

}
