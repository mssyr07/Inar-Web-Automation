package pages.droppable;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class RevertDraggablePosition extends BasePage{
    @FindBy(id = "draggable-revert-draggable")
    private WebElement returningBox;

    @FindBy(id = "draggable2-revert-draggable")
    private WebElement nonReturningBox;

    @FindBy(id = "droppable-revert-draggable")
    private WebElement targetBox;

    public Point getLocationOfReturningBox(){
        return returningBox.getLocation();
    }
    public Point getLocationOfNonReturningBox(){
        return nonReturningBox.getLocation();
    }
    public void dragAndDropForReturningBox(){
        actions.dragAndDrop(returningBox,targetBox).perform();
    }
    public void dragAndDropForNonReturningBox(){
        actions.dragAndDrop(nonReturningBox,targetBox).perform();
    }

}