Feature: Test Sauce Demo Application

  Scenario: validate login page functionality
    Given User is on login page
    When user enter valid login id and password and click on login button
    And product add to card
    And cheakout
