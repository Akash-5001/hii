Feature:FacebookLogin


Scenario:User Login with Valid Username and Password in the FacebookPage


Given User can Launch the Browser and the "url"
When  User enter the adactin "<Username>" in the usename field
And   User enter the adactin "<Password>" in the password field
And   User click the adactin Login button
Then  User landed in search hotel page 
When  User selected the "<Location>"
And   User click the search button 
Then  User landed on select hotel page
And   User Terminate the Browser

Examples:
         |Username|Password|Location|
         |Username|Password|New York|


Scenario Outline:

Given User can Launch the Browser and the "url"
When  User enter the adactin "<Username>" in the usename field
And   User enter the adactin "<Password>" in the password field
And   User click the adactin Login button
Then  User landed in search hotel page 
When  User selected the "<Location>"
And   User click the search button 
Then  User landed on select hotel page
And   User Terminate the Browser

Examples:
         |Username|Password|Location|
         |Username|Password|Paris|