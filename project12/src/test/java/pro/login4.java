package pro;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login4 {
	WebDriver d;
	
	@Given("user is in newtour application")
	public void user_is_in_newtour_application() {
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		d= new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
		
	}

	@When("user need to enter username and password")
	public void user_need_to_enter_username_and_password() throws IOException {
		//FileInputStream f1=new FileInputStream("C:\\Users\\91939\\eclipse-workspace\\project12\\src\\test\\java\\pro\\login4.properties");
		//Properties p1=new Properties();
		//p1.load(f1);
		By a=By.name("userName");
		By b=By.name("password");
		
		d.findElement(a).sendKeys("karishma");
		d.findElement(b).sendKeys("password");
	    
	}

	@Then("user needs to click on login button")
	public void user_needs_to_click_on_login_button() {
		d.findElement(By.name("submit")).click();
	    
	}

	@And("user nav to home page")
	public void user_nav_to_home_page() {
		d.close();
	   
	}



}
