Feature: my validations on mercury application
@Sanity
Scenario: user access to signup in website
Given Mercury website is launched
And user clicks on sign up button
When user enters proper data
Then clicks on submit button for account creation
@Smoke @Regression
Scenario Outline: user access to Login for registered Member
Given registered user clicks on signIn link
When user provides the registered valid username "<uname>"
And valid password in respective feild "<pswrd>"
Then user clicks on login button for login validation

Examples:
| uname                    | pswrd   |
|april.aniston@gamil.com   |pass123  |
|pogo.puchu@gmail.com      |123pass  |
|pooboo@gmail.com          |pa1123ss |

@Smoke
Scenario: user access to book Flight
Given user verifies the flights available
Then selects the desired flight
When user makes the payments
Then Tickets are generated