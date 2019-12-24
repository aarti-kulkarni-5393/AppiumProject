Feature: App_Menu

Background: User is logged into application
Given User is already logged in to application by username conaircraftnhltestuser1@gmail.com ,Password cirrus005


@Appmenu
Scenario: App menus should be in given sequence
Given User is on My Hangar screen
When User open App Menu
Then App menus should be in sequence
And Username "TEST AGAINYYTT CONAIRCRAFTNHLT" should be displayed with profile picture
Then User verifies Mobile Application Support Number is 1.218.788.3000
And User verifies Application Support Number is 1.218.788.3000



