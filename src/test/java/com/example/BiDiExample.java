package com.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.edge.EdgeOptions;

public class BiDiExample {
    public static void main(String[] args) {
        WebDriver driver = null;
        String browser = "chrome";

        try {
            System.out.println("Setting up WebDriver for: " + browser);

            switch (browser.toLowerCase()) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions chromeOptions = new ChromeOptions();
                    driver = new ChromeDriver(chromeOptions);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    FirefoxOptions firefoxOptions = new FirefoxOptions();
                    driver = new FirefoxDriver(firefoxOptions);
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    EdgeOptions edgeOptions = new EdgeOptions();
                    driver = new EdgeDriver(edgeOptions);
                    break;
                default:
                    throw new IllegalArgumentException("Browser not supported: " + browser);
            }

            System.out.println("Navigating to the URL...");
            driver.get("https://www.postman.com/api-platform/api-testing/");
            System.out.println("Page loaded successfully.");

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
