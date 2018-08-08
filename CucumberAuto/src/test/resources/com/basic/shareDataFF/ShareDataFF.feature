Feature: Create Facebook account11
	As a user you need to open the facebook home page and do the validations

Scenario: Validate First Name field111
	Given user is on the Facebook login page
	When user enters "Andy" first name
	Then user checks if "Andy" is present 
	
Scenario: Validate Create user multiple fields112
	Given user is on the Facebook login page
	When user enters "Clare" first name
	And user enters "Tilston" surname
	Then user checks if "Clare" is present 
	But User Mobile field should be blank