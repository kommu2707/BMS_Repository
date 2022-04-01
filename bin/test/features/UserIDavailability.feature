Feature: UserID availability

Scenario: User should apply with available username
Given GET userID availability API
When Provide Valid userID
Then Status_code equals 200
And response contains the message "Username is available"

Scenario Outline: User should not apply with nonavailable username and invalid format
Given GET userID availability API
When Provide different userID "<userID>"
Then Status_code equals <statuscode>
And response contains the message "<message>"
Examples:
|userID | statuscode | message |
| sugu | 200 | Username is already available please choose another username |
| sugu@21 | 400 | Please check the username provided username should contain Alphanumeric |