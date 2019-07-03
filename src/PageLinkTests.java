import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;

/**
 *
 * @author Indiaminah
 */
public class PageLinkTests extends BaseTest { // contains 5 tests

    // confirm that the homepage page contains linktext and that said linktext directs to the specified page
    @Test
    public void navigationHomepageTest() {
        boolean result = false;

        if (subLinkTest("https://cs1632summer2019.herokuapp.com/", "CS1632 D3 Home", "/")
                && subLinkTest("https://cs1632summer2019.herokuapp.com/", "Fibonacci", "/fib")
                && subLinkTest("https://cs1632summer2019.herokuapp.com/", "Hello", "/hello")
                && subLinkTest("https://cs1632summer2019.herokuapp.com/", "Cathedral Pics", "/cathy")
                && subLinkTest("https://cs1632summer2019.herokuapp.com/", "Factorial", "/fact")) {
            result = true;
        }

        assertTrue(result);

    }

    // confirm that the fibonacci page contains linktext and that said linktext directs to the specified page
    @Test
    public void navigationFibonacciTest() {
        boolean result = false;

        if (subLinkTest("https://cs1632summer2019.herokuapp.com/fib", "CS1632 D3 Home", "/")
                && subLinkTest("https://cs1632summer2019.herokuapp.com/fib", "Fibonacci", "/fib")
                && subLinkTest("https://cs1632summer2019.herokuapp.com/fib", "Hello", "/hello")
                && subLinkTest("https://cs1632summer2019.herokuapp.com/fib", "Cathedral Pics", "/cathy")
                && subLinkTest("https://cs1632summer2019.herokuapp.com/fib", "Factorial", "/fact")) {
            result = true;
        }

        assertTrue(result);

    }

    // confirm that the hello page contains linktext and that said linktext directs to the specified page
    @Test
    public void navigationHelloTest() {
        boolean result = false;

        if (subLinkTest("https://cs1632summer2019.herokuapp.com/hello", "CS1632 D3 Home", "/")
                && subLinkTest("https://cs1632summer2019.herokuapp.com/hello", "Fibonacci", "/fib")
                && subLinkTest("https://cs1632summer2019.herokuapp.com/hello", "Hello", "/hello")
                && subLinkTest("https://cs1632summer2019.herokuapp.com/hello", "Cathedral Pics", "/cathy")
                && subLinkTest("https://cs1632summer2019.herokuapp.com/hello", "Factorial", "/fact")) {
            result = true;
        }

        assertTrue(result);

    }

    // confirm that the cathedral page contains linktext and that said linktext directs to the specified page
    @Test
    public void navigationCathedralTest() {
        boolean result = false;

        if (subLinkTest("https://cs1632summer2019.herokuapp.com/cathy", "CS1632 D3 Home", "/")
                && subLinkTest("https://cs1632summer2019.herokuapp.com/cathy", "Fibonacci", "/fib")
                && subLinkTest("https://cs1632summer2019.herokuapp.com/cathy", "Hello", "/hello")
                && subLinkTest("https://cs1632summer2019.herokuapp.com/cathy", "Cathedral Pics", "/cathy")
                && subLinkTest("https://cs1632summer2019.herokuapp.com/cathy", "Factorial", "/fact")) {
            result = true;
        }

        assertTrue(result);

    }

    // confirm that the factorial page contains linktext and that said linktext directs to the specified page
    @Test
    public void navigationFactorialTest() {
        boolean result = false;

        if (subLinkTest("https://cs1632summer2019.herokuapp.com/fact", "CS1632 D3 Home", "/")
                && subLinkTest("https://cs1632summer2019.herokuapp.com/fact", "Fibonacci", "/fib")
                && subLinkTest("https://cs1632summer2019.herokuapp.com/fact", "Hello", "/hello")
                && subLinkTest("https://cs1632summer2019.herokuapp.com/fact", "Cathedral Pics", "/cathy")
                && subLinkTest("https://cs1632summer2019.herokuapp.com/fact", "Factorial", "/fact")) {
            result = true;
        }

        assertTrue(result);

    }

    // heavy lifter for navigation tests
    public boolean subLinkTest(String webpage, String title, String compare) {
        boolean result = false;

        driver.get(webpage);
        String link;

        link = driver.findElement(By.linkText(title)).getText();// check that text is indeed a link
        link = link.replaceAll("\\n", " "); // safety measure
        System.out.println(link);
        driver.findElement(By.linkText(link)).click(); // move to linked page

        String current = driver.getCurrentUrl(); // get current url
        result = current.contains(compare); // check that page is correct
        System.out.println(current);

        return result;
    }
}
