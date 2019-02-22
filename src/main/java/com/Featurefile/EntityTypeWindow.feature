@smoke @Fourth
Feature: Verify the Entity Type Window


Scenario Outline: Check the Functionality of Add button

Given Click on Add Button
When Enter the data "<EntityOptData>" and save

Examples:
		|EntityOptData|
		|BDD|
		|FDS| 

		
Scenario: Enter Duplicate data and get the error message

Given Enter duplicate data and get the error message
	
@tags1		
Scenario Outline: Check the Functionality of Cancel button

Given Click on Add Buttons
When Enter the data "<EntityOptDatas>" and Cancel

Examples:
		|EntityOptDatas|
		|TRE|
		|FDA|
		
@tags2	
Scenario: Check the functionality of edit button and get the error message

Given click on edit button 
When get the error message

@tags3
Scenario: Check the functionality of edit button

Given click on Overall check box 
When click on check box
And click on edit button and Save 

@tags4
Scenario: Check the Functionality of Delete Button and get the error message

Given Click on delete button
When get the error message of delete button

@tags5
Scenario: Check the Functionality of Delete Button

Given Delete the data 

@tags6
Scenario: Check the Search Button Functionality

Given Click on Search Button and get the data based on search result

