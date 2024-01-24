package progressBar;

import BaseTest.Hooks;
import org.testng.annotations.Test;


public class DownloadDialogTest extends Hooks {
    @Test
    public void downloadDialogTest(){
        pages.getHomePage().clickOnWebAutomationLink();

        pages.getWebAutomationPage().clickOnProgressBar();

        pages.getWebAutomationPage().clickOnDownloadDialog();

        pages.getDownloadDialogTab().clickStartDownloadButton();


    }
}