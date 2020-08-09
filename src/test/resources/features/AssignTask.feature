Feature: Assign Task Feature
  Agile Story :As a user, I should be able to assign
  tasks by clicking on Task tab under Active Stream.

  Background:
    Given User is on the login page
    When User login as authorized user
    Then User click on Task Tab

  Scenario:High Priority Checkbox
      And User Click on High Priority Checkbox

  @Wip
  Scenario:Click on Visual Editor and Editor text-bar displays
    When User click on Visual Editor
    Then The Editor Text-bar displays


