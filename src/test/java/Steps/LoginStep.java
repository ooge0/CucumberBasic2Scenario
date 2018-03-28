package Steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import java.util.List;

// change order of method 1
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
    
    @Then("^I should see the userform$")
    public void iShouldSeeTheUserform() throws Throwable {
        System.out.println("I should see the user form");
        // throw new PendingException();
    }

    @And("^I enter the the following for login$")
    public void iEnterTheTheFollowingForLogin(DataTable table) throws Throwable {
        List<List<String>> data = table.raw();
        System.out.println("This value is " + data.get(0).get(0).toString());
        System.out.println("This value is "+ data.get(0).get(1).toString());
        //throw new PendingException();
    }
}
