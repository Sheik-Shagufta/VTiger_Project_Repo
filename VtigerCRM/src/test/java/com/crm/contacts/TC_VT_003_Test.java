package com.crm.contacts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
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
public class TC_VT_003_Test extends BaseClass{
	@Test
	public void createContactWithOrgName() throws EncryptedDocumentException, IOException {
		hp=new HomePage(driver);
		hp.getContactsLink().click();
		
		ContactsPage ctcpage=new ContactsPage(driver);
		ctcpage.getCreateContactIcon().click();
		CreateContactsPage createctcpage=new CreateContactsPage(driver);
		Assert.assertTrue(createctcpage.getLastNameTextField().isDisplayed(), "Create contact page is not displayed");
		test.log(Status.PASS, "Create contact page is displayed");
		createctcpage.getLastNameTextField().sendKeys(eutil.getStringDataFromExcel("Contacts", 2, 0));
		createctcpage.getSelectOrganizationLink().click();
		wutil.switchToWindow(driver, "Accounts&action");
		driver.findElement(By.xpath("//a[contains(text(),'Amazon')]")).click();
		wutil.switchToWindow(driver, "Contacts&action");
		createctcpage.getSaveButton().click();
		String orgname = createctcpage.getOrganizationNameTextField().getText();
		Assert.assertNotNull(orgname);
		test.log(Status.PASS, "Contact is created with organization name --->"+orgname);
		
	}

}
