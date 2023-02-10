package org.stepdefinition;

import org.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StoryClass extends BaseClass
{
	@When("To click on Our Story option")
	public void to_click_on_Our_Story_option() 
	{
	    WebElement story = driver.findElement(By.xpath("//li[@id='menu-item-3557']"));
	    story.click();
	}

	@When("To Print the story content")
	public void to_Print_the_story_content() 
	{
	   WebElement para = driver.findElement(By.xpath("//ul[@class='disc']"));
	   String OurStory = para.getText();
	   System.out.println(OurStory);
	}

	@Then("close the entire browser")
	public void close_the_entire_browser() 
	{
	    closeEntireBrowser();
	}

}
