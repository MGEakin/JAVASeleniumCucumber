@regression
Feature: User Login

  @smoke @functional
  Scenario: User is able to login with valid credentials
    Given User enters valid username in the username field
    And User enters valid password in the password field
    When User clicks the login button
    Then User is logged in successfully

  Scenario Outline: User is NOT able to login with valid credentials
    Given User enters invalid <username> in the username field
    And User enters invalid <password> in the password field
    When User clicks the login button
    Then error <errorMessage> is displayed
    Examples:
      | username          | password | errorMessage                                          |
      | x                 | y        | Warning: No match for E-Mail Address and/or Password. |
      | test@gmail.com    | tes23    | Warning: No match for E-Mail Address and/or Password. |
      | patebij@gmail.com | 1234     | Warning: No match for E-Mail Address and/or Password. |