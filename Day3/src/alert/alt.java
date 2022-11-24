package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alt {
	WebDriver d;
	public void open_browser() {
		System.setProperty("webdriver.chromedriver","C://chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("");
		d.manage().window().maximize();
	}
	public void title() {
		System.out.println(d.getTitle());
	}
	public void current_url() {
		System.out.println(d.getCurrentUrl());
	}
	public void confirmation() throws InterruptedException {
		d.findElement(By.id("")).click();
		Alert alt=d.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(2000);
		alt.accept();
		WebElement text = d.findElement(By.id(""));
		System.out.println(text.getText());
	}
	public void close() {
		d.close();
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		alt a= new alt();
		a.open_browser();
		a.title();
		a.current_url();
		a.confirmation();
		a.close();
		
		

	}

}
