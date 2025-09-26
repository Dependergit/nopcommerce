Feature: Order details
Scenario Outline: Checking order details 
Given user launchh the browser
When user opens thee URL
And user enter the validd username "admin@yourstore.com" and password "admin"
And user click on the login buttons 
And user click on the sales dropdown button then Orders button 
Then user should see the Brenda Lindgren order details "<checkbox>", "<OrderNumber>", "<Order status>", "<Payment status>", "<Shipping status>", "<Customer>", "<Created on>", "<Order total>" and "<View>"
And  close browser
Examples: 
 | checkbox | OrderNumber	| Order status | Payment status | Shipping status | Customer | Created on | Order total | View |
 |    	| 4		   | Processing     | Paid            | Shipped  | Brenda Lindgren brenda_lindgren@nopCommerce.com | 02/11/2025 10:34:46 PM | $102.00 | View |