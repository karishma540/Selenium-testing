Feature: working on amazon page

  Scenario: web application
    Given an amazon page and opening an amazon page
    When page is opened
    Then capture all the links
    Then get url and get title
    And store in the excel sheet and close the window
