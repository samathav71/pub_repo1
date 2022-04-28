Feature: Test the login functionality of OrangeHRM Application

Scenario: Test the valid login

Given User is on login page
When user enters username and password
And clicks on the login button
Then User should login and user should land on Homepage

Scenario: Test the valid second login

Given User is on login page
When user enters username and password
And clicks on the login button
Then User should login and user should land on Homepage