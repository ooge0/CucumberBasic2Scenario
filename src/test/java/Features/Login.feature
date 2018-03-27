Feature: LoginFeature

  Scenario: Login with correct user name and password
    Given I navigate to login page
    And I enter the user name
    And I click  login button
    Then I should see the userform
