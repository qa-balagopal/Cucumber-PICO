Feature: Login page feature

Scenario: Login page title
Given user is on login page1
When user gets the title of the page
Then page title should be "Login - My Store"

Scenario: Forgot Password link
Given user is on login page1
Then forgot your password link should be displayed

Scenario: Login with correct credentials
Given user is on login page1
When user enters username "balagopalqa@gmail.com"
And user enters password "Test@123"
And user clicks on Login button
And page title should be "My account - My Store"

Scenario: Address page title
Given user is on login page1
When user enters username "balagopalqa@gmail.com"
And user enters password "Test@123"
And user clicks on Login button
Then user Clicks on Address page
When user gets the title of the page
Then page title should be "Addresses - My Store"