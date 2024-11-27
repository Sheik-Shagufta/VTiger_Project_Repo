package com.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(linkText = "Calendar")
	private WebElement calendarLink;
	@FindBy(linkText = "Leads")
	private WebElement leadsLink;
	@FindBy(linkText = "Organizations")
	private WebElement organizationLink;
	@FindBy(linkText = "Contacts")
	private WebElement contactsLink;
	@FindBy(linkText = "Opportunities")
	private WebElement opportunitiesLink;
	@FindBy(linkText = "Products")
	private WebElement productsLink;
	@FindBy(linkText = "Documents")
	private WebElement documentsLink;
	@FindBy(linkText = "Email")
	private WebElement emailLink;
	@FindBy(linkText = "Trouble Tickets")
	private WebElement trouticketsLink;
	@FindBy(linkText = "Dashboard")
	private WebElement dashboardLink;
	@FindBy(xpath = "//img[contains(@src,'themes/softed/images/user')]")
	private WebElement profileIcon;
	@FindBy(xpath = "//span[text()=' Administrator']")
	private WebElement administratorLink;
	@FindBy(linkText = "Sign Out")
	private WebElement signoutLink;
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getCalendarLink() {
		return calendarLink;
	}
	public WebElement getLeadsLink() {
		return leadsLink;
	}
	public WebElement getOrganizationLink() {
		return organizationLink;
	}
	public WebElement getContactsLink() {
		return contactsLink;
	}
	public WebElement getOpportunitiesLink() {
		return opportunitiesLink;
	}
	public WebElement getProductsLink() {
		return productsLink;
	}
	public WebElement getDocumentsLink() {
		return documentsLink;
	}
	public WebElement getEmailLink() {
		return emailLink;
	}
	public WebElement getTrouticketsLink() {
		return trouticketsLink;
	}
	public WebElement getDashboardLink() {
		return dashboardLink;
	}
	public WebElement getAdministratorLink() {
		return administratorLink;
	}
	public WebElement getSignoutLink() {
		return signoutLink;
	}
	public WebElement getProfileIcon() {
		return profileIcon;
	}
	

}
