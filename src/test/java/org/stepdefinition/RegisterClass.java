package org.stepdefinition;

import org.Base.BaseClass;
import org.pojo.RegisterPojo;

import cucumber.api.java.en.When;

public class RegisterClass extends BaseClass
{
	RegisterPojo r;
	
	@When("To pass the username in name field")
	public void to_pass_the_username_in_name_field()
	{
		r = new RegisterPojo();
		passText("Kanithra", r.getNamefield());
		
	}

	@When("To pass the email in email textfield")
	public void to_pass_the_email_in_email_textfield() 
	{
		r = new RegisterPojo();
		passText("Kanithra@gmail.com", r.getEmailfield());
	}

	@When("To pass the mobileno in Phone textfield")
	public void to_pass_the_mobileno_in_Phone_textfield() 
	{
		r = new RegisterPojo();
		passText("7777666655", r.getPhoneno());
	}

	@When("To pass the password in password textfield")
	public void to_pass_the_password_in_password_textfield() throws InterruptedException
	{
		r = new RegisterPojo();
		passText("111111", r.getPwdfield());
		Thread.sleep(3000);
	}

	@When("To click the Register button")
	public void to_click_the_Register_button()
	{
		r = new RegisterPojo();
		clickBtn(r.getRegisterbtn());
	}

	@When("To display the Alert message")
	public void to_display_the_Alert_message()
	{
	    System.out.println("message-please fill out this field");
	}

}
