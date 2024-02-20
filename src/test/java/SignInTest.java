import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignInPage;
import utils.Constants;

public class SignInTest {
    @Test
    public void signInTest () throws InterruptedException {
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
        homePage.clickManLink();


    }
}
