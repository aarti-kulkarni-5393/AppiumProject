Feature: User invites additional users

Background: User logged into application
Given User is on My Hangar screen



 Scenario Outline:User invites existing user with new aircraft accessn
 Given User is on Manage users screen
 #Then User navigate to invite user screen
 When User submit details of additional user firstname <firstName> ,lastname <LastName>,email<Email>,airctaft<Airctaft>
 #Then User verifies user is succesfully invited[Email Verification]
 #And Invited user is present under list of invited users for Aircraft <AircraftTailNumber>
 Examples:
 | firstName | LastName | Email          | Airctaft  | AircraftTailNumber |
 | test      | test     | xyz1@gmail.com | SR22-4801 |                    |           
    
 
 
 Scenario Outline:User deletes invited user for given aircraft
 Given User is on Manage users screen
 #When User deletes invited user access for aircarft <AircraftTailNumber>
 #Then Invited user should not be present under list of invites users for Aircraft <>
 
 Examples:
 | firstName | LastName | Email          | Airctaft  | AircraftTailNumber |
 | test      | test     | xyz1@gmail.com | SR22-4801 |                    |
 
 
 Scenario Outline:User invites new user as additional users to aircraft
 Given User is on Manage users screen
 Then User navigate to invite user screen
 When User submit details of additional user firstname <firstName> ,lastname <LastName>,email<Email>,airctaft<Airctaft>
 #Then User verifies user is succesfully invited[Email verification]
 And Invited user is present under list of invited users for Aircraft <AircraftTailNumber>
 
 Examples:
 | firstName | LastName | Email          | Airctaft  |
 | test      | test     | xyz1@gmail.com | SR22-4801 |
 
 Scenario: User verifies user got an access for given Aircraft
 
 
 
 
 
 
 
 
 
 
 
