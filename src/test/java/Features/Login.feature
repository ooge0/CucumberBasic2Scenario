Feature: LoginFeature

  Scenario: Login with correct user name and password
    Given I navigate to the login page
    And I enter the username as "admin" and password as "adminPassword"
    And I click the login button
    Then I should see the userform
