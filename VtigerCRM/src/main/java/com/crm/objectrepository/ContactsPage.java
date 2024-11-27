package com.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {
@FindBy(name = "search_text")
private WebElement searchForLink;
@FindBy(id = "bas_searchfield")
private WebElement searchInField;
@FindBy(xpath = "(//input[@value=' Search Now '])[1]")
private WebElement searchNowLink;
@FindBy(id = "viewname")
private WebElement filterBar;
@FindBy(linkText = "Create Filter")
private WebElement createFilterLink;
@FindBy(xpath = "//span[text()='Edit']")
private WebElement editFilterLink;
@FindBy(xpath = "//span[text()='Delete']")
private WebElement deleteFilterLink;
@FindBy(xpath = "(//input[@value='Delete'])[1]")
private WebElement deleteLink;
@FindBy(xpath = "(//input[@value='Mass Edit'])[1]")
private WebElement massEditLink;
@FindBy(xpath = "(//input[@value='Send Mail'])[1]")
private WebElement sendmailLink;
@FindBy(xpath = "(//input[@value='Send SMS'])[1]")
private WebElement sendSmsLink;
@FindBy(xpath = "//img[@title='Create Contact...']")
private WebElement createContactIcon;
public ContactsPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public WebElement getSearchForLink() {
	return searchForLink;
}
public WebElement getSearchInField() {
	return searchInField;
}
public WebElement getSearchNowLink() {
	return searchNowLink;
}
public WebElement getFilterBar() {
	return filterBar;
}
public WebElement getCreateFilterLink() {
	return createFilterLink;
}
public WebElement getEditFilterLink() {
	return editFilterLink;
}
public WebElement getDeleteFilterLink() {
	return deleteFilterLink;
}
public WebElement getDeleteLink() {
	return deleteLink;
}
public WebElement getMassEditLink() {
	return massEditLink;
}
public WebElement getSendmailLink() {
	return sendmailLink;
}
public WebElement getSendSmsLink() {
	return sendSmsLink;
}
public WebElement getCreateContactIcon() {
	return createContactIcon;
}

}
