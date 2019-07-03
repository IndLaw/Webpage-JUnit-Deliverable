
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;

/**
 *
 * @author Indiaminah
 */
public class FibonacciTests extends BaseTest { // contains 7 tests

    // tests base case with value 12
    @Test
    public void fibonacciBaseCaseTest() {
        driver.get("https://cs1632summer2019.herokuapp.com/fibres/?value=12");
        String body;

        body = driver.findElement(By.tagName("body")).getText();
        body = body.replaceAll("\\n", " ");
        System.out.println(body);
        assertTrue(body.contains("Fibonacci of 12 is 233!"));
    }

    // tests edge case with value 1
    @Test
    public void fibonacciLowEdgeCaseTest() {
        driver.get("https://cs1632summer2019.herokuapp.com/fibres/?value=1");
        String body;

        body = driver.findElement(By.tagName("body")).getText();
        body = body.replaceAll("\\n", " ");
        System.out.println(body);
        assertTrue(body.contains("Fibonacci of 1 is 1!"));
    }

    // tests edge case with value 30
    @Test
    public void fibonacciHighEdgeCaseTest() {
        driver.get("https://cs1632summer2019.herokuapp.com/fibres/?value=30");
        String body;

        body = driver.findElement(By.tagName("body")).getText();
        body = body.replaceAll("\\n", " ");
        System.out.println(body);
        assertTrue(body.contains("Fibonacci of 30 is 1346269!"));
    }

    // tests invalid edge case with value 0
    @Test
    public void fibonacciInvalidLowEdgeCaseTest() {
        driver.get("https://cs1632summer2019.herokuapp.com/fibres/?value=0");
        String body;

        body = driver.findElement(By.tagName("body")).getText();
        body = body.replaceAll("\\n", " ");
        System.out.println(body);
        assertTrue(body.contains("Fibonacci of 0 is 1!"));
    }

    // tests invalid edge case with value 31
    @Test
    public void fibonacciInvalidHighEdgeCaseTest() {
        driver.get("https://cs1632summer2019.herokuapp.com/fibres/?value=31");
        String body;

        body = driver.findElement(By.tagName("body")).getText();
        body = body.replaceAll("\\n", " ");
        System.out.println(body);
        assertTrue(body.contains("Fibonacci of 31 is 1!"));
    }

    // tests invalid value -15
    @Test
    public void fibonacciInvalidLowTest() {
        driver.get("https://cs1632summer2019.herokuapp.com/fibres/?value=-15");
        String body;

        body = driver.findElement(By.tagName("body")).getText();
        body = body.replaceAll("\\n", " ");
        System.out.println(body);
        assertTrue(body.contains("Fibonacci of -15 is 1!"));
    }

    // tests invalid value 60
    @Test
    public void fibonacciInvalidHighTest() {
        driver.get("https://cs1632summer2019.herokuapp.com/fibres/?value=60");
        String body;

        body = driver.findElement(By.tagName("body")).getText();
        body = body.replaceAll("\\n", " ");
        System.out.println(body);
        assertTrue(body.contains("Fibonacci of 60 is 1!"));
    }
}
