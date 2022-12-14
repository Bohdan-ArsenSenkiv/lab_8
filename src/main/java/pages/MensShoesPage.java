package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class MensShoesPage extends BasePage{
    @FindBy (xpath = "//h2[contains(text(),'Puma Training Retaliate trainers in black')]")
    private WebElement productButton;

    public MensShoesPage(WebDriver driver){

        super(driver);
    }
    public ProductPage clickOnProductButton(){
        waitToElementBecomeClickable(productButton);
        productButton.click();
        return new ProductPage (driver);
    }
}
