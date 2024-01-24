package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WebAutomationPage extends BasePage {

    @FindBy(linkText = "Draggable")
    private WebElement draggableLink;

    @FindBy(linkText = "Default Functionality")
    private WebElement defaultFunctionalityLink;

    @FindBy(linkText = "Constrain Movement")
    private WebElement constrainMovementLink;

    @FindBy(linkText = "Handles")
    private WebElement handlesLink;

    @FindBy(linkText = "Auto Scrolling")
    private WebElement autoScrollingLink;

    @FindBy(linkText = "Droppable")
    private WebElement droppableLink;

    @FindBy(linkText = "Accept")
    private WebElement acceptLink;

    @FindBy(linkText = "Revert draggable position")
    private WebElement revertDraggabLink;

    @FindBy(linkText = "Resizable")
    private WebElement resizableLink;


    @FindBy(linkText = "Synchronus Resize")
    private WebElement synchronusResize;

    @FindBy(linkText = "Textarea")
    private WebElement textArea;

    @FindBy(linkText = "Selectable")
    private WebElement selectableLink;

    @FindBy(linkText = "Iframe")
    private WebElement iframeLink;

    @FindBy(linkText = "Nested Iframe")
    private WebElement nestedIframeLink;

    @FindBy(linkText = "Normal Iframe")
    private WebElement normalIframeLink;

    @FindBy(linkText = "Alerts")
    private WebElement alertsLink;

    @FindBy(linkText = "Animate")
    private WebElement animateLink;

    @FindBy(linkText = "Autocomplete")
    private WebElement autocompleteLink;

    @FindBy(linkText = "Multiple & Remote")
    private WebElement multipleRemoteLink;

    @FindBy(linkText = "Serialize")
    private WebElement serializeLink;

    @FindBy(linkText = "Progress Bar")
    private WebElement progressBar;

    @FindBy(linkText = "Download Dialog")
    private WebElement downloadDialog;

    @FindBy(linkText = "Accent Folding")
    private WebElement accentFoldingLink;

    @FindBy(linkText = "Control Group")
    private WebElement controlGroup;

    @FindBy(linkText = "Datepicker")
    private WebElement datePicker;

    @FindBy(linkText = "Display Multiple Months")
    private WebElement displayMultipleMonths;

    @FindBy(linkText = "Select Date Range")
    private WebElement selectDateRange;

    @FindBy(linkText = "Revert draggable position")
    private WebElement revertDraggablePositionLink;



    public void clickOnDraggableLink() {
        draggableLink.click();
    }

    public void clickOnDraggableDefaultFunctionalityLink() {
        defaultFunctionalityLink.click();
    }

    public void clickOnDraggableConstrainMovementLink() {
        constrainMovementLink.click();
    }

    public void clickOnHandlesLink() {
        handlesLink.click();
    }

    public void clickOnRevertDraggableLink(){revertDraggabLink.click();}

    public void clickOnDroppableDefaultFunctionalityLink() {
        defaultFunctionalityLink.click();
    }

    public void clickOnDroppableLink() {
        droppableLink.click();
    }

    public void clickOnDroppableAcceptlink(){acceptLink.click();}

    public void clickOnAutoScrollingLink() {
        autoScrollingLink.click();
    }

    public void clickOnResizableLink() {
        resizableLink.click();
    }

    public void clickOnSynchronusResizeLink() {synchronusResize.click();}

    public void clickOnResizableDefaultFuncLink() {
        defaultFunctionalityLink.click();
    }

    public void clickOnSelectableLink() {
        selectableLink.click();
    }

    public void clickOnDefaultFunctionality() {
        defaultFunctionalityLink.click();
    }

    public void clickOnIframeLink() {
        iframeLink.click();
    }

    public void clickOnNestedIframe() {
        nestedIframeLink.click();
    }

    public void clickOnNormalIframe() {normalIframeLink.click();}

    public void clickOnAlertsLink() {
        alertsLink.click();
    }

    public void clickOnAnimateLink() {
        animateLink.click();
    }

    public void clickOnAutocompleteLink() {autocompleteLink.click();}

    public void clickOnMultipleRemoteLink() {multipleRemoteLink.click();}

    public void clickOnTextAreaLink(){textArea.click();}

    public void clickOnSerializeLink() {serializeLink.click();}

    public void clickOnProgressBar(){progressBar.click();}

    public void clickOnDownloadDialog(){downloadDialog.click();}

    public void clickOnAccentFoldingLink(){accentFoldingLink.click();}

    public void clickOnControlGroup(){controlGroup.click();}

    public void clickOnDatePickerLink(){datePicker.click();}

    public void clickOnDisplayMultipleMonthsLink(){displayMultipleMonths.click();}

    public void clickOnSelectDateRange(){selectDateRange.click();}

    public void clickOnRevertDraggablePositionLink(){revertDraggablePositionLink.click();}






}
