package project6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class linkscount {
	WebDriver d;
	public void links() {
		WebElement link=d.findElement(By.id(""));
		List<webElement>links=link.findElement(By.tagName("a"));
	}

	public static void main (String[] args)
	{
		scenario1 s1 = new scenario1();
		s1.openUrl();
		s1.signup();
		s1.register();
	}

}
