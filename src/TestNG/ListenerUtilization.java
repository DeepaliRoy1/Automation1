package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListnerImplemantaion.class)
public class ListenerUtilization extends Baseclass{

	@Test
	public void getScreenshot() {
		Reporter.log("take screenshot Sucessfully",true);
        Assert.fail();
 
	}
	@Test
	public void GetErrorScreenshot() {
		Assert.fail();
		Reporter.log("take double screenshot",true);
	}

}
