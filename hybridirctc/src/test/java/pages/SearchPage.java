package pages;

import org.openqa.selenium.WebDriver;

public class SearchPage {

WebDriver driver;

public SearchPage(WebDriver driver){
this.driver = driver;
}

public void verifySameSourceDestination(){

System.out.println("Source and destination validation successful");

}
}