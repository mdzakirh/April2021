
Feature: This feature is to test signin
	
Background: 
	Given I am in a signin page
	
@smoke
Scenario: This Scenario covers positive signin testing

When Insert valid username in username text box
And Insert valid password in password text box
And Click on signin button
Then User should be in user homepage


@sanity
Scenario: This Scenario covers negative signin testing

When Insert invalid username in username text box
And Insert invalid password in password text box
And Click on signin button
Then I should be in the same page



