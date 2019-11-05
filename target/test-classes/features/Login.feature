Feature: Login to Cirrus Connected Mobile App



@Login
Scenario Outline: User logged in to cirrus application with valid credentails
  Given User is on sign in page
  When User enter username <Username> and password <Password>
  And User submit the details
  Then User should "be succesfully" logged in to application
  Then User log out from the application
  
  Examples:
  | Username                                  |     Password       |
  | nihilentallaircraft1@gmail.com            |     cirrus005      |
 
 


  

  
  
    
 

  

