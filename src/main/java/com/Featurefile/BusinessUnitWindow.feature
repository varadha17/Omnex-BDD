@smoke @Fifth
Feature: Verify the BusinessUnit Window

@tags7
Scenario Outline: Check the functionality of Add button 
Given Click on Add button
When Enter the Business unit data "<BusinessUnitdata>" and save

Examples:
|BusinessUnitdata|
|Unit|
|Problem|

@tags8
Scenario: Enter duplicate data and get the error message
Given Enter the duplicate data and get the error message

@tags9
Scenario Outline: Check the functionality of Cancel button
Given Click on add buttons
When Enter the data "<BusinessUnitdatas>" and cancel

Examples:
|BusinessUnitdatas|
|Opt|
|FDA|

@tags10
Scenario: Check the functionality of edit button and get the error message  
Given Click on Edit Button
When get the error message of Business Unit

@tags11
Scenario: Check the Functionality of edit button
Given Click Overall Check box
When Click Individual check box
And Click on edit Button and save the data

@tags12
Scenario: Check the Functionality of Delete Button and get the error message
Given Click delete button
When get the error message of delete button in BusinesUnit

@tags13
Scenario: Check the functionality of delete button
Given Delete the data in Business Unit


