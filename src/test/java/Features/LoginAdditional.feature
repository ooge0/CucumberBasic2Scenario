Feature: LoginAdditionalFeature
Scenario Outline: Login with correct user name and password using Scenario outline
Given I navigate to the login page
And I enter <username> and <password>
And I click the login button
Then I should see the userform

Examples:
| username | password       |
| admin1   | adminpassword1 |