package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RightclickOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver d = new FirefoxDriver();
		d.get("");
		d.manage().window().maximize();
		WebElement link = d.findElement(By.linkText("Gmail"));
		

	}

}
