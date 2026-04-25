package tests;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.BookingPage;

public class BookingTest extends BaseTest {

@Test
public void verifyPassengerBooking(){

new BookingPage(driver).enterPassengerDetails();

}
}