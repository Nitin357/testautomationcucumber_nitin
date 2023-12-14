Feature: User Login As a registered user


  @smoke
  Scenario: Successful Login
    Given Browser is Open
    And User is on login page
    When the user enters valid username and password credentials
    And clicks the login button
    Then the user should be redirected to the dashboard

  Scenario: Unsuccessful Login
    Given Browser is Open
    And User is on login page
    When the user enters invalid credentials
    And clicks the login button
    Then the user should see an error message