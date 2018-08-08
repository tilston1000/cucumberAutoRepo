@Important
Feature: Create Facebook account1
	As a user you need to open the facebook home page and do the validations

@Smoke
Scenario: Validate First Name field1121
	Given user is on the Facebook login page
	When user enters "Andy" first name
	Then user checks if "Andy" is present 
	Then close browser

@Smoke @Regression	
Scenario: Validate Create user multiple fields2122
	Given user is on the Facebook login page
	When user enters "Clare" first name
	And user enters "Tilston" surname
	Then user checks if "Clare" is present 
	But User Mobile field should be blank
	Then close browser
	
Scenario: Validate Create user multiple fields3123
	Given user is on the Facebook login page
	When user enters "Clare" first name
	And user enters "Tilston" surname
	Then user checks if "Clare" is present 
	But User Mobile field should be blank
	Then close browser

@Regression	
Scenario: Validate Create user multiple fields4124
	Given user is on the Facebook login page
	When user enters "Clare" first name
	And user enters "Tilston" surname
	Then user checks if "Clare" is present 
	But User Mobile field should be blank
	Then close browser
	
@Smoke
Scenario: Validate Create user multiple fields5125
	Given user is on the Facebook login page
	When user enters "Clare" first name
	And user enters "Tilston" surname
	Then user checks if "Clare" is present 
	But User Mobile field should be blank
	Then close browser