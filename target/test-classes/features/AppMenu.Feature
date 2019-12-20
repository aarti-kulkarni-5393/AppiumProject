Feature: App Menu

@AppMenu
Scenario: App menus should be in given sequence
Given User is on My Hangar screen
When User open App Menu
Then App menus should be in sequence
And Username "TEST AGAIN CONAIRCRAFTNHLT" should be displayed with profile picture


@AppMenu
Scenario Outline: User checks Mobile Application and Application support number
Given User is on My Hangar screen
When User open App Menu
Then User verifies Mobile Application Support Number is <Mobile_App_Support_Number>
And User verifies Application Support Number is <Application_Support_Number>

Examples:
| Mobile_App_Support_Number | Application_Support_Number |
| 1.218.788.3000            | 1.218.788.3000             |

