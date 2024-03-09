package Include_Exclude;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Launch {
	@Test
	public void LaunchApp() {
		Reporter.log("Launch is working fine",true);
		
	}
	@Test
	public void LaunchVerfiy() {
		Reporter.log("Launch URL is working",true);
		
	}

}
