package Steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    @Before
    public void InitializeTest () {
        System.out.println("Opening the browsers : MOCK");
    }
    @After
    public void TearDownTest (Scenario scenario) {
        if (scenario.isFailed()) {
            System.out.println(scenario.getName());
        }
        System.out.println("\nClosing  the browsers : MOCK");
    }
}
