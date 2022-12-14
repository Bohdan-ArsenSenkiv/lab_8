package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class HomePage extends BasePage{
    @FindBy(xpath = "//button[@data-id='742dfe83-3b62-435b-beda-53ba3e0fb8d3']")
    private WebElement categoryButton;
    @FindBy(xpath = "//span[contains(text(),'View all shoes')]")
    private WebElement categoryFlyout;
    @FindBy(xpath="//button[@data-testid='country-selector-btn']")
    private WebElement changeCountryButton;
    @FindBy(xpath = "//select[@id='country']")
    private WebElement selectCountryMenu;
    @FindBy(xpath="//button[contains(text(), 'Update')]")
    private WebElement submitButton;
    @FindBy(xpath="//img[@alt='United States']")
    private WebElement countryFlag;
    public HomePage(WebDriver driver) {
        super(driver);
    }
    public MensShoesPage clickOnCategoryButton(){
        categoryButton.click();
        categoryFlyout.click();
        return new MensShoesPage(driver);
    }

    public HomePage clickOnChangeCountryButton(){
        waitToElementBecomeVisible(changeCountryButton);
        changeCountryButton.click();
        return this;
    }
    public HomePage selectCountry() {
        waitToElementBecomeVisible(selectCountryMenu);
        Select select = new Select(selectCountryMenu);
        select.selectByValue("US");
        return this;
    }
    public HomePage submitCountry() {
        waitToElementBecomeVisible(submitButton);
        submitButton.click();
        return this;
    }
    public boolean isCountryFlag(){
        return countryFlag.isDisplayed();
    }
}
