package com.demoqa.steps.draggable;

import com.demoqa.pageobjects.draggable.DraggablePage;
import com.demoqa.pageobjects.draggable.DraggableSortablePage;
import cucumber.api.java8.En;


import static org.assertj.core.api.Assertions.*;
/**
 * Created by New on 4/21/2017.
 */
public class DraggableSortableTest implements En {
    private static final DraggableSortablePage draggableSortablePage = new DraggableSortablePage();
    DraggablePage draggablePage;
    public DraggableSortableTest(){
        Given("^I'm on the draggable page$", () -> {
            draggablePage = new DraggablePage();
            //using  default browser chrome for testing
            draggablePage.setBrowser("chrome");
            draggablePage.open();
        });

        When("^I select 'Draggable \\+ Sortable' section$", () -> {
            draggableSortablePage.setDraggablePage(draggablePage);
            draggableSortablePage.clickSelectableSortable();
        });

        When("^I drag and drop the item 'Drag me down' to the bottom of the list$", () -> {
            draggableSortablePage.dragAndDrop();
        });

        Then("^I should see 'Drag me down' added to the bottom of the list$", ()  -> {
            assertThat(draggableSortablePage.getLastElementInList()).isEqualTo("Drag me down");
            draggablePage.close();
        });
    }
}
