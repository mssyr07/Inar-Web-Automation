package BaseTest;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.Driver;
import utils.Pages;

public class Hooks {


    private static String browser = Driver.browser;
    protected static Pages pages = new Pages();

    @BeforeMethod
    public static void setUp() {
        Driver.getDriver().get("https://InarAcademy:Fk160621.@test.inar-academy.com");
        if (browser.equalsIgnoreCase("firefox")) {
            Driver.getDriver().navigate().refresh();
        }
    }

    @AfterMethod
    public static void tearDown() {
        Driver.closeDriver();
    }

}
