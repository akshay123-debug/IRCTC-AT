package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

public static String getValue(String key)throws Exception{

Properties p = new Properties();

p.load(new FileInputStream("src/test/resources/config.properties"));

return p.getProperty(key);

}
}