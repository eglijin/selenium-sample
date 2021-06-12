package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    private static WebDriver driver;

    private static WebDriver startDriver() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();
        return driver;
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            return startDriver();
        } else {
            return driver;
        }
    }

    static void closeDriver() {
        driver.close();
    }
}
