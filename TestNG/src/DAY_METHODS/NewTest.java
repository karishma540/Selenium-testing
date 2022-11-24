package DAY_METHODS;

import org.testng.annotations.Test;

public class NewTest {
  @Test(priority=1)
  public void f() {
	  System.out.println("f");
  }
  @Test(priority=2)
  public void s() {
	  System.out.println("s");
  }
  @Test(priority=2)
  public void l() {
	  System.out.println("l");
	  
  }
  @Test(priority=4)
  public void result() {
	  System.out.println("nice");
  }
}
