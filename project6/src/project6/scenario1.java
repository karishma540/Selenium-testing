package project6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scenario1 {
	WebDriver d;
	public void openUrl()
	{
		
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		d = new ChromeDriver();
		d.get("https://itera-qa.azurewebsites.net/home/practice");
		d.manage().window().maximize();
		
	}
	public void signup()
	{
		d.findElement(By.linkText("Sign Up")).click();
	}
	public void register()
	{
		d.findElement(By.id("FirstName")).sendKeys("karishma");
		d.findElement(By.id("Surname")).sendKeys("karishma");
		d.findElement(By.id("E_post")).sendKeys("karishma");
		d.findElement(By.id("Mobile")).sendKeys("karishma");
		d.findElement(By.id("Username")).sendKeys("karishma");
		d.findElement(By.id("Password")).sendKeys("karishma");
		d.findElement(By.id("ConfirmPassword")).sendKeys("karishma");
		d.findElement(By.id("submit")).click();
		
		
	}
	public static void main (String[] args)
	{
		scenario1 s1 = new scenario1();
		s1.openUrl();
		s1.signup();
		s1.register();
	}

}
