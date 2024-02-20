package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MaterialPage extends BasePage {
    @FindBy(xpath = "//div[normalize-space()='Material']")
    WebElement clickMaterial;

    @FindBy(xpath = "//a[contains(text(),'Wool')]")
    WebElement selectMaterial;


    public MaterialPage(WebDriver driver) {
        super(driver);
    }
        public void clickMaterial(){
        clickMaterial.click();

        }
        public void selectMaterial(){
        selectMaterial.click();
        }

    }

