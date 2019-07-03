
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;

public class HomepageTests extends BaseTest { // contains 2 tests

    // tests for welcome text in body while ignoring carriage returns
    @Test
    public void displayWelcomeTest() {
        driver.get("https://cs1632summer2019.herokuapp.com/");
        String body;

        body = driver.findElement(By.tagName("body")).getText();
        body = body.replaceAll("\\n", " ");
        assertTrue(body.contains("Welcome, friend, to a land of pure calculation"));
    }

    // tests for information text in body while ignoring carriage returns
    @Test
    public void displayInfoTest() {
        driver.get("https://cs1632summer2019.herokuapp.com/");
        String body;

        body = driver.findElement(By.tagName("body")).getText();
        body = body.replaceAll("\\n", " ");
        assertTrue(body.contains("Used for CS1632 Software Quality Assurance, taught by Dustin Iser"));
    }
}
