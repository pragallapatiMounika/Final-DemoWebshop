@tag 
Feature: Login for demoWebShop 
	I want to use this template for my feature files
@tag1 
Scenario Outline: Login To DemoWeb with valid credentials 
	Given User Is On My LoginPage
	When User Fillup uid <username>
	And User Fillup pwd <password>
	Then User click LoginButton
	
	Examples: 
		|	username                         |	password	      |
		|	chotabheem@gmail.com	         |	chotabheem        |
		|    lioness@gmail.com               |  lioncub           |
		
@tag2 
Scenario: Select the desired product
    Given User Is On My LoginPage
	When User Fillup uid <username>
	And User Fillup pwd <password>
	And User click LoginButton
	And User Clicks Electronics
	When click cellphones 
	And click smartPhones 
	Then click addtoCart 
			
			
@tag3 
Scenario: Check the Shopping Cart and continue shopping
    Given User Is On My LoginPage
	When User Fillup uid <username>
	And User Fillup pwd <password>
	And User click LoginButton
	And User Click The ShoppingCart
	And Clicks gotocart
	Then click continue shopping

		 
@tag4 
Scenario: Selecting the desired book
    Given User Is On My LoginPage
	When User Fillup uid <username>
	And User Fillup pwd <password>
	And User click LoginButton
	And User clicks the books
	And Click Computing
	Then Click CompareList
			
@tag5 
Scenario: Checking Wishlist 
    Given User Is On My LoginPage
	When User Fillup uid <username>
	And User Fillup pwd <password>
	And User click LoginButton
	And click wishlist
	Then click Logout
			
			
		