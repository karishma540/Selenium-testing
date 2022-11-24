package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alt1 {
	WebDriver d;
	public void open_browser()
	{
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://demoqa.com/alertsWindows");
		d.manage().window().maximize();
	}
	public void title()
	{
		String a= d.getTitle();
		System.out.println(a);
		
	}
	public void url()
	{
		String b=d.getCurrentUrl();
		System.out.println(b);
	}
	public void alt_message() throws InterruptedException
	{
		d.findElement(By.id("timerAlertButton;")).click();
		Alert alt=d.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(2000);
		alt.accept();
	}
	public void close()
	{
		d.close();
		
	}
	public static void main(String args[]) throws InterruptedException {
		alt1 a1 = new alt1();
		a1.open_browser();
		a1.title();
		a1.url();
		a1.alt_message();
		a1.close();
	}
	
}
