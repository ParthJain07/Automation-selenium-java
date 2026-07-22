package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
    public WebDriver driver;

    public WebDriver WebDriverManager() throws IOException {
        String system_url= "D://imp//Study//Project//Automation//BDD-FRAMEWORK//CucumberFramework";
        FileInputStream fis = new FileInputStream(system_url+"//src//test//resources//global.properties");
        Properties prop = new Properties();
        prop.load(fis);
        String url = prop.getProperty("QAurl");

        if(driver == null){
            if(prop.getProperty("browser").equalsIgnoreCase("chrome")){

                System.setProperty("webdriver.chrome.driver",system_url+"//src//test//resources//chromedriver.exe" );
                driver = new ChromeDriver();
            }
            driver.get(url);
        }

        return driver;
    }
}
