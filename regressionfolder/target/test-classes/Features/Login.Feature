Feature: login and product search

Scenario Outline: Product search and add to cart

Given User is on home page
Then click on login link
Then enter "<username>" and "<password>"
And click on login button
Then Hover on men
And Click on shorts
Then click on any cloth name
Then select the size
And click on Add to Bag button


Examples:
	|	username	|	password	|
	|	peter.doran@yopmail.com	|	Tester@123	|