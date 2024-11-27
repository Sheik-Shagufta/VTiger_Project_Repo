package com.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {
@FindBy(name = "search_text")
private WebElement searchForTextField;
@FindBy(id = "bas_searchfield")
private WebElement searchInTextField;
@FindBy(xpath = "(//input[@value=' Search Now '])[1]")
private WebElement searchNowLink;
@FindBy(id = "viewname")
private WebElement filterBy;
@FindBy(linkText = "Create Filter")
private WebElement createFilterLink;
@FindBy(xpath = "//span[text()='Edit']")
private WebElement editFilter;
@FindBy(xpath = "//span[text()='Delete']")
private WebElement deleteFilter;
@FindBy(xpath = "(//input[@value='Delete'])[1]")
private WebElement deleteEntity;
@FindBy(xpath = "(//input[@value='Mass Edit'])[1]")
private WebElement massEditEntity;
@FindBy(xpath = "(//input[@value='Send Mail'])[1]")
private WebElement sendEntityMail;
@FindBy(xpath = "(//input[@value='Mailer Export'])[1]")
private WebElement mailerExportLink;
@FindBy(xpath = "(//input[@value='Send SMS'])[1]")
private WebElement SendSmsLink;
@FindBy(id="selectCurrentPageRec")
private WebElement selectCheckBox;
@FindBy(linkText = "Create Mail Merge templates ")
private WebElement createMailMergeTemplatesLink;
@FindBy(xpath = "//img[@title='Create Organization...']")
private WebElement createOrganizationIcon;
public OrganizationPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public WebElement getSearchForTextField() {
	return searchForTextField;
}
public WebElement getSearchInTextField() {
	return searchInTextField;
}
public WebElement getSearchNowLink() {
	return searchNowLink;
}
public WebElement getFilterBy() {
	return filterBy;
}
public WebElement getCreateFilterLink() {
	return createFilterLink;
}
public WebElement getEditFilter() {
	return editFilter;
}
public WebElement getDeleteFilter() {
	return deleteFilter;
}
public WebElement getDeleteEntity() {
	return deleteEntity;
}
public WebElement getMassEditEntity() {
	return massEditEntity;
}
public WebElement getSendEntityMail() {
	return sendEntityMail;
}
public WebElement getMailerExportLink() {
	return mailerExportLink;
}
public WebElement getSendSmsLink() {
	return SendSmsLink;
}
public WebElement getSelectCheckBox() {
	return selectCheckBox;
}
public WebElement getCreateMailMergeTemplatesLink() {
	return createMailMergeTemplatesLink;
}
public WebElement getCreateOrganizationIcon() {
	return createOrganizationIcon;
}

}
