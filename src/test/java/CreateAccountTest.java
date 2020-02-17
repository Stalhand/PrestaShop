import PagesPrestashop.SignInPage;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

import java.util.*;

public class CreateAccountTest {
  private WebDriver driver;
  private WebDriverWait wait;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    wait = new WebDriverWait(driver,30);
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }

  @Test
  public void createAccount() throws InterruptedException {
    driver.get("http://demo.prestashop.com/");
    //driver.manage().window().setSize(new Dimension(710, 680));
    driver.switchTo().frame(0);
    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".user-info .material-icons")));
    driver.findElement(By.cssSelector(".user-info .material-icons")).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.linkText(("No account? Create one here"))));
   // driver.findElement(By.linkText("No account? Create one here")).click();
    SignInPage.createNewAccountButton(driver).click();
   //Thread.sleep(6000);
     wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(("body:nth-child(2)"))));
    driver.findElement(By.cssSelector(".radio-inline:nth-child(2) input")).click();
   // driver.findElement(By.name("firstname")).click();
    driver.findElement(By.name("firstname")).sendKeys("Test");
    //driver.findElement(By.name("lastname")).click();
    driver.findElement(By.name("lastname")).sendKeys("Lime");
   // driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).sendKeys("lime@test.com");
   // driver.findElement(By.name("password")).click();
    driver.findElement(By.name("password")).sendKeys("lime90");
   // driver.findElement(By.name("birthday")).click();
    driver.findElement(By.name("birthday")).sendKeys("01/01/1990");
   // driver.findElement(By.name("psgdpr")).click();
    driver.findElement(By.cssSelector(".form-control-submit")).click();
  }
}
