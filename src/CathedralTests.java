import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 *
 * @author Indiaminah
 */
public class CathedralTests extends BaseTest { // contains 3 tests

    // tests for presence ordered list in page
    @Test
    public void displayOrderedListTest() {
        driver.get("https://cs1632summer2019.herokuapp.com/cathy");
        boolean list;

        list = driver.findElement(By.tagName("ol")).isDisplayed();
        assertTrue(list);
    }

    // tests that there are 3 images on this webpage
    @Test
    public void displayImgNumTest() {
        driver.get("https://cs1632summer2019.herokuapp.com/cathy");
        Integer counter = 0;
        List<WebElement> listImages = driver.findElements(By.tagName("img"));
        // converted iterative to functional using netbeans IDE
        counter = listImages.stream().filter((image) -> (image.isDisplayed())).map((_item) -> 1).reduce(counter, Integer::sum);
        assertTrue(counter == 3);
    }

    // tests for image names to (kind of) ensure that these are pictures of the cathedral
    @Test
    public void displayImgNamesTest() {
        driver.get("https://cs1632summer2019.herokuapp.com/cathy");
        Integer counter = 0;
        List<WebElement> listImages = driver.findElements(By.tagName("img"));
        System.out.println("No. of Images: " + listImages.size());
        // converted iterative to functional using netbeans IDE
        counter = listImages.stream().filter((image) -> (image.isDisplayed())).filter((image) -> (image.getAttribute("alt").toLowerCase().contains("cathedral"))).map((_item) -> 1).reduce(counter, Integer::sum);

        // if each img title contains the term 'catherdral', the test passes
        assertTrue(counter == 3);
    }

}
