package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductPage;

public class AddToWishTest extends BaseTest{

    @Test
    public void saveForLate (){

       var blackHeart = new HomePage(driver)
             .clickOnCategoryButton()
                .clickOnProductButton()
                .clickOnHeartButton();
        Assert.assertTrue(blackHeart.isBlackHeart());
    }
}
