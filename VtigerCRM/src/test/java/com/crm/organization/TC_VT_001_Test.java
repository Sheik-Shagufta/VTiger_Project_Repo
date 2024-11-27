package com.crm.organization;

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
public class TC_VT_001_Test extends BaseClass {
@Test(groups = "smoke")
public void OnorganizationLink() throws EncryptedDocumentException, IOException
{
	hp=new HomePage(driver);
	hp.getOrganizationLink().click();
	Assert.assertEquals(driver.getTitle(),eutil.getStringDataFromExcel("Organization", 1, 1),"User is not able to click on organization link");
	test.log(Status.PASS, "User is able to click on organization link");
}
}
