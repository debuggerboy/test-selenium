package selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

    static WebDriver driver;

    public static void main(String[] args) {
        launchChrome();
        runTest();
    }

    public static void launchChrome() {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        #ChromeOptions chromeOptions = new ChromeOptions();
        #chromeOptions.addArguments("--headless");
        #chromeOptions.addArguments("--no-sandbox");
        driver = new ChromeDriver();
        driver.get ("https://www.google.com");

        //Maximize the window and delete all Cookies. Also set up a counter
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(driver.getTitle());
    }

    public static void runTest() {
        System.out.println(driver.getTitle());
    }
}
