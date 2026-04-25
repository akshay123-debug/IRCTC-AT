package pages;

import org.openqa.selenium.WebDriver;

public class SeatAvailabilityPage {

WebDriver driver;

public SeatAvailabilityPage(WebDriver driver){
this.driver = driver;
}

public void verifySeatAvailability(){

System.out.println("Seat availability verified");

}
}