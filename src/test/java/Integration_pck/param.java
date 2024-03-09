package Integration_pck;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class param {
	@Parameters({"un","pwd"})
	@Test
	public void test01(String un, String pwd) {
		Reporter.log(un,true);
		Reporter.log(pwd,true);
	}

	}
