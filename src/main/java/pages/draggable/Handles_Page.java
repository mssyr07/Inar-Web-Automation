package pages.draggable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Handles_Page extends BasePage {

    @FindBy(id = "draggable13")
    private WebElement draggable13;

    @FindBy(xpath = "//*[@id='draggable13']/p")
    private WebElement handle13;

    @FindBy(id = "draggable14")
    private WebElement draggable14;

    @FindBy(xpath = "//*[@id='draggable14']/p[2]")
    private WebElement handle14;


    public void dragDraggable13Offset(int xOffset, int yOffset) {
        int locX = draggable13.getLocation().getX();
        int locy = draggable13.getLocation().getY();

        actions.moveToElement(draggable13).clickAndHold()
                .moveToLocation(locX + xOffset, locy + yOffset)
                .release().build().perform();
        ;
    }

    public void dragDraggable13HandleOffSet(int xOffset, int yOffset) {
        actions.dragAndDropBy(draggable13, xOffset, yOffset).perform();
    }

    public void dragDraggable14Offset(int xOffset, int yOffset) {
        int locX = draggable14.getLocation().getX();
        int locy = draggable14.getLocation().getY();

        actions.moveToLocation(locX,locy).clickAndHold()
                .moveToLocation(locX + xOffset, locy + yOffset)
                .release().build().perform();

    }

    public void dragDraggable14HandleOffSet(int xOffset, int yOffset) {
        actions.dragAndDropBy(draggable14, xOffset, yOffset).perform();
    }

    public int getLocationOffDaraggable13x() {
        return draggable13.getLocation().getX();
    }

    public int getLocationOffDaraggable13Y() {
        return draggable13.getLocation().getY();
    }

    public int getLocationOffDaraggable14x() {
        return draggable14.getLocation().getX();
    }

    public int getLocationOffDaraggable14Y() {
        return draggable14.getLocation().getY();
    }


}
