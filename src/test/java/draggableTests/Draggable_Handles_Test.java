package draggableTests;

import BaseTest.Hooks;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;


/**
 * 1. Open the browser and navigate to the page
 * 2. click on the draggable button
 * 3. click on the auto scrolling button
 * 4. Handle the first element by box and drag it
 * 5. Handle the first element by white field then drag
 * 6. Handle the second element by box and drag it
 * 7. Handle the second element by white field then drag.
 */

public class Draggable_Handles_Test extends Hooks {

    @Test
    void TestHandles() {

        //1. Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();

        //2. click on the draggable button
        pages.getWebAutomationPage().clickOnDraggableLink();

        //3. click on the Handles button
        pages.getWebAutomationPage().clickOnHandlesLink();

        //4.Handle the element by box and drag it
        int initial_x13 = pages.getHandlesPage().getLocationOffDaraggable13x();
        int initial_y13 = pages.getHandlesPage().getLocationOffDaraggable13Y();

        pages.getHandlesPage().dragDraggable13Offset(20, 20);

        int final_x13 = pages.getHandlesPage().getLocationOffDaraggable13x();
        int final_y13 = pages.getHandlesPage().getLocationOffDaraggable13Y();

        assertEquals(initial_x13, final_x13, "WRONG");
        assertEquals(initial_y13, final_y13, "WRONG");

        //5.Handle the element by white field then drag
        pages.getHandlesPage().dragDraggable13HandleOffSet(50, 50);

        int final_movingX13 = pages.getHandlesPage().getLocationOffDaraggable13x();
        int final_movingY13 = pages.getHandlesPage().getLocationOffDaraggable13Y();

        assertNotEquals(initial_x13, final_movingX13, "Wrong");
        assertNotEquals(initial_y13, final_movingY13, "Wrong");

        //6.Handle the element by box and drag it
        int initial_x14 = pages.getHandlesPage().getLocationOffDaraggable14x();
        int initial_y14 = pages.getHandlesPage().getLocationOffDaraggable14Y();

        pages.getHandlesPage().dragDraggable14Offset(50, 50);

        int final_x14 = pages.getHandlesPage().getLocationOffDaraggable14x();
        int final_y14 = pages.getHandlesPage().getLocationOffDaraggable14Y();

        assertNotEquals(initial_x14, final_x14, "WRONG");
        assertNotEquals(initial_y14, final_y14, "WRONG");

        //7. Handle the second element by white field then drag.

        int initial_mid14x = pages.getHandlesPage().getLocationOffDaraggable14x();
        int initial_mid14Y = pages.getHandlesPage().getLocationOffDaraggable14Y();

        pages.getHandlesPage().dragDraggable14HandleOffSet(50, 50);

        int final_mid14X = pages.getHandlesPage().getLocationOffDaraggable14x();
        int final_mid14Y = pages.getHandlesPage().getLocationOffDaraggable14Y();

        assertEquals(initial_mid14x, final_mid14X, "Wrong");
        assertEquals(initial_mid14Y, final_mid14Y, "Wrong");


    }
}
