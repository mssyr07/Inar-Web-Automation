package draggableTests;

import BaseTest.Hooks;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.testng.Assert.assertEquals;


/**
 * 1.Drag the first element to the right and drop
 * 2.Verify the drag element do not move.
 */

public class Draggable_ConstrainMovement_Test extends Hooks {

    @Test
    void testConstrainMovement() {

        pages.getHomePage().clickOnWebAutomationLink();

        pages.getWebAutomationPage().clickOnDraggableLink();

        pages.getWebAutomationPage().clickOnDraggableConstrainMovementLink();

        // 1 .step

        int initial_x = pages.getConstrainMovementsPage().getLocationOffDaraggable5X();
        int initial_y = pages.getConstrainMovementsPage().getLocationOffDaraggable5y();

        pages.getConstrainMovementsPage().dragDraggable5Offset(50, 50);


        int final_x = pages.getConstrainMovementsPage().getLocationOffDaraggable5X();
        int final_y = pages.getConstrainMovementsPage().getLocationOffDaraggable5y();

        assertThat(initial_y).isLessThan(final_y);
        assertEquals(initial_x, final_x, "Wrong ");

        //2.step

        int initial_x6 = pages.getConstrainMovementsPage().getLocationOffDaraggable6X();
        int initial_y6 = pages.getConstrainMovementsPage().getLocationOffDaraggable6y();

        pages.getConstrainMovementsPage().dragDraggable6Offset(50, 50);

        int final_x6 = pages.getConstrainMovementsPage().getLocationOffDaraggable6X();
        int final_y6 = pages.getConstrainMovementsPage().getLocationOffDaraggable6y();

        assertThat(initial_x6).isLessThan(final_x6);
        assertEquals(initial_y6, final_y6, "Wrong");


        // 3.step

        int initial_x7 = pages.getConstrainMovementsPage().getLocationOffDaraggable7X();
        int initial_y7 = pages.getConstrainMovementsPage().getLocationOffDaraggable7y();

        pages.getConstrainMovementsPage().dragDraggable7Offset(50, 20);

        int final_x7 = pages.getConstrainMovementsPage().getLocationOffDaraggable7X();
        int final_y7 = pages.getConstrainMovementsPage().getLocationOffDaraggable7y();

        int[] boundsOfContainerWrapper = pages.getConstrainMovementsPage().getContainerWrapperLimits();

        System.out.println(Arrays.toString(boundsOfContainerWrapper));
        System.out.println(final_x7);
        System.out.println(final_y7);
        assertThat(final_x7).isBetween(boundsOfContainerWrapper[3], boundsOfContainerWrapper[1]);
        assertThat(final_y7).isBetween(boundsOfContainerWrapper[0], boundsOfContainerWrapper[2]);

        // 4.step

        int initial_x8 = pages.getConstrainMovementsPage().getLocationOffDaraggable8X();
        int initial_y8 = pages.getConstrainMovementsPage().getLocationOffDaraggable8Y();

        pages.getConstrainMovementsPage().dragDraggable8Offset(100, 100);

        int final_x8 = pages.getConstrainMovementsPage().getLocationOffDaraggable8X();
        int final_y8 = pages.getConstrainMovementsPage().getLocationOffDaraggable8Y();


        int[] boundsOfBoxLimits = pages.getConstrainMovementsPage().getBoxWrapperLimits();
        System.out.println(Arrays.toString(boundsOfBoxLimits));
        System.out.println(final_x8);
        System.out.println(final_y8);

        assertThat(final_x8).isBetween(boundsOfBoxLimits[3], boundsOfBoxLimits[1]);
        assertThat(final_y8).isBetween(boundsOfBoxLimits[0], boundsOfBoxLimits[2]);


    }
}
