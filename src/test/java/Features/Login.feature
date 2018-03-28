Feature: LoginFeature

  Scenario: Login with correct user name and password
    Given I navigate to the login page
    And I enter the the following for login
      | username | password      |
      | admin    | adminpassword |
    And I click the login button
    Then I should see the userform


  Scenario Outline : Login with correct user name and password using Scenario outline
    Given I navigate to the login page
    And I enter <username> and <password>
    And I click the login button
    Then I should see the userform

    Examples:
      | username | password      |
      | admin    | adminpassword |