User try login
Narrative:
In order to do my purchases easier
As a User
I want to login

Scenario: User login with correct credential
Given the user on a login page
When the user try to login with correct <login> and <password>
Then the user is logged in
Examples:
|login                         |password     |
|test.selenium.yakush@gmail.com|testyakush   |