import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;

/**
 *
 * @author Indiaminah
 */
public class HelloTests extends BaseTest { // contains 4 tests

    // tests accessing the hello page (/hello) with no trailing values in the URL
    @Test
    public void displayDefaultHelloTest() {
        driver.get("https://cs1632summer2019.herokuapp.com/hello");
        String body;

        body = driver.findElement(By.tagName("body")).getText();
        body = body.replaceAll("\\n", " ");
        assertTrue(body.contains("Hello CS1632, from Prof. Iser!"));
    }

    // tests accessing the hello page (/hello) with trailing value 'Jazzy' in the URL
    @Test
    public void displayTrailingValueJazzyTest() {
        driver.get("https://cs1632summer2019.herokuapp.com/hello/Jazzy");
        String body;

        body = driver.findElement(By.tagName("body")).getText();
        body = body.replaceAll("\\n", " ");
        assertTrue(body.contains("Hello CS1632, from Jazzy!"));
    }

    // tests accessing the hello page (/hello) with trailing value 'k' in the URL
    @Test
    public void displayTrailingValueSingleLetterTest() {
        driver.get("https://cs1632summer2019.herokuapp.com/hello/k");
        String body;

        body = driver.findElement(By.tagName("body")).getText();
        body = body.replaceAll("\\n", " ");
        assertTrue(body.contains("Hello CS1632, from k!"));
    }

    // tests accessing the hello page (/hello) with trailing value '4' in the URL
    @Test
    public void displayTrailingValueNumberTest() {
        driver.get("https://cs1632summer2019.herokuapp.com/hello/4");
        String body;

        body = driver.findElement(By.tagName("body")).getText();
        body = body.replaceAll("\\n", " ");
        assertTrue(body.contains("Hello CS1632, from 4!"));
    }

}
