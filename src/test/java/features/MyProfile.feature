Feature: MyProfile

Background: User logged into application
Given User is on My Hangar screen

@MyProfile @Gallery
Scenario: User should be able to update profile picture
Given User is on My profile page
When User upload profile pic from Gallery 
Then Uploaded profile pic should be set


@MyProfile @Camera
Scenario: User should be able to update profile picture
Given User is on My profile page
When User upload profile pic from Camera 
Then Uploaded profile pic should be set

@MyProfile @RemovePhoto
Scenario: User should be able to update profile picture
Given User is on My profile page
When User remove profile picture
Then Uploaded profile pic should be set

Scenario Outline: User should be able to update user details
Given User is on My profile page
When User update first name <FirstName> ,last name <LastName>
Then User details should be updated

Examples:
| FirstName | LastName |
| test 1    | test 1   |    


