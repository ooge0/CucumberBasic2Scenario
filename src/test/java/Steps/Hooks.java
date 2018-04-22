package Steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    WebDriver driver = new ChromeDriver();
    @Before
    public void InitializeTest () {
        System.out.println("Opening the browsers : MOCK");
        driver.get("https://google.com");
    }
    @After
    public void TearDownTest (Scenario scenario) {

        if (scenario.isFailed()) {
            System.out.println(scenario.getName());
        }
        System.out.println("\nClosing  the browsers : MOCK");

        driver.quit();
    }
}
