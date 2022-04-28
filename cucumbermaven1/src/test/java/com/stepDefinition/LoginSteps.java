package com.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	
	WebDriver driver;
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
		System.out.println("Step1: User is on login page");
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
	}

	 @When("user enters username and password")
	 public void user_enters_username_and_password() {
		 System.out.println("Step2: User enters username and password");
		 driver.findElement(By.id("txtUsername")).sendKeys("admin");
		 driver.findElement(By.id("txtPassword")).sendKeys("admin123"); 
	 }

	@And("clicks on the login button")
	public void clicks_on_the_login_button() {
		System.out.println("Step3: Clicks on login button");
		driver.findElement(By.id("btnLogin")).click(); 
	}

	@Then("User should login and user should land on Homepage")
	public void user_should_login_and_user_should_land_on_homepage() {
		System.out.println("Step4: User should login and be on the home page");
		driver.quit();
	}
}
