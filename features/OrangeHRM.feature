Feature: OrangeHRM Login
  Scenario: Logo present on orangeHRM Home Page
    Given I launch Chrome browser
    When  I open OrangeHRM Home Page
    Then  I verify OrangeHRM logo Present on Home Page
    And  close Browser
