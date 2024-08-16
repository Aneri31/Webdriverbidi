package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class demo {
    public static void main(String[] args) {
        // Set the path to the Edge WebDriver executable
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Unity_0118\\Downloads\\edgedriver_win64\\msedgedriver.exe");

        // Initialize the Edge driver
        WebDriver driver = new EdgeDriver();

        // Use the driver to open a webpage
        driver.get("https://appium.io/docs/en/latest/");

        // Perform your test steps...


        // Close the browser
        driver.quit();
    }
}
