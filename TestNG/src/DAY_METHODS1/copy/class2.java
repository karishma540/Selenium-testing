package DAY_METHODS1.copy;

import org.testng.annotations.Test;

public class class2 {
	@Test(priority=1)
	public void login() {
		System.out.println("login");
		}
	@Test(priority=2)
	public void login1() {
		System.out.println("login2");
		}
	@Test(priority=3)
	public void login3() {
		System.out.println("login3");
		}
}
