package inetrnal_files;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dd1_amazonpage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f1 = new FileInputStream("");
		XSSFworkbook wb= new XSSFworkbook(f1);
		XSSFsheet ws =wb.getSheet("sheet1");
		Row r = null;
		Cell c= null;
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("");
		d.manage().window().maximize();
		
		
		WebElement drop= d.findElement(By.id(""));
		List<WebElement>drop1=drop.findElement(By.tagName(""));
		System.out.println(drop1.size());
		for(int i=0;i<drop1.size();i++)
		{
			System.out.println(drop1.get(i).getText());
			r=ws.createRow(i);
			r.createCell(0).setCellValue(drop1.get(i).getText());
			drop1.get(i).click();
			if(!drop1.get(i).isSelected())
			{
				r.createCell(1).setCell("fail");
			}
					
			else
			{
				r.createCell(1).setCell("pass");
			}
		}
		FileOutputStream f2 = new FileOutputStream();
		wb.write(f2);
		f2.close();

	}

}
