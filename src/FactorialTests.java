
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;

/**
 *
 * @author Indiaminah
 */
public class FactorialTests extends BaseTest { // contains 7 tests

    // tests base case with value 45
    @Test
    public void factorialBaseCaseTest() {
        driver.get("https://cs1632summer2019.herokuapp.com/factres/?value=45");
        String body;

        body = driver.findElement(By.tagName("body")).getText();
        body = body.replaceAll("\\n", " ");
        System.out.println(body);
        assertTrue(body.contains("Factorial of 45 is 119622220865480194561963161495657715064383733760000000000!"));

    }

    // tests edge case with value 1
    @Test
    public void factorialLowEdgeCaseTest() {

        driver.get("https://cs1632summer2019.herokuapp.com/factres/?value=1");
        String body;

        body = driver.findElement(By.tagName("body")).getText();
        body = body.replaceAll("\\n", " ");
        System.out.println(body);
        assertTrue(body.contains("Factorial of 1 is 1!"));
    }

    // tests edge case with value 100
    @Test
    public void factorialHighEdgeCaseTest() {

        driver.get("https://cs1632summer2019.herokuapp.com/factres/?value=100");
        String body;

        body = driver.findElement(By.tagName("body")).getText();
        body = body.replaceAll("\\n", " ");
        System.out.println(body);
        assertTrue(body.contains("Factorial of 100 is 93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000!"));
    }

    // tests invalid edge case with value 0
    @Test
    public void factorialInvalidLowEdgeCaseTest() {

        driver.get("https://cs1632summer2019.herokuapp.com/factres/?value=0");
        String body;

        body = driver.findElement(By.tagName("body")).getText();
        body = body.replaceAll("\\n", " ");
        System.out.println(body);
        assertTrue(body.contains("Factorial of 0 is 1!"));
    }

    // tests invalid edge case with value 101
    @Test
    public void factorialInvalidHighEdgeCaseTest() {

        driver.get("https://cs1632summer2019.herokuapp.com/factres/?value=101");
        String body;

        body = driver.findElement(By.tagName("body")).getText();
        body = body.replaceAll("\\n", " ");
        System.out.println(body);
        assertTrue(body.contains("Factorial of 101 is 1!"));
    }

    // tests invalid value -100
    @Test
    public void factorialInvalidLowTest() {

        driver.get("https://cs1632summer2019.herokuapp.com/factres/?value=-100");
        String body;

        body = driver.findElement(By.tagName("body")).getText();
        body = body.replaceAll("\\n", " ");
        System.out.println(body);
        assertTrue(body.contains("Factorial of -100 is 1!"));
    }

    // tests invalid value 200
    @Test
    public void factorialInvalidHighTest() {

        driver.get("https://cs1632summer2019.herokuapp.com/factres/?value=200");
        String body;

        body = driver.findElement(By.tagName("body")).getText();
        body = body.replaceAll("\\n", " ");
        System.out.println(body);
        assertTrue(body.contains("Factorial of 200 is 1!"));
    }
}
