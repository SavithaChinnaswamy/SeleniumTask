package org.stepdefinition;

import org.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojo.DosaPojo;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DosaClass extends BaseClass
{
	DosaPojo d;
	
	@When("To click on Menu button")
	public void to_click_on_Menu_button() throws InterruptedException
	{
	   d = new DosaPojo();
	   clickBtn(d.getMenubtn());
	   Thread.sleep(3000);
	}

	@When("To select the dropdown labeled as Dosa")
	public void to_select_the_dropdown_labeled_as_Dosa() throws InterruptedException
	{
		 d = new DosaPojo();
		 clickBtn(d.getDosadropdown());
		 Thread.sleep(3000);
	}

	@When("To click on Masala Dosa")
	public void to_click_on_Masala_Dosa() throws InterruptedException
	{
		 d = new DosaPojo();
		 clickBtn(d.getMasalDosa());
		 Thread.sleep(3000);
	}

	@When("To check the Dosa Availability time")
	public void to_check_the_Dosa_Availability_time() 
	{
		WebElement time = driver.findElement(By.xpath("(//span[text()='Available at 08:00 AM'])[1]"));
		String text = time.getText();
		System.out.println(text);
	}
	

	@Then("close the browser")
	public void close_the_browser()
	{
	    closeEntireBrowser();
	}

}
