Feature: User invites additional users


  
 @inviteUser 
 Scenario Outline:User invites existing user with new aircraft access
 Given User is on My Hangar screen
 Then User navigate to invite user screen
 When User submit details of additional user firstname <firstName> ,lastname <LastName>,email<Email>,airctaft<Airctaft>
 Then user verifies user is succesfully invited
 And 
 
 Examples:
 | firstName | LastName | Email          | Airctaft  |
 | test      | test     | xyz1@gmail.com | SR22-4801 |
 
 
 
 @inviteUser 
 Scenario Outline:User invites additional users to aircraft
 Given User is on My Hangar screen
 Then User navigate to invite user screen
 When User submit details of additional user firstname <firstName> ,lastname <LastName>,email<Email>,airctaft<Airctaft>
 
 Examples:
 | firstName | LastName | Email          | Airctaft  |
 | test      | test     | xyz1@gmail.com | SR22-4801 |
 
 
 
 
 
 
