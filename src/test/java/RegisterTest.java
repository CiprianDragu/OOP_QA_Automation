import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.CreateAccountPage;
import pages.HomePage;
import utils.Constants;

public class RegisterTest {
    @Test
    public void createNewAccountTest(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Constants.URL);

        HomePage homePage = new HomePage(driver);
        homePage.clickMyAccountLink();
        CreateAccountPage createAccountPage =new CreateAccountPage(driver);
        createAccountPage.inputFirstName();
        createAccountPage.inputLastName();
        createAccountPage.inputEmail();
        createAccountPage.inputPass();
        createAccountPage.inputConfirmPass();
        createAccountPage.submitButton();

    }
}
