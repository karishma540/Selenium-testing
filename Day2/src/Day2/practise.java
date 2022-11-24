package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		ChromeDriver d =new ChromeDriver();
		d.get("https://demoqa.com/text-box");
		d.manage().window().maximize();
		d.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("KARISHMA JEENATH");
		d.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("karishma@gmail.com");
		d.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys("COLLEGE");
		d.findElement(By.xpath("//*[@id=\"permanentAddress\"]")).sendKeys("HOME");
		Thread.sleep(2000);
		WebElement t= d.findElement(By.id("submit"));
		t.click();
		String s=d.findElement(By.xpath("//*[@id=\"output\"]/div")).getText();
		System.out.println(s);
	}

}
