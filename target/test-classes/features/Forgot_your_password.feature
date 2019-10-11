Feature: Verify forgot your password functionality


@ResetPassword
Scenario Outline: User reset password using forgot your password functionality
Given User is on landing page
Then User navigate to sign in page
Given User is on sign in page
And User navigate to forgot your password page
When User provide usernae <Username> to reset password
Then User should be displayed with confirmation screen

Examples:
 | Username |
 | nihilentuat8@gmail.com         |
 
