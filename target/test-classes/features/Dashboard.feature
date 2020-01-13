Feature: To verify aircraft vitals on dashboard

Background: user is logged into application
#When User log out from the application
Given User is already logged in to application by username nihilentqa15@gmail.com,Password cirrus12
Given User is on My Hangar screen

@StartTest
Scenario Outline: User request for latest aircraft vital
When User navigate to dashboard for aircaft <Aircraft tail Number>
And  User verify dashboard is displayed with all required aircraft vitals for aircraft <Aircraft tail Number>
When User refresh dashboard for updated aircraft vitals
#Then Dahsboard should be updated with latest aircraft vitals

 Examples:
 | Aircraft tail Number  |
 | FHA762OIW             |

