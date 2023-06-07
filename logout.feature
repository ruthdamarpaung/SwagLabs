@Functionality1
Feature: Logout Functionality

  @TCID011
  Scenario: Verify if logout is successful
   	Given User has opened the browser3
    And User login with valid credential1
    When User has navigated to humburger button1
    And User click item logout1
    Then User logout successfully and back to login homepage1

 