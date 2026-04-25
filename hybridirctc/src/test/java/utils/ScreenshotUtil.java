package utils;

import java.io.File;
import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtil {

public static String capture(WebDriver driver,String name)throws Exception{

String path = "screenshots/"+name+".png";

File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

FileHandler.copy(src,new File(path));

return path;

}
}