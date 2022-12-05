package selenium;

import or.openqa.selenium.WebDriver;
import or.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
    public static void main(string[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--window-size=1200x600");
        chromeOptions.addArguments("--no-sandbox");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get ("https://www.google.com");
        System.out.println(driver.getTitle());
    }
}
