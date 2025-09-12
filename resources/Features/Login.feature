Feature: Login

Scenario: Successful Login with Valid Credentials
	Given User Launch Chrome browser
	When user opens URL 
	And User enter valid credentails email "admin@yourstore.com" and password "admin"
	And User click on loginbutton
	Then Admin title should be displayed "Dashboard / nopCommerce administration"
	When User click on logout button
	Then Login page title should displayed "nopCommerce demo store. Login"
	And Close browser 
	
Scenario: Successful Login with inValid Credentials
	Given User Launch Chrome browser
	When user opens URL 
	And User enter invalid credentails email "adminn@yourstore.com" and password "adminn"
	And User click on loginbutton
	Then Admin title should be displayed "Dashboard / nopCommerce administration"
	When User click on logout button
	Then Login page title should displayed "nopCommerce demo store. Login"
	And Close browser 
	
Scenario Outline: Successful Login with Valid using scenario outline Credentials
  Given User Launch Chrome browser
  When user opens URL 
  And User enter valid credentials email "<email>" and password "<password>"
  And User click on loginbutton
  Then Admin title should be displayed "Dashboard / nopCommerce administration"
  When User click on logout button
  Then Login page title should displayed "nopCommerce demo store. Login"
  And Close browser

Examples:
  | email               | password |
  | admin@yourstore.com | admin    |
  | test1@yourstore.com | test123  |
  | test2@yourstore.com | pass456  |
