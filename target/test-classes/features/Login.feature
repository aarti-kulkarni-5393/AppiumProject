Feature: Login to Cirrus Connected Mobile App



@Login @inviteUser 
Scenario Outline: User logged in to cirrus application with valid credentails
  Given User is on landing page
  Then User navigate to sign in page
  When User enter username <Username> and password <Password>
  And User submit the details
  Then User should "be succesfully" logged in to application
  
  Examples:
  | Username                                  |     Password       |
  | conaircraftnhltestuser1@gmail.com         |     cirrus006      |
  
 
 
 


  

  
  
    
 

  

