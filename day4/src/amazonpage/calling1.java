package amazonpage;

import org.openqa.selenium.chrome.ChromeDriver;

public class calling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		String Baseurl="https://demo.guru99.com/test/newtours/register.php";
		d.get(Baseurl);
		d.manage().window().maximize();
		POM2 a2=new POM2(d);
		a2.Fname();
		a2.Lname();
		a2.phone();
		a2.Uname();
		a2.Country();

	}

}
