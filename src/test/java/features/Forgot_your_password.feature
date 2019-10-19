Feature: Verify forgot your password functionality



Scenario Outline: User reset password using forgot your password link 
Given User is on sign in page
And User navigate to forgot your password page
When User provide usernae <Username> to reset password
Then User should be displayed with confirmation screen

Examples:
 | Username |
 | nihilentuat8@gmail.com         |
 
@ResetPassword
 Scenario Outline: User set password through email
 Given user <username> and <password> received an email to reset password
 
 Examples:
 | username              | password |
 | nihilent003@gmail.com | aug@2019 |