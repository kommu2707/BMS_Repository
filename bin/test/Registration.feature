Feature: registration
Background: 
Given set application URI "http://localhost:8081/"

Scenario: successful registration
Given goto "register"
When user able to register with the following details

| username | Rahul1 | 
| password | Camp@985 | 
| firstname | Rahul | 
| lastname | Sharma| 
| email | rahul.sharma@gmail.com| 
| gender | Male | 
| dob | 18/02/1995 | 
| contact | 9888767211 | 
| PAN | AUSPJ1900U | 
| address | Cryst Tower | 
| city | Mumbai | 
| state | Maharashtra| 
| country | India | 
| pincode | 400041 | 
| accountType | saving | 

Then Receives Response Status as 200 with Message as "Successfully Registered..!!" 
 
Scenario Outline: unsuccessful registration
Given goto "register"
When user should not register with the following details
| username	|<username>| 
| password	|<password>| 
| firstname	|<firstname>| 
| lastname	|<lastname>| 
| email			|<email>|
| gender 		|<gender>| 
| dob				|<dob>|
| contact 	|<contact>| 
| PAN 			|<pan>|
| address 	|<address>| 
| city 			|<city>|
| state 		|<state>|
| country		|<country>| 
| pincode		|<pincode>| 
| accountType|<accountType>|
Then Receives Response Status as 400 with Message as "Input Validation Error message"
Examples:
|username| password |firstname|lastname |email									 | gender |dob        |contact     |pan         |address     |city   |state       |country  |pincode |accountType|
|Rahul1  | camp@985 |Rahul    |Sharma   |rahul.sharma@gmail.com  | Male   |18/02/1995 | 9888767211 | AUSPJ1900U |Cryst Tower |Mumbai |Maharashtra | India   | 400041 | Personal  | 
|Rahul2  | Camp@985 |					|Sharma   |rahul.sharma@gmail.com  | Male   |18/02/1995 | 9888767211 | AUSPJ1900U |Cryst Tower |Mumbai |Maharashtra | India   | 400041 | Personal  | 
|Rahul3  | Camp@985 |Rahul    |					|rahul.sharma@gmail.com  | Male   |18/02/1995 | 9888767211 | AUSPJ1900U |Cryst Tower |Mumbai |Maharashtra | India   | 400041 | Personal  | 
|Rahul4  | Camp@985 |Rahul    |Sharma   |												 | Male   |18/02/1995 | 988876721  | AUSPJ1900U |Cryst Tower |Mumbai |Maharashtra | India   | 400041 | Personal |
|Rahul5  | camp@985 |Rahul    |Sharma   |rahul.sharmagmail.com   | Male   |18/02/1995 | 9888767211 | AUSPJ19U |Cryst Tower |Mumbai |Maharashtra   | India   | 400041 | Personal  |  




