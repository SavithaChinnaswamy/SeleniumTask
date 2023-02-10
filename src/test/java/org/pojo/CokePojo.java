package org.pojo;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CokePojo extends BaseClass
{
	public CokePojo() 
	{
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath = "(//a[@class='lte-top-search-ico fa fa-search'])[2]")
	private WebElement searchbtn;
	
	@FindBy(xpath = "(//input[@placeholder='Search'])[2]")
	private WebElement searchtxtfield;
	
	@FindBy(xpath = "(//input[@placeholder='Search'])[2]")
	private WebElement enterbtn;
	
	@FindBy(xpath = "(//div[@class='lte-image'])[1]")
	private WebElement fooditem;
	
	public WebElement getSearchbtn() {
		return searchbtn;
	}

	public WebElement getSearchtxtfield() {
		return searchtxtfield;
	}

	public WebElement getEnterbtn() {
		return enterbtn;
	}

	public WebElement getFooditem() {
		return fooditem;
	}

	
	

}
