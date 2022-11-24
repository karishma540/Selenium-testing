package amazonpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM1 {
	WebDriver d;
	By uName =By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input");
	By pass =By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input");
	By Button =By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
	
	POM1(WebDriver d)
	{
		this.d=d;
	}
	
	public void uName()
	{
		d.findElement(uName).sendKeys("Admin");
		
	}
	public void pass()
	{
		d.findElement(pass).sendKeys("Password...");
		
	}
	public void Button()
	{
		d.findElement(Button).click();
		
	}
	
}
