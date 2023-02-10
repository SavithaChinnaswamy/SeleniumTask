Feature: To validate the functionality of ordering food by user


Scenario: To validate the login page with invalid username and password
Given To launch the chrome browser and maximize the window
When To launch the URL of Bisto bites application
And To click on Account button
And To Pass the invalid username in phone textfield
And To pass the invalid password in password textfield
And To click the Login button
And To print error message 
Then To close the browser



