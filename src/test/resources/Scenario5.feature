Feature:To validate the functionality of ordering food by user

Scenario:To validate user can select Spanish Omelet and can check the order availability time
Given To launch the chrome browser and maximize the window
When To launch the URL of Bisto bites application
And To click on search button
And  To pass the Spanish Omelet food item as the input to search field
And To click Enter button
And To click on food item that user searched
And To check the cost probability of food item
Then To close the browser