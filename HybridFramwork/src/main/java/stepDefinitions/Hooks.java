package stepDefinitions;



import io.cucumber.java.After;

public class Hooks {

    @After
    public void tearDown() {
        System.out.println("Closing browser");
        // driver.quit();  // use shared driver if applicable
    }
}
