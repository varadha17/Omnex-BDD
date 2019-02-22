@First
Feature: Login into EWQIMS

@smoke 
Scenario: Get the Page Links

Given Get the ActiveLinks Inside the page


@smoke 
Scenario Outline: Login with Mulitple user

Given Enter the "<username>" and "<password>" and get the error message

Examples:
	|username|password|
	|admin|admin|
	|administrator|a1|

@smoke 
Scenario: Login with Valid user

Given Enter the username and password
