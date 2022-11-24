package tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class defaultconstructor {
	WebDriver d;
	defaultconstructor(){
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		d=new ChromeDriver();
		
		d.get("");
		d.manage().window().maximize();
		d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]")).sendKeys("KARISH");
		d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("K@RI!!!");
		d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));	
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		defaultconstructor g = new defaultconstructor();

	}

}
