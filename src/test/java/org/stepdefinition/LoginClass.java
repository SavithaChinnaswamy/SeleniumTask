package org.stepdefinition;

import org.Base.BaseClass;
import org.pojo.LoginStorypojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginClass extends BaseClass

{
	LoginStorypojo l ; 
	
	@Given("To launch the chrome browser and maximize the window")
	public void to_launch_the_chrome_browser_and_maximize_the_window()
	{
	   launchBrowser();
	   windowMaximize();
	}

	@When("To launch the URL of Bisto bites application")
	public void to_launch_the_URL_of_Bisto_bites_application() 
	{
		launchUrl("https://bistrobitesdc.com/");
	
	}

	@When("To click on Account button")
	public void to_click_on_Account_button() 
	{
	    l = new LoginStorypojo();
	    clickBtn(l.getAccountbtn());
	    
	}

	@When("To Pass the invalid username in phone textfield")
	public void to_Pass_the_invalid_username_in_phone_textfield()
	{
		 l = new LoginStorypojo();
		 passText("9988776655", l.getUsernamefield());
	}

	@When("To pass the invalid password in password textfield")
	public void to_pass_the_invalid_password_in_password_textfield() 
	{
		 l = new LoginStorypojo();
		 passText("Kanithra@123", l.getPasswordfield());
	}

	@When("To click the Login button")
	public void to_click_the_Login_button()
	{
		l = new LoginStorypojo();
		clickBtn(l.getLoginbtn());
	}

	@When("To print error message")
	public void to_print_error_message() throws InterruptedException 
	{
		System.out.println("Error message-Invalid mob no");
		Thread.sleep(3000);
	 
	}

	@Then("To close the browser")
	public void to_close_the_browser() throws InterruptedException 
	{
		Thread.sleep(3000);
	    closeEntireBrowser();
	}

}
