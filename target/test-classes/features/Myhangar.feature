Feature: Verify Aircraft details on My Hanagr page

#Background:logged in application


Scenario Outline: User see all assigned aircraft on my hangar screen
Given User is on My Hangar screen
When User has access to <Aircraft tail Number> aircraft
And Aircraft module number is <Aircraft Model Number>
Then User should see Locaton of aircraft is <Location>
And User should see Last updated date and time is <LastUpdatedDateTime>

Examples:
 | Aircraft tail Number  | Aircraft Model Number  | Location                        | LastUpdatedDateTime |
 | N336HT                | SR22                   | Duluth International Airport    | 12                    |
 
 
 
 Scenario: User refresh My hangar page to check latest updated aircraft vitals
 Given User is on My Hangar screen
 
 @MyHangar
 Scenario Outline: User navigate to dashboard for given aircraft
 Given User is on My Hangar screen
 When User navigate to dashboard for aircaft <Aircraft tail Number>
 And User verify dashboard is displayed with all required aircraft vitals for aircraft <Aircraft tail Number>
 #And User send a request to update aircraft vitals
 #Then Aircraft vitals should be updated with latest data 
 
 Examples:
 | Aircraft tail Number  |
 | N336HT                |
 
 
 
 

 