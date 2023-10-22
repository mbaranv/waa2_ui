package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;
public class DriverManager {
    private static WebDriver driver;

    private DriverManager() {

    }

    public static WebDriver getDriver() {
        String browser = ConfigReader.getProperty("browser");

        if (driver == null) {
            switch (browser) {

                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver = new SafariDriver();
                    break;

                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    break;

            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
        return driver;
    }
    public static void closeDriver(){
        if (driver !=null){
            driver.quit();
            driver=null;
        }
    }
}
