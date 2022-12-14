package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class LocalizationTest extends BaseTest{
    
    @Test
    public void changeCountry (){
        HomePage countryFlag = new HomePage(driver)
                .clickOnChangeCountryButton()
                .selectCountry()
                .submitCountry();
        Assert.assertTrue(countryFlag.isCountryFlag());
    }
}
