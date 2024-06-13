package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class moonNG {
	@Test(priority = 2)
	public void ModifyCustomer() {
		Reporter.log("Customer Modify", true);
		
	}
	//@Test(priority = 1,enabled = false)--It will not execute the method
	@Test(priority = 1)
	public void customerDeleted() {
		Reporter.log("Customer Deleted", true);
	}
	@Test(invocationCount = 5,priority = 3)
	public void createdCustomer() {
		Reporter.log("Customer created", true);

	}

}
