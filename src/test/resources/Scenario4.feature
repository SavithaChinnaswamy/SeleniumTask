Feature:To validate the functionality of ordering food by user

Scenario: To validate whether the user can search the coke and its price
Given To launch the chrome browser and maximize the window
When To launch the URL of Bisto bites application
And To click on search icon
And  To pass the food item name into the search field
And To click on enter button
And To click on food item that user has searched
And To check the cost of food item
Then To close the browser



