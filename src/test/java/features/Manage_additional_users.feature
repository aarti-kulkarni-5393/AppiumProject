Feature: Manage Additional Users

Background: User log out to verify invite user flow
When User log out from the application


Scenario Outline:User invites existing user with new aircraft access
 Given User is already logged in to application by username nihilentqa15@gmail.com ,Password cirrus12
 Given User is on My Hangar screen
 Given User is on Manage users screen
 When User submit details of additional user firstname <firstName> ,lastname <LastName>,email<Email>,airctaft<AircraftTailNumber>
 #Then User verifies user is succesfully invited[Email Verification]
 And Invited user <Email> is present under list of invited users for Aircraft <AircraftTailNumber>
 Examples:
 | firstName | LastName | Email                             | AircraftTailNumber |
 | test      | test     | nihilentautomation@gmail.com      | FHA762OIW            |
 

Scenario Outline: User verifies user got an access to invited aircraft
 Given User is already logged in to application by username nihilentautomation@gmail.com ,Password cirrus001
 Given User is on My Hangar screen
 When User has access to <Aircraft tail Number> aircraft
 Examples:
 | Aircraft tail Number |
 |  FHA762OIW           |
 

 Scenario Outline:User deletes invited user for given aircraft
 Given User is already logged in to application by username nihilentqa15@gmail.com ,Password cirrus12
 Given User is on My Hangar screen
 Given User is on Manage users screen
 When User deletes invited user <Email> access for aircarft <AircraftTailNumber>
 
 Examples:
 | Email                        |  AircraftTailNumber |
 | nihilentautomation@gmail.com |  FHA762OIW             |
 

 Scenario Outline: User verifies access is removed for invited aircraft
 Given User is already logged in to application by username nihilentautomation@gmail.com ,Password cirrus001
 Given User is on My Hangar screen
 #When User has not access to <Aircraft tail Number> aircraft
 Examples:
 | Aircraft tail Number |
 |  FHA762OIW           |
 