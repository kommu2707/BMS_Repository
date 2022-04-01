Feature: Apply Loan



Scenario: User should be able to apply the loan



Given User should logged in and go to "/applyloan"
When user provides the valid details to apply loan "<loanType>" "<customerId >", "<loamAmount>", "<loanDate>", "<intrestRate>"and "<loanDuration>"
Then Status_code equals 200
And response contains the message "Applied Loan Successfully"

|loanType|customerId |loamAmount|loanDate |intrestRate|loanDuration|
|personal| 1 |250000 |31-03-2022 |1.50 |6 |



Scenario Outline: Unsuccessful



Given User should logged in and go to "/applyloan"
When user null values "<loanType>" "<customerId >", "<loamAmount>", "<loanDate>", "<intrestRate>"and "<loanDuration>"
Then Status_code equals <400>
And response contains message equals "<message>"
Examples:
|loanType|customerId |loamAmount|loanDate |intrestRate|loanDuration|message |
|personal| 1 |250000 |31-03-2022 | |6 |interest rate should not be null |
|personal| 1 | |31-03-2022 | 1.50 |6 |loamAmount rate should not be null |
|personal| 1 | 250000 |31-03-2022 | 1.50 | |loanDuration rate should not be null|
|personal| 1 | 250000 | | 1.50 |6 |Date rate should not be null |
|personal| | |31-03-2022 | 1.50 |6 | customerId does not exists |