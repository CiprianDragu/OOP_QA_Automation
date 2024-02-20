import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utils.Constants;

public class FiltersTest {
    @Test
    public void verifyFiltersTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Constants.URL);
        HomePage homePage = new HomePage(driver);
        homePage.clickSignInLink();
        homePage.waitInSeconds(1);
        SignInPage signInPage = new SignInPage(driver);
        signInPage.inputLoginEmail();
        signInPage.inputPasswordEmail();
        signInPage.clickSubmitButton();
        signInPage.waitInSeconds(1);
        MenPage menPage = new MenPage(driver);
        homePage.clickManLink();
        signInPage.waitInSeconds(1);
        menPage.clickHoodies();
        HoodiesPage hoodies = new HoodiesPage(driver);
        hoodies.waitInSeconds(1);
        hoodies.clickSizeButton();
        hoodies.clickSelectSizeButton();
        hoodies.clickPriceButton();
        hoodies.selectPrice();
        hoodies.clickColorButton();
        hoodies.clickSelectedColor();
        MaterialPage materialPage = new MaterialPage(driver);
        materialPage.clickMaterial();
        materialPage.selectMaterial();
        ClimatePage climatePage = new ClimatePage(driver);
        climatePage.clickClimate();
        climatePage.selectClimate();
        ProductPage productPage = new ProductPage(driver);
        productPage.clickProduct();
        productPage.addToCartProduct();
        productPage.selectColor();
        productPage.selectSize();
        productPage.selectQty();
        productPage.waitInSeconds(3);
        productPage.clickAddToCartButton();
        productPage.waitInSeconds(4);
        productPage.goToCartButton();
        productPage.clickProceedToCheckOutButton();
        CheckOutPage checkOutPage = new CheckOutPage(driver);
        checkOutPage.waitInSeconds(3);

         if( !checkOutPage.isUserMemorized()){
            checkOutPage.selectAdrees();
            checkOutPage.selectCity();
           checkOutPage.selectProvince();
             checkOutPage.selectFromDr();
            checkOutPage.selectZipeCode();
           checkOutPage.selectCountry();
            checkOutPage.selectFoneNumber();
         }

        checkOutPage.selectRadioButton();
        checkOutPage.selectShippingMethod();
        checkOutPage.waitInSeconds(5);
        checkOutPage.placeOrderButton();
        checkOutPage.waitInSeconds(3);
        ThankYouPage thankYouPage = new ThankYouPage(driver);
        String actualMessage = thankYouPage.getThankYouMessage();
        String expectedMessage = "Thank you for your purchase!";
        Assert.assertEquals(actualMessage,expectedMessage);

    }
}
