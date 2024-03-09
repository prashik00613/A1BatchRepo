package Include_Exclude;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Login {
	@Test
	public void LoginApp() {
		Reporter.log("Login to app is working",true);
		
	}
	@Test
	public void VerifyLoginApp() {
		Reporter.log("LoginApp process is working",true);
		
	}

}
