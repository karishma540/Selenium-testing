package amazonpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM2 {
	WebDriver d;
	By Fname=By.name("firstName");
	By Lname=By.name("lastName");
	By phone=By.name("phone");
	By Uname=By.name("userName");
	By Country=By.name("country");
	
	POM2(WebDriver d)
	{
		this.d=d;
	}
	public void Fname() {
		d.findElement(Fname).sendKeys("test123");
		
	}
	public void Lname() {
		d.findElement(Lname).sendKeys("testing...");
		
	}
	public void phone() {
		d.findElement(phone).sendKeys("7894561123");
		
	}
	public void Uname() {
		d.findElement(Uname).sendKeys("testerheroine");
		
	}
	public void Country() {
		d.findElement(Country).sendKeys("Indiaaaaaa");
		
	}

}
