import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrestaShopTest1 {

static WebDriver driver = new ChromeDriver();

    @BeforeClass
    public static void setup() {
        System.out.println("BeforeClass -- setup");
        driver.get("http://demo.prestashop.com");

    }

    @Test
    public void signIn(){


    }
}
