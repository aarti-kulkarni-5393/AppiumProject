Feature: User invites additional users



@inviteUser 
Scenario Outline: User logged in to cirrus application with valid credentails
  Given User is on landing page
  Then User navigate to sign in page
  When User enter username <Username> and password <Password>
  And User submit the details
  Then User should "be succesfully" logged in to application
  
  Examples:
  | Username                                  |     Password       |
  | conaircraftnhltestuser1@gmail.com         |     cirrus005      |
  
 @inviteUser 
 Scenario Outline:User invites additional users to aircraft
 Given User is on My Hangar screen
 Then User navigate to invite user screen
 When User submit details of additional user firstname <firstName> ,lastname <LastName>,email<Email>,airctaft<Airctaft>
 
 Examples:
 | firstName | LastName | Email          | Airctaft  |
 | test      | test     | xyz1@gmail.com | SR22-4801 |
 
 
 
 
