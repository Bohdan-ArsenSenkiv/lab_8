package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{
    @FindBy(xpath = "//span[contains(text(),'Add to bag')]")
    private WebElement addButton;
    //private WebElement addButton = driver.findElement(By.xpath("//span[contains(text(),'Add to bag')]"));
    @FindBy(xpath = "//span[contains(@class, 'error')]")
    private WebElement actualMessage;
    //private WebElement actualMessage = driver.findElement(By.xpath("//span[contains(@class, 'error')]"));
    @FindBy(xpath = "//button[@aria-label='Save for later']")
    private WebElement heartButton;
    //private WebElement heartButton = driver.findElement(By.xpath("//button[@aria-label='Save for later']"));
    @FindBy(xpath = "//button[@aria-label='Item saved']")
    private WebElement itemSaved;
    //private WebElement itemSaved = driver.findElement(By.xpath("//button[@aria-label='Item saved']"));
    public ProductPage(WebDriver driver) {
        super(driver);
    }
    public ProductPage clickOnAddButton(){
        addButton.click();
        return this;
    }
    public String getActualMessage(){
        return actualMessage.getText();
    }
    public ProductPage clickOnHeartButton(){
        heartButton.click();
        return this;
    }
    public boolean isBlackHeart(){
        return itemSaved.isDisplayed();
    }
}
