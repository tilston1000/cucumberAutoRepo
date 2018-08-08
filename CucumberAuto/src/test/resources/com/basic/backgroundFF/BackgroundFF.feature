Feature: Create Facebook account1
	As a user you need to open the facebook home page and do the validations
	
Background: Common login steps11
	Given user is on the Facebook login page	

Scenario: Validate First Name field
	When user enters "Andy" first name
	Then user checks if "Andy" is present 
	Then close browser
	
Scenario: Validate Create user multiple fields12
	When user enters "Clare" first name
	And user enters "Tilston" surname
	Then user checks if "Clare" is present 
	But User Mobile field should be blank
	Then close browser