@smoke @Seventh
Feature: Add the Parent Entity

Scenario Outline: Enter data in entity path
Given Enter the data in entity field "<Entity>"
When Enter the data in Entity Short Name(Opt) "<Entity Short Name>"
And Select the data in Entity Type(Opt)
And Select the data in Business Unit(Opt)
And Select the data in Site function(Opt)
And Select the Status
And Select Is a Site	
And Enter the Address
And Enter the Contact number
And Enter the Fax (Opt)
And Select the Country
And Enter the Branch Number(Opt)
And Select the currency
And Select route
And Add Contact Person
And Click Primary Contact person

Examples:
|Entity|Entity Short Name|
|Ind-Omnex| Omn|
