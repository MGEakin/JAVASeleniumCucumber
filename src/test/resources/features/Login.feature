Feature: User Login

  Scenario: User is able to login with valid credentials
    Given User enters valid username in the username field
    And User enters valid password in the password field
    When User clicks the login button
    Then User is logged in successfully

  Scenario: User is NOT able to login with valid credentials
    Given User enters invalid username in the username field
    And User enters invalid password in the password field
    When User clicks the login button
    Then User is NOT logged into the application
