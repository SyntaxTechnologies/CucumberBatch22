Feature: Login feature functionality

  @smoke @godwill @sprint3 @regression @chicki
  Scenario: Valid admin login functionality
    Given user is able to access HRMS application
    When user enters valid username and password
    And user clicks on login button
    Then user is successfully logged in

  @regression @sprint2 @chicki
  Scenario: Invalid login functionality
    Given user is able to access HRMS application
    When user enters invalid username and password
    And user clicks on login button
    Then user is able to see error message

