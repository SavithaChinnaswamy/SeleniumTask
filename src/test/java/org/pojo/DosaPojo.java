package org.pojo;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DosaPojo extends BaseClass
{
	public DosaPojo() 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//li[@id='menu-item-623']")
	private WebElement Menubtn;
	
	@FindBy(xpath = "(//li[@class='cat-item cat-item-356'])[4]")
	private WebElement Dosadropdown;
	
	@FindBy(xpath = "(//img[@width='480'])[1]")
	private WebElement masalDosa;
	


	public WebElement getMenubtn() {
		return Menubtn;
	}

	public WebElement getDosadropdown() {
		return Dosadropdown;
	}

	public WebElement getMasalDosa() {
		return masalDosa;
	}

	
	
	

	

}
