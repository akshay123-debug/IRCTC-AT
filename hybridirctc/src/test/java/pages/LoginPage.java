package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

public class LoginPage {

WebDriver driver;

By loginBtn = By.xpath("//a[contains(text(),'LOGIN')]");

public LoginPage(WebDriver driver){
this.driver=driver;
}

public void clickLogin(){

WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
wait.until(ExpectedConditions.elementToBeClickable(loginBtn)).click();

}
}