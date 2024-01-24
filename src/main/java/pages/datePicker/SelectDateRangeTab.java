package pages.datePicker;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class SelectDateRangeTab extends BasePage {
    @FindBy(id = "from-selectDateRange")
    private WebElement inputFrom;

    @FindBy(id = "to-selectDateRange")
    private WebElement inputTo;


}