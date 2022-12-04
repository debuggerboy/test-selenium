package selenium;

import or.openqa.selenium.WebDriver;
import or.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
    public static void main(string[] args) {
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get ("https://www.google.com");
        System.out.println(driver.getTitle());
    }
}

