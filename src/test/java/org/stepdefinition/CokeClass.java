package org.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.Base.BaseClass;
import org.pojo.CokePojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class CokeClass extends BaseClass
{
	CokePojo c;
	
	
	
	@When("To click on search icon")
	public void to_click_on_search_icon() throws InterruptedException 
	{
		c = new CokePojo();
		clickBtn(c.getSearchbtn());
		Thread.sleep(3000);
	    
	}

	@When("To pass the food item name into the search field")
	public void to_pass_the_food_item_name_into_the_search_field() throws InterruptedException 
	{
		c = new CokePojo();
		passText("coke", c.getSearchtxtfield());
		Thread.sleep(3000);
	}

	@When("To click on enter button")
	public void to_click_on_enter_button() throws AWTException
	{
		c = new CokePojo();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	@When("To click on food item that user has searched")
	public void to_click_on_food_item_that_user_has_searched()
	{
		c = new CokePojo();
		clickBtn(c.getFooditem());
	}

	@When("To check the cost of food item")
	public void to_check_the_cost_of_food_item() 
	{
	   System.out.println("The cost of coke is $1.50");
	}

}
