package org.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojo.OmeletPojo;

import cucumber.api.java.en.When;

public class OmeletClass extends BaseClass
{
	OmeletPojo o ;
	
	@When("To click on search button")
	public void to_click_on_search_button()
	{
	    o = new OmeletPojo();
	    clickBtn(o.getSearchbutton());
	}

	@When("To pass the Spanish Omelet food item as the input to search field")
	public void to_pass_the_Spanish_Omelet_food_item_as_the_input_to_search_field()
	{
		 o = new OmeletPojo();
		 passText("Spanish Omelet", o.getSearchfield());
	}

	@When("To click Enter button")
	public void to_click_Enter_button() throws AWTException
	{
		 o = new OmeletPojo();
		 Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
	}

	@When("To click on food item that user searched")
	public void to_click_on_food_item_that_user_searched() 
	{
		 o = new OmeletPojo();
		 clickBtn(o.getOmelet());
	}

	@When("To check the cost probability of food item")
	public void to_check_the_cost_probability_of_food_item() 
	{
	    WebElement cost = driver.findElement(By.xpath("(//span[text()='Available at 08:00 AM'])[1]"));
	    String txt1 = cost.getText();
	    System.out.println(txt1);
	}

}
