package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class AddToCardTest extends BaseTest{
    private static final String MESSAGE = "Please select from the available colour and size options";
    @Test
    public void addToCardWithIncorrectSizeTest(){
        String actualMessage = new HomePage(driver)
                .clickOnCategoryButton()
                .clickOnProductButton()
                .clickOnAddButton()
                .getActualMessage();
        Assert.assertTrue(actualMessage.contains(MESSAGE));
    }
}
