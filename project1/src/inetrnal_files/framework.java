package inetrnal_files;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class framework {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileInputStream f1 = new FileInputStream("C:\\Users\\91939\\eclipse-workspace\\project1\\src\\inetrnal_files\\p1.properties");
		Properties p1 = new Properties();
		p1.load(f1);
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		
		
		d.get(p1.getProperty("url"));
		d.manage().window().maximize();
		
		d.findElement(By.name("username")).sendKeys(p1.getProperty("username"));
		System.out.println(p1.getProperty("username"));
		
		
		
		d.findElement(By.name("password")).sendKeys(p1.getProperty("password"));
		System.out.println(p1.getProperty("password"));
		
		
		

	}

}
