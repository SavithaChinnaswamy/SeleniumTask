package org.pojo;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPojo extends BaseClass
{
	public RegisterPojo()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//i[@class='fa fa fa-user']")
	private WebElement Actbtn;
	
	@FindBy(xpath = "(//input[@type='text'])[4]")
	private WebElement namefield;
	
	@FindBy(xpath = "//input[@type='email']")
	private WebElement emailfield;
	
	@FindBy(xpath = "(//input[@type='text'])[5]")
	private WebElement phoneno;
	
	@FindBy(xpath = "(//input[@type='password'])[2]")
	private WebElement pwdfield;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement registerbtn;

	public WebElement getActbtn() {
		return Actbtn;
	}

	public WebElement getNamefield() {
		return namefield;
	}

	public WebElement getEmailfield() {
		return emailfield;
	}

	public WebElement getPhoneno() {
		return phoneno;
	}

	public WebElement getPwdfield() {
		return pwdfield;
	}

	public WebElement getRegisterbtn() {
		return registerbtn;
	}
	
	
	
	

}
