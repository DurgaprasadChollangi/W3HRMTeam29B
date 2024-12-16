Feature: Login Functionality

  @Smoke
  Scenario: Validate the login functionality with valid credentials
    Given user open browser
    And user open the application
    When user enters username and password
    And user clicks the login button
    Then user should succussfully completed the login functionality
    And user should naviagated into DashBoard page
