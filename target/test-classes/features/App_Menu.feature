Feature: App_Menu

Background: User is logged into application
Given User is already logged in

@Appmenu
Scenario: App menus should be in given sequence
Given User is on My Hangar screen
When User open App Menu
Then App menus should be in sequence
And User verifies Mobile Application Support Number is 1.218.788.3000
And User verifies Application Support Number is 1.218.788.3000
And Username "TEST 1 TEST 1" should be displayed with profile picture



