Feature: To verify aircraft vitals on dashboard

Background: user is on My hangar page
Given User is on My Hangar screen

@Dashboard
Scenario Outline: User request for latest aircraft vital
When User navigate to dashboard for aircaft <Aircraft tail Number>
And  User verify dashboard is displayed with all required aircraft vitals for aircraft <Aircraft tail Number>
When User refresh dashboard for updated aircraft vitals
Then Dahsboard should be updated with latest aircraft vitals

 Examples:
 | Aircraft tail Number  |
 | N336HT                |

