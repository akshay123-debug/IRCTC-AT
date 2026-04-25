package tests;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.SearchPage;

public class SearchTest extends BaseTest {

@Test
public void verifySearch(){

new SearchPage(driver).verifySameSourceDestination();

}
}