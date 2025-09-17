Feature: Login

Scenario Outline: Login with valid credentials 
Given user launch the browser
When user opens the URL
And user enter the valid username "<email>" and password "<password>"
And user click on the login button 
Then admin page title should be "<adminpagetitle>"
When user click on the logoutbutton
Then logout page title should be "<logoutpagetitle>"
And close browser

Examples:
  | email               | password | adminpagetitle | logoutpagetitle |
  | admin@yourstore.com | admin    | Dashboard / nopCommerce administration | nopCommerce demo store. Login |
  
  
Scenario: Login with Invalid credentials 
Given user launch the browser
When user opens the URL
And user enter the invalid username "adminn@yourstore.com" and invalid password "adminn"
And user click on the login button 
Then error text should be dispalyed "Login was unsuccessful. Please correct the errors and try again."
And close browser
  
Scenario: GUI level testing 
Given user launch the browser
When user opens the URL
Then username field should be displayed
And password filed should be dispalyed
And login button should be displayed
And remeber me checkbox should be displayed
And close browser