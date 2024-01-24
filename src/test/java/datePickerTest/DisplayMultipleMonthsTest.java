package datePickerTest;

import BaseTest.Hooks;
import org.testng.annotations.Test;
import utils.BrowserUtils;

import static org.testng.Assert.assertEquals;


public class DisplayMultipleMonthsTest extends Hooks {
    @Test
    public void displayMultipleMonthsTest(){
        pages.getHomePage().clickOnWebAutomationLink();

        BrowserUtils.scrollDownWithPageDownWithAmount(500,500);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        pages.getWebAutomationPage().clickOnDatePickerLink();

        pages.getWebAutomationPage().clickOnDisplayMultipleMonthsLink();

        BrowserUtils.scrollUpWithPageUp();
        pages.getDisplayMultipleMonths().clickOnInputSection();

        BrowserUtils.wait(2);

        pages.getDisplayMultipleMonths().clickOnElevenMarch();

        BrowserUtils.wait(4);
        String date = pages.getDisplayMultipleMonths().getInputSection();

      //  assertEquals("01/15/2024","01/15/202","when click on the 11 march 2024 it must show 03/11/2024");
    }
}