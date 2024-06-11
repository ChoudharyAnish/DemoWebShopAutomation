package com.demowebshop.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demowebshop.pageobjects.HomePage;

public class LogoValidationTest {
    WebDriver driver;
    HomePage homePage;

   
    @Test
    public void validateLogo() {
        // Validate that the logo is displayed
        Assert.assertTrue(homePage.isLogoDisplayed(), "Logo is not displayed");

        // Optionally, validate the logo source URL
        String expectedLogoSrc = "http://yourwebsite.com/path/to/logo.png";
        Assert.assertTrue(homePage.isLogoSrcCorrect(expectedLogoSrc), "Logo source URL is incorrect");
    


    }
}
