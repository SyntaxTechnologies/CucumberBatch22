Feature: Adding employees

  Background:
     #Given user is able to access HRMS application
    When user enters valid username and password
    And user clicks on login button
    Then user is successfully logged in
    When user clicks on PIM option
    And user clicks on Add Employee option

  @add123
  Scenario: Adding one employee
    When user enters firstname and middlename and lastname
    And user clicks on save button
    Then user is added successfully

  @add
  Scenario: Adding employee from feature file
    When user enters "ella" and "ms" and "neopaney"
    And user clicks on save button
    Then user is added successfully

 @examples
 Scenario Outline: Adding multiple emp from feature file
    When user enters "<firstname>" and  "<middlename>" and "<lastname>" values
    And user clicks on save button
    Then user is added successfully
   Examples:
     | firstname | middlename | lastname |
     |sal        |ms          |chikhi    |
     |kerry      |ms          |irfan     |

   @datatable
   Scenario: Adding employees using data table
     When user adds multiple employees from datatable and verify it is added
     |firstname|middlename    |lastname  |
     |sal        |ms          |chikhi    |
     |kerry      |ms          |irfan     |

   @excel
   Scenario: Adding employees using excel file
     When user adds multiple employees from excel file and validate them


