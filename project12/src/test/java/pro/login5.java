package pro;

import java.io.FileInputStream;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login5 {
	WebDriver d;
	@Given("user open newtours page")
	public void user_open_newtours_page() {
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		d= new ChromeDriver();
		d.get("");
		d.manage().window().maximize();
		
	}

	@When("user need to click on register")
	public void user_need_to_click_on_register() {
	    d.find eElement
	}

	@Then("user need to get country name from dropdown")
	public void user_need_to_get_country_name_from_dropdown() {
		FileInputStream f = new FileInputStream("");
		XSSFworkbook wb = new XSSFworkbook();
		WebElement a=d.findElement(By.id());
		List<webElement> c= a.findElement(By.tagName(""));
		System.out.println(c.size());
		for (int i =0;i<c.size();i++)
		{
			System.out.println(c1.get(i).getText());
			r=ws.createRow(i);
			r.createCell(0).setcellvalue(i+1);
			r.createCell(0).setcellvalue(c1.get(i).getText());
			c1.get(i).click();
			if(!c1.get(i).isSelected()) {
				r.createCell(1).setCellValue("fail");
			}
			else {
				r.createCell(1).setCellCalue("pass");
			}
		}
	    
	}

	@Then("user navigates back to home page")
	public void user_navigates_back_to_home_page() {
		d.navigate().
	    
	}

	@Then("user closes the browser")
	public void user_closes_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
