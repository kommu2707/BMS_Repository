Feature: viewloan
Background:
Given set application URI "https://bankmanagement"

Scenario Outline: successful fetch loan details
Given goto "/api/v1/loan/view"
When user able view with the following details
| id | <id> |
| pageNo | <pageNo> |
| pageSize | <pageSize> |
| sortBy | <sortBy> |

Then Receives Response Status as 200 with Message as "Successfully Fetched"
Examples:
| id | pageNo | pageSize | sortBy |
| 0 | 1 | 10 | id |
| 1 | 1 | 10 | id |



Scenario: unsuccessful fetch loan details
Given goto "/api/v1/loan/view"
When user unable to view with the following details
| id | 9333 |
| pageNo | 1 |
| pageSize | 10 |
| sortBy | id |
Then Receives Response Status as 404 with Message as "Record not found"