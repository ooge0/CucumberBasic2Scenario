package Steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


import java.util.ArrayList;
import java.util.List;

// change order of method 1
public class LoginStep {

    @Given("^I navigate to the login page$")
    public void iNavigateToLoginPage() throws Throwable {
        System.out.println("I navigate to the login page \n");
        //throw new PendingException();

    }

    @And("^I click the login button$")
    public void iClickLoginButton() throws Throwable {
        System.out.println("I click the login form \n");
        // throw new PendingException();
    }

    @Then("^I should see the userform$")
    public void iShouldSeeTheUserform() throws Throwable {
        System.out.println("I should see the user form");
        // throw new PendingException();
        //sdfdsfv
    }

    @And("^I enter the the following for login$")
    public void iEnterTheTheFollowingForLogin(DataTable table) throws Throwable {
       // List<List<String>> data = table.raw();

        //create an ArrayList
        List<User> users = new ArrayList<User>();

        // store all users
        users = table.asList(User.class);
        //create FOR cycle for each elements of List <user> //

        for (User user: users) {
            System.out.println("UserName is " + user.username);
            System.out.println("Password is " + user.password);
        }

        //throw new PendingException();
    }

    @And("^I enter ([^\"]*) and ([^\"]*)$")
    public void iEnterUsernameAndPassword(String userName , String password) throws Throwable {
        System.out.println("Username is : " + userName);
        System.out.println("Password is : " + password);

    }

    public class User {

        public String username;
        public String password;

        public User(String userName, String passWord) {
            username = userName;
            password = passWord;
        }



    }

}
