package project6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class methods {
	WebDriver d;
	void Opening_browser() {
		System.setProperty("webdriver.chrome.driver","c://chromedrievr.exe");
		d= new chromedriver();
		d.get("");
	}
	public void Navigate() {
		d.manage().window().maximize();
	}
	public void usernameenter() {
		d.findElement(By.name("")).sendKeys("");
	}
	public void passwordenter() {
		d.findElement(By.name("")).sendKeys("");
	}
	public void click() {
		d.findElement(By.name("")).sendKeys("");
	}
	public void close() {
		d.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
