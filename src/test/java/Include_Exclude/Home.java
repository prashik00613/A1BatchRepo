package Include_Exclude;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Home {
	@Test
	public void HomeApp() {
		Reporter.log("Home page of Appp is working fine",true);
		
	}
	@Test
	public void HomeVerfiy() {
		Reporter.log("Home page verify",true);
		
	}

}
