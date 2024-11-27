package com.crm.contacts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.crm.genricutility.BaseClass;
import com.crm.genricutility.ListenerUtility;
import com.crm.objectrepository.ContactsPage;
import com.crm.objectrepository.CreateContactsPage;
import com.crm.objectrepository.HomePage;
@Listeners(ListenerUtility.class)
public class TC_VT_002_Test extends BaseClass{
@Test
public void createContact() throws EncryptedDocumentException, IOException {
	hp=new HomePage(driver);
	hp.getContactsLink().click();
	
	ContactsPage ctcpage=new ContactsPage(driver);
	ctcpage.getCreateContactIcon().click();
	CreateContactsPage createctc=new CreateContactsPage(driver);
	Assert.assertTrue(createctc.getLastNameTextField().isDisplayed(),"Create contact page is not displayed");
	test.log(Status.PASS, "Create contact page is displayed");
	createctc.getLastNameTextField().sendKeys(eutil.getStringDataFromExcel("Contacts", 1, 0));
	createctc.getSaveButton().click();
	String headerText = createctc.getContactHeaderText().getText();
	System.out.println(headerText);
	Assert.assertTrue(headerText.contains(eutil.getStringDataFromExcel("Contacts", 1, 0)), "Contact is not created");
	test.log(Status.PASS, "Contact is created");
}
}
