package org.pojo;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginStorypojo extends BaseClass
{
	public LoginStorypojo() 
	{
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath = "//i[@class='fa fa fa-user']")
	private WebElement Accountbtn;
	
	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement usernamefield;
	
	@FindBy(xpath = "(//input[@type='password'])[1]")
	private WebElement passwordfield;
	
	@FindBy(xpath = "(//button[@type='submit'])[1]")
	private WebElement loginbtn;

	public WebElement getAccountbtn() {
		return Accountbtn;
	}

	public WebElement getUsernamefield() {
		return usernamefield;
	}

	public WebElement getPasswordfield() {
		return passwordfield;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	

}
