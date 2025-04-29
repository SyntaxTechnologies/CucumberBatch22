Feature: Search employee

  @regression
  Scenario: Search employee by ID
    Given user is able to access HRMS application
    When user enters valid username and password
    And user clicks on login button
    Then user is successfully logged in
    When user clicks on PIM option
    And user clicks on employee list option
    When user enters valid employee id
    And user clicks on search button
    Then user is able to see employee details


   @regression
  Scenario: Search employee by name
    Given user is able to access HRMS application
    When user enters valid username and password
    And user clicks on login button
    Then user is successfully logged in
    When user clicks on PIM option
    And user clicks on employee list option
    When user enters valid employee name
    And user clicks on search button
    Then user is able to see employee details

