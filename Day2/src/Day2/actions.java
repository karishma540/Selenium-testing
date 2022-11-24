package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://jqueryui.com/menu/");
		d.manage().window().maximize();
		d.switchTo().frame(0);
		
		
		
		
	WebElement Music = d.findElement(By.id("ui-id-9"));
	Music.click();
	Thread.sleep(2000);
	
	
	
	WebElement Jazz = d.findElement(By.id("ui-id-13"));
	Jazz.click();
	Thread.sleep(2000);
	
	
	
	WebElement Modern = d.findElement(By.id("ui-id-16"));
	Modern.click();
	Thread.sleep(2000);
	
	
	Actions Act = new Actions(d);
	Act.moveToElement(Music).moveToElement(Jazz).moveToElement(Modern).build().perform();
	
	
	
	
	

	}

}
