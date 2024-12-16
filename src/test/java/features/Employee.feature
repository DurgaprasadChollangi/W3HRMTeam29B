Feature: Employee Functionality

  @sanity
  Scenario: validate the Employee Functionality with validate credentails
    Given user open the Broswer
    And user open the Application
    When user enter the Employee Details
    And user click the Create button
    Then user should be successfully completed Employee Functionality
    And user should navigated to the manage Employee page
