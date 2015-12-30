Narrative:
As a User
I want to logout
So that I can keep my personal data in secret

Scenario: User logout
Given the user with email: 'test.selenium.yakush@gmail.com' and password: 'testyakush' is logged in
When the user try to logout
Then login form is displayed