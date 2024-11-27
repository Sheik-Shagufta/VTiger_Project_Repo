package com.crm.organization;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.crm.genricutility.BaseClass;
import com.crm.genricutility.ListenerUtility;
import com.crm.objectrepository.CreateOrganizationPage;
import com.crm.objectrepository.HomePage;
import com.crm.objectrepository.OrganizationPage;
@Listeners(ListenerUtility.class)
public class TC_VT_002_Test extends BaseClass {
@Test
public void createOrganization() throws EncryptedDocumentException, IOException
{
	hp=new HomePage(driver);
	hp.getOrganizationLink().click();
	
	OrganizationPage orgPage=new OrganizationPage(driver);
	orgPage.getCreateOrganizationIcon().click();
	
	CreateOrganizationPage createorgpage=new CreateOrganizationPage(driver);
	Assert.assertTrue(createorgpage.getOrganizationNameTextField().isDisplayed(), "Create organization page is not displayed");
	test.log(Status.PASS, "Create organization page is displayed");
	String orgName = eutil.getStringDataFromExcel("Organization", 1, 0)+jutil.getRandomNumber();
	createorgpage.getOrganizationNameTextField().sendKeys(orgName);
	createorgpage.getSaveButton().click();
	
	String headerText = createorgpage.getDvHeaderText().getText();
	System.out.println(headerText);
	Assert.assertTrue(headerText.contains(orgName), "Organization is not created");
	test.log(Status.PASS, "Organization is created");
}
}
