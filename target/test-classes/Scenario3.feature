Feature: To validate the functionality of ordering food by user

Scenario:To validate the registration form without passing the confirm password field
Given To launch the chrome browser and maximize the window
When To launch the URL of Bisto bites application
And To click on Account button
And To pass the username in name field
And To pass the email in email textfield
And To pass the mobileno in Phone textfield
And To pass the password in password textfield
And To click the Register button
And To display the Alert message
Then To close the browser
