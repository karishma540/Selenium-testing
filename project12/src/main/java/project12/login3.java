package project12;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login3 {
	ChromeDriver d;
	
	@Given("user is in dezlearn.com")
	public void user_is_in_dezlearn_com() {
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exc");
		d= new ChromeDriver();
		d.get("");
		d.manage().window().maximize();
		
	}

	@When("user gets the url and title")
	public void user_gets_the_url_and_title() {
		System.out.println(d.getCurrentUrl());
		System.out.println(d.getTitle());
	    
	}

	@Then("user works on alert")
	public void user_works_on_alert() {
	   d.findElement(By.id("")).click();
	   Alert alt = d.switchTo().alert();
	   System.out.println(); 
	   
	   
	}

	@And("user captures screenshot and close the window")
	public void user_captures_screenshot_and_close_the_window() {
	    File img = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	    FileUtils
	}


}
