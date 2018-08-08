Feature: Create Facebook account9
	As a user you need to open the facebook home page and do the validations

Scenario: Validate First Name field91
	Given user is on the Facebook login page
	When user enters First Name
	Then user checks if First Name is present 
	Then close browser
	
Scenario: Validate Create user multiple fields92
	Given user is on the Facebook login page
	When user enters First Name
	And user enters Surname
	Then user checks if First Name is present 
	But User Mobile field should be blank
	Then close browser