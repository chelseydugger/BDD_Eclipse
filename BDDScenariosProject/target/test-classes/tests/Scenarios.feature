Feature: User Login
Registered User should be able to access account details

Scenario: Login with valid credentials
Given User navigates to Login page
When User enters username "t102523"
And Enter valid password "Welcome1"
And Clicks on Login button
Then User should login successfully

Scenario: Login with invalid credentials
Given User navigates to Login page
When User enters invalid username "12345"
And Enter invalid password "54321"
And Clicks on Login button
Then User should get a warning message

Scenario: Login with valid username and invalid password
Given User navigates to Login page
When User enters valid username "t102523"
And Enters invalid password "54321"
And Clicks on Login button
Then User should get a warning message

Scenario: Login with invalid username and valid password
Given User navigates to Login page
When User enters invalid username "12345"
And Enters valid password "Welcome1"
And Clicks on Login button
Then User should get a warning message

Scenario: Login without providing any credentials
Given User navigates to Login page
When User enters invalid username ""
And Enters invalid password ""
And Clicks on Login button
Then User should get a warning message