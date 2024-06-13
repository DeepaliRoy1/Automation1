package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class baseCassUtilization extends Baseclass{
	
	@Test
	public void createCustomer() {
		Reporter.log("Creted Customer",true);
	}
@Test
public void modifyCustomer() {
	Reporter.log("customer modify",true);
}
}