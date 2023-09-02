package org.poj;

import org.bas.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signpojo1 extends BaseClass {
	public signpojo1() {
	PageFactory.initElements(driver, this);
}

@FindBy(xpath = "//a[@data-testid='open-registration-form-button']")
private WebElement createacc;

@FindBy(xpath = "//input[@aria-label='First name']")
private WebElement fistname;

@FindBy(xpath = "//input[@aria-label='Surname']")
private WebElement surname;

@FindBy(xpath = "//input[@name='reg_email__']")
private WebElement emailid;

@FindBy(xpath = "//input[@name='reg_passwd__']")
private WebElement password;

public WebElement getCreateacc() {
	return createacc;
}

public WebElement getFistname() {
	return fistname;
}

public WebElement getSurname() {
	return surname;
}

public WebElement getEmailid() {
	return emailid;
}

public WebElement getPassword() {
	return password;
}



}



