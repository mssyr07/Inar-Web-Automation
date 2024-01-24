package iframeTest;

import BaseTest.Hooks;
import org.testng.annotations.Test;
import pages.iframe.Normal_Iframe_Page;
import utils.BrowserUtils;

import static org.testng.Assert.assertEquals;

// 1. Click on Iframe button
// 2. Click on Normal Iframe button
// 3. Get iframe's title
// 4. Verify that it is "Example Domain"
// 5. Get iframe's H1
// 6. Verify that it is "Inar academy"
public class Normal_Iframe_Test extends Hooks {

    @Test
    void testNormalIframe() {
        // pages.getHomePage().clickOnWebAutomationLink();

        pages.getHomePage().clickOnWebAutomationLink();

        BrowserUtils.scrollDownWithPageDown();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // 1. Click on Iframe button
        pages.getWebAutomationPage().clickOnIframeLink();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        BrowserUtils.scrollUpWithPageUp();

        // 2. Click on Normal Iframe button
        pages.getWebAutomationPage().clickOnNormalIframe();

        Normal_Iframe_Page normalIframe = pages.getNormalIframePage();

        // Switch to iframe
        normalIframe.switchToIframe();

        // 3. Get iframe's title and verify that it is "Example Domain"
        assertEquals("<title>Example Domain</title>", normalIframe.getIframeTitle(),
                "Iframe's title is not Example Domain!");

        // 5. Get iframe's H1 and verify that it is "Inar academy"
        assertEquals("Inar academy", normalIframe.getIframeH1Text(), "Iframe's H1 is not Inar academy!");

        normalIframe.switchToWindow();
    }

}