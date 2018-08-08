Feature: Create Facebook account3
	As a user you need to open the facebook home page and do the validations
	
Background: Common login steps
	Given user is on the Facebook login page	

Scenario: Validate Create user multiple fields31
	When user enters the following data
	| userName | userSurname | Mobile |
	| Tom      | Hanks       | 1234   |
	| Jack     | Daniels     | 5678   |