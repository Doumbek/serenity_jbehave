Narrative:
As a User
I want to login
So that I can buy products easier

Scenario: User login with correct credential
Meta:
Given the user on a login page
When the user try to login with correct email:<email> and password:<password>
Then the user is logged in
Examples:
|email                         |password     |
|test.selenium.yakush@gmail.com|testyakush   |

Scenario: User login with incorrect login
Given the user on a login page
When the user try to login with incorrect email:<email>
Then email error alert is displayed
Examples:
|email                         |
|test.selenium.yakushwrong@gmail.com|

Scenario: User login with incorrect password
Given the user on a login page
When the user try to login with correct email:<email> and incorrect password:<password>
Then password error alert is displayed
Examples:
|email                         |password       |
|test.selenium.yakush@gmail.com|testyakushwrong|