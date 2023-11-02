Feature: User enters token

Scenario: User enters valid token
Given User navigates to "www.prepaiddigitalsolutions.com"
When User enters valid token ""
Then User is redirected to create profile page

Scenario: User enters invalid token
Given User navigates to "www.prepaiddigitalsolutions.com"
When User enters invalid token ""
Then User is not redirected to create profile page
And User receives error message

Scenario: User does not enter any token
Given User navigates to "www.prepaiddigitalsolutions.com"
When User enters "" in token field
Then User is not redirected to create profile page
And User receives error message