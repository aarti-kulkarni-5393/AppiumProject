Feature: Smoke Test

Background: User is logged into application
Given User is already logged in
Given User is on My Hangar screen

@smoke
Scenario: App menus should be in given sequence
Given User is on My Hangar screen
When User open App Menu
Then App menus should be in sequence
And User verifies Mobile Application Support Number is 1.218.788.3000
And User verifies Application Support Number is 1.218.788.3000
And Username "TEST 1 TEST 1" should be displayed with profile picture

@smoke
Scenario: User should be able to update profile picture
Given User is on My profile page
When User remove profile picture
Then profile picture should be removed

@smoke
Scenario Outline: User should be able to update user details
Given User is on My profile page
When User update first name <FirstName> ,last name <LastName>
Then User details should be updated to first name <FirstName> ,Last name <LastName>
And Username "TEST 1 TEST 1" should be displayed with profile picture
Examples:
| FirstName | LastName |
| test 1    | test 1   |    

@smoke
Scenario Outline: User request for latest aircraft vital
When User navigate to dashboard for aircaft <Aircraft tail Number>
And  User verify dashboard is displayed with all required aircraft vitals for aircraft <Aircraft tail Number>
When User refresh dashboard for updated aircraft vitals
Then Dahsboard should be updated with latest aircraft vitals

 Examples:
 | Aircraft tail Number  |
 | FHA762OIU             |
 
 @MyHangar
Scenario Outline: User see all assigned aircraft on my hangar screen
Given User is on My Hangar screen
When User has access to <Aircraft tail Number> aircraft
And Aircraft module number is <Aircraft Model Number>
Then User should see Locaton of aircraft is <Location>
#And User should see Last updated date and time is <LastUpdatedDateTime>

Examples:
 | Aircraft tail Number  | Aircraft Model Number  | Location                        | LastUpdatedDateTime |
 | FHY374DH              | SR22                   | Delta Shores Airport            | 12                    |
