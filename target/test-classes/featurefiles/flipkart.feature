Feature: Writing iphone name and prices
Scenario Outline: Verify if iphone name and prices has been  Successfully added in csv files
	Given search for flipart site
	When user calls "<search>" with flipkart
	Then in csv file can have name,amount,rating of iphones
	
Examples:
       |search|
       |iphone|