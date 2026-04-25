package pages;

import org.openqa.selenium.WebDriver;

public class BookingPage {

WebDriver driver;

public BookingPage(WebDriver driver){
this.driver = driver;
}

public void enterPassengerDetails(){

System.out.println("Passenger details entered");

}
}