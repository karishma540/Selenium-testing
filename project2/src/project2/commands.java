package project2;

public class commands {
	public static void main (String[] args) {
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("http://www.amazon.com");
		d.manage().window().maximize();
		System.out.println(d.gettile());
		System.out.println(d.getCurrentUrl());
		d.findelement(By.id("searchDropdownbox")).sendkeys("Deals");
		
	}

}
