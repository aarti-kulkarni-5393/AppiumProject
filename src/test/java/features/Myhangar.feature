Feature: Verify Aircraft details on My Hanagr page

Background:logged in application


@MyHangar 
Scenario Outline: user see all assigned aircraft on my hangar screen
Given User is on My Hangar screen
Then User should have access to <Aircraft Model Number> aircraft
Examples:
| Aircraft Model Number |
|   N837EF              |


@MyHangar @Login
Scenario Outline: User see aircraft details on My Hangar screen
Given User is on My Hangar screen
When User has access to <Aircraft tale Number> aircraft

Then User should see aircraft tale number <Aircraft Model Number> and model number <Aircraft tale Number>
 Examples:
 | Aircraft Model Number | Aircraft tale Number | 
 | SR22                  | N336HT               |
 | SR20                  | N837EF               |
 