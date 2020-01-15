Feature: Verify Aircraft details on My Hanagr page

#Background:logged in application

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
 
 
 

 
 
 
 

 