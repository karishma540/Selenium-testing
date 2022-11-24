Feature: web application

  Scenario: working on newtours page
    Given user open newtours page
    When user need to click on register
    Then user need to get country name from dropdown
    And user navigates back to home page
    And user closes the browser
