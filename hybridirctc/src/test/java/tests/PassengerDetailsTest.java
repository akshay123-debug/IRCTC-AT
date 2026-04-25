package tests;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.BookingPage;

public class PassengerDetailsTest extends BaseTest {

@Test(priority=4, groups={"p0"})
public void verifyPassengerDetails(){

new BookingPage(driver).enterPassengerDetails();

}
}