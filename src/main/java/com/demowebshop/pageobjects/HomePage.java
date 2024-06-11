package com.demowebshop.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Locate the logo element
	@FindBy(xpath = "//*[@src=\"/Themes/DefaultClean/Content/images/logo.png\"]")
	WebElement logo;

	// Method to verify if the logo is displayed
	public boolean isLogoDisplayed() {
		return logo.isDisplayed();
	}

	public boolean isLogoSrcCorrect(String expectedLogoSrc) {
		// TODO Auto-generated method stub
		return false;
	}

}
