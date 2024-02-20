import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utils.Constants;

public class BaseTest {
    WebDriver driver = new ChromeDriver();
    @Test
    public void goToWebsite(){
        driver.manage().window().maximize();
        driver.get(Constants.URL);
    }
}
