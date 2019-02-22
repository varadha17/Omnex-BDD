@smoke @Sixth
Feature: Verify the SiteFunction Functionality

@tags61
Scenario Outline: Verify the add button
Given Click on add button in site Function window
When Enter the datas "<SiteFunctionOpt>"

Examples:
		|SiteFunctionOpt|
		|verify|
		|series|
		
@tags62
Scenario Outline: Enter the duplicate data and get the error messasge
Given Enter data and get the error message"<Duplicate>"

Examples:
|Duplicate|
|verify|

@tags63
Scenario Outline: Check the functionality of cancel button
Given Click on add button in Site Function
When Enter data "<Cancel>" and cancel

Examples:
|Cancel|
|Verify|

@tags64
Scenario: Verify the functionality of edit button and get the error message
Given Click on Edit Button in Site function Window
When get the error message in site function 

@tags65
Scenario: Check the functionality of edit button
Given Click on Overall checkbox
When Click on Individual checkbox
And Click on edit button and save 

@tags66
Scenario: Verify Delete button
Given Click on Delete button
When validate the error message 

@tags67
Scenario: Check the Functionality of delete button
Given delete the data