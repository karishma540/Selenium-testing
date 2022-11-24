package project3;

public class linkscount {

	public static void main(string[] args) {
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
		d.manage().window().minimize();
		d.findElement(By.linktext("REGISTER")).click();
		d.findElement(By.name("firstName")).sendkeys();
		
		
	}

}
