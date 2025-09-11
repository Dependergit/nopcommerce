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