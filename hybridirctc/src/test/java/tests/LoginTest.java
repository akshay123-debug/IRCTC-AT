package tests;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.LoginPage;
import utils.RetryAnalyzer;

public class LoginTest extends BaseTest {

@Test(priority=1, groups={"p0"}, retryAnalyzer=RetryAnalyzer.class)
public void verifyLogin(){

new LoginPage(driver).clickLogin();

}
}