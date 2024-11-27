package com.crm.contacts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
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
	public void clickOnContactsLink() throws EncryptedDocumentException, IOException
	{
		hp=new HomePage(driver);
		hp.getContactsLink().click();
		Assert.assertNotEquals(driver.getTitle(),eutil.getStringDataFromExcel("Contacts", 1, 1),"user is not able click on contacts link");
		test.log(Status.PASS, "User is able to click on contacts link");
		
	}

}
