package com.crm.contacts;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.crm.genricutility.BaseClass;
import com.crm.genricutility.ListenerUtility;
import com.crm.objectrepository.HomePage;
@Listeners(ListenerUtility.class)
public class TC_VT_001_Test extends BaseClass{
	@Test
	public void clickOnContactsLink()
	{
		hp=new HomePage(driver);
		hp.getContactsLink().click();
		Assert.assertNotEquals(driver.getTitle(), "Administrator - Contacts - vtiger CRM 5 - Commercial Open Source CRM","user is not able click on contacts link");
		test.log(Status.PASS, "User is able to click on contacts link");
		
	}

}
