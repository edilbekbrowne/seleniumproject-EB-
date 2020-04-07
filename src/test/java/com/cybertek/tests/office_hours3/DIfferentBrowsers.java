package com.cybertek.tests.office_hours3;

import com.cybertek.base.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DIfferentBrowsers extends TestBase {

    @Test
    public void test() {
        // WHICH BROWSER AM I USING RIGHT NOW
        // get the value from propetries file
        System.out.println("OPTION 1");
        System.out.println(ConfigurationReader.getProperty("browser"));
        // get the value from the webdriver tostring
        System.out.println("OPTION 2");
        System.out.println(driver);
        if (driver.toString().contains("FirefoxDriver")) {
            System.out.println("this is firefox");
        } else if (driver.toString().contains("ChromeDriver")) {
            System.out.println("this is chrome");
        }
        // get th
        System.out.println("OPTION 3");

        if (driver instanceof FirefoxDriver) {
            System.out.println("This is firefoooooox");
        } else if (driver instanceof ChromeDriver) {
            System.out.println("This is chrome");
        }
    }
}