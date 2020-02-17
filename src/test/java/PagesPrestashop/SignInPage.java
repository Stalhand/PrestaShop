package PagesPrestashop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {

    static String logingubbecss = ".user-info .material-icons";

    public static WebElement emailField(WebDriver driver){
        WebElement element = driver.findElement(By.name("email"));
        return element;
    }

    public static WebElement loginGubbe (WebDriver driver){
        WebElement element = driver.findElement(By.cssSelector(logingubbecss));
        return element;
    }

public static WebElement createNewAccountButton(WebDriver driver){
    WebElement element = driver.findElement(By.linkText("No account? Create one here"));
    return element;

}
}
