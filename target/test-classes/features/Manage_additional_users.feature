Feature: Manage Additional Users

Background: User logged into application
Given User is on My Hangar screen

 @Inviteuser
Scenario Outline:User invites existing user with new aircraft accessn
 Given User is on Manage users screen
 When User submit details of additional user firstname <firstName> ,lastname <LastName>,email<Email>,airctaft<AircraftTailNumber>
 #Then User verifies user is succesfully invited[Email Verification]
 And Invited user <Email> is present under list of invited users for Aircraft <AircraftTailNumber>
 Examples:
 | firstName | LastName | Email                 | AircraftTailNumber |
 | test      | test     | testa8@gmail.com      | N105PG             |