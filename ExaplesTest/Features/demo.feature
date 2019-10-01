Feature: Login Action

Scenario: Successful Login with Valid Credentials
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters "esteban@gmail.com" and "12345678" to LogIn
	
	Then Message displayed Login Successfully
	
Scenario: Successful LogOut
	When User LogOut from the Application
	Then Message displayed LogOut Successfully