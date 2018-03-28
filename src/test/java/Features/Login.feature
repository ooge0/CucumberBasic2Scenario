Feature: LoginFeature

  Scenario: Login with correct user name and password
    Given I navigate to the login page
    And I enter the the following for login
      | UserName | Password      |
      | admin    | adminpassword |
    And I click the login button
    Then I should see the userform
