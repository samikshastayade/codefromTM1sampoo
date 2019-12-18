Feature: procedure in DemoWebshop

@Sanity
Scenario: user registration on website
Given DemoWebshop website is launched
And user clicks on registration button
When user provides proper data
Then clicks on register button for registration

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

@Smoke @Sanity
Scenario: logged In user access to search Item
Given loggedIn user enter the product he want to search
Then user clicks on search button
And user waits for the results to be displayed

@Regression @Sanity
Scenario: User adds the desired product to the cart
Given User selects the desired product from the searched item
Then user adds the desired product to the cart
And user clicks on okay button
Then the desired product gets added to the cart