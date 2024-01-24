package pages.datePicker;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class DisplayMultipleMonths extends BasePage {
    @FindBy(id = "datepicker-multiple-months")
    private WebElement inputSection;

    @FindBy(xpath = "//body[1]/div[8]/div[1]/table[1]/tbody[1]/tr[3]/td[2]/a[1]")
    private WebElement elevenMarch;

    public String getInputSection(){
        return inputSection.getText();
    }
    public void clickOnInputSection(){
        inputSection.click();
    }
    public void clickOnElevenMarch(){
        elevenMarch.click();
    }
}