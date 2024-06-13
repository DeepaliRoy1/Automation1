package TestNG;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class sunNg {
	@Test(priority = 2)
	public void ModifyCustomer() {
		Reporter.log("Customer Modify", true);
		
	}
	@Test(priority = 1)
	public void customerDeleted() {
		Assert.fail();
		Reporter.log("Customer Deleted", true);
	}
	@Test(invocationCount = 5,priority = 3)
	public void createdCustomer() {
		Reporter.log("Customer created", true);

	}


}
