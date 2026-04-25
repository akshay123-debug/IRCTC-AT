package tests;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.SearchPage;

public class SearchValidationTest extends BaseTest {

@Test(priority=2, groups={"p0"})
public void verifySameSourceDestination(){

new SearchPage(driver).verifySameSourceDestination();

}
}