Feature: Verify forgot your password functionality

Background: User log out to verify invite user flow
When User log out from the application

@ResetPassword
Scenario Outline: User reset password using forgot your password link 
Given User is on sign in page
And User navigate to forgot your password page
When User provide usernae <Username> to reset password
Then User should be displayed with confirmation screen

Examples:
 | Username |
 | nihilentuat8@gmail.com         |
 

 Scenario Outline: User set password through email
 Given user <username> and <password> received an email to reset password
 
 Examples:
 | username              | password |
 | nihilentuat@gmail.com | aug@2019 |