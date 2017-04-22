@in-progress
Feature: Draggable item
  @in-progress
  Scenario: Adding an item to an existing list by drag and drop
    Given I'm on the draggable page
    When I select 'Draggable + Sortable' section
    And I drag and drop the item 'Drag me down' to the bottom of the list
    Then I should see 'Drag me down' added to the bottom of the list

