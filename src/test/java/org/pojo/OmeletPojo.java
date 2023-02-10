package org.pojo;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OmeletPojo extends BaseClass
{
	public OmeletPojo()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[@class='lte-top-search-ico fa fa-search'])[2]")
	private WebElement searchbutton;
	
	@FindBy(xpath = "(//input[@placeholder='Search'])[2]")
	private WebElement searchfield;
	
	@FindBy(xpath = "(//input[@placeholder='Search'])[2]")
	private WebElement enterbutton;
	
	@FindBy(xpath = "//div[@class='lte-image']")
	private WebElement Omelet;

	public WebElement getSearchbutton() {
		return searchbutton;
	}

	public WebElement getSearchfield() {
		return searchfield;
	}

	public WebElement getEnterbutton() {
		return enterbutton;
	}

	public WebElement getOmelet() {
		return Omelet;
	}
	
	
	

}
