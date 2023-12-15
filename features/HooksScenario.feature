Feature: Login As a registered user

  Scenario: Successful Login
    Given User is on login page
    When the user enters valid username and password credentials
    And clicks the login button
    Then the user should be redirected to the dashboard

  Scenario: Unsuccessful Login
    Given User is on login page
    When the user enters invalid credentials
    And clicks the login button
    Then the user should see an error message
