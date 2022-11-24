package project12;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login1 {
	ChromeDriver d;
	@Given("user is in newtours page")
	public void user_is_in_newtours_page() {
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		d= new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
		d.manage().window().maximize();
	}

	@When("user needs to enter username and password")
	public void user_needs_to_enter_username_and_password() {
		d.findElement(By.name("userName")).sendKeys("manual testing");
		d.findElement(By.name("password")).sendKeys("manual testing");
	}

	@Then("user clicks on login button")
	public void user_clicks_on_login_button() throws InterruptedException {
		Thread.sleep(2000);
		d.findElement(By.name("submit")).click();
	}

	@And("user navigate to home page")
	public void user_navigate_to_home_page() {
		System.out.println("navigated to homepage");
		d.close();
	}


}
