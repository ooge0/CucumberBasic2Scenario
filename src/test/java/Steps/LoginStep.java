package Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
// change order of methods
public class LoginStep {

    @Given("^I navigate to the login page$")
    public void iNavigateToLoginPage() throws Throwable {
        System.out.println("I navigate to the login page");
    //throw new PendingException();

    }
    @And("^I click the login button$")
    public void iClickLoginButton() throws Throwable {
        System.out.println("I click the login form");
        // throw new PendingException();
    }


    @And("^I enter the username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void iEnterTheUserNameAsAndPasswordAs(String username, String password) throws Throwable {
        System.out.println("Username is " + username + " and password is "+ password);
        //throw new PendingException();
    }
    @Then("^I should see the userform$")
    public void iShouldSeeTheUserform() throws Throwable {
        System.out.println("I should see the user form");
        // throw new PendingException();
    }
}
