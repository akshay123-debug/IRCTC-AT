package tests;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.SeatAvailabilityPage;

public class SeatAvailabilityTest extends BaseTest {

@Test(priority=3, groups={"p0"})
public void verifySeat(){

new SeatAvailabilityPage(driver).verifySeatAvailability();

}
}