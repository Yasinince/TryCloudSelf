@US1
Feature: As a user, I should be able to login.

  Background:
    Given user on the login page

  Scenario Outline:Login with valid credentials
    When user use username "<username>" and passcode “<password>"
    And user click login button
    Then user should be at dashboard page
    Examples:
      | username | password    |
      | User12   | Userpass123 |
      | User42   | Userpass123 |
      | User72   | Userpass123 |
      | User102  | Userpass123 |

  Scenario: verify user login fail with invalid credentials
    When user enter invalid credentials
    And click login button
    Then “Wrong username or password.” message should be displayed
