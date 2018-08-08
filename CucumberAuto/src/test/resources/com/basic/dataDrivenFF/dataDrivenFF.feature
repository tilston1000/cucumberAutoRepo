Feature: Create Facebook account2
	As a user you need to open the facebook home page and do the validations
	
Scenario Outline: Validate Create user multiple fields21
	Given user is on the Facebook login page
	When user enters "<user>" first name
	And user enters "<surname>" surname
	Then user checks if "<user>" is present 
	But User Mobile field should be blank
	Then close browser
	Examples:
	| user   | surname |
	| Tom    | Jerry   |
	| Laurel | Hardy   |
	