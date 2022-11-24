package pro;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login6 {
	WebDriver d;
	@Given("an amazon page and opening an amazon page")
	public void an_amazon_page_and_opening_an_amazon_page() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		d=new ChromeDriver();
		
		
	}

	@When("page is opened")
	public void page_is_opened() {
		d.get("");
		d.manage().window().maximize();
		
	}

	@Then("capture all the links")
	public void capture_all_the_links() {
		WebElement w = d.findElement(By.id(""));
		List<WebElement> w = d.findElements(By.tagName(""));
		System.out.println(lw.size());
		for (int i=0;i<lw.size();i++)
		{
			System.out.println(lw.get(i).getText());
			lw.get(i).click();
			Thread.sleep(2000);
			d.navigate().back();
			w = d.findElements(By.id(""));
			lw = d.findElement(By.tagName(""));
		}
		
		
	}

	@Then("get url and get title")
	public void get_url_and_get_title() {
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		
	}

	@Then("store in the excel sheet and close the window")
	public void store_in_the_excel_sheet_and_close_the_window() throws IOException {
		FileInputStream f = new FileInputStream(" ");
		XSSFWorkbook wb = new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("sheet1");
		Row r= null;
		Cell c=null;
		r=ws.createRow(i);
		
		
	}
}
