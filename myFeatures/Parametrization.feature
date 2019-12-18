Feature: add to cart, parametrization, background

  Background: Launch DemoWebShop site
    Given application is launched

  Scenario: user rregistration
    Given DemoWebShop is displayed
    When user clicks on register
    And user enetrs valid credentials for registration
    Then user clicks on register
    And user clicks on Logoout
    Then user closes the window

  Scenario Outline: user login
    Given Demowebshop is displayed
    When user clicks on login button
    And user provides valid username "<uname>"
    And valid password in respective field "<pswrd>"
    Then user clicks on login button for validation

    Examples: 
      | unmae                   | pswrd  |
      | april.aniston@gmail.com | 123abc |
      | pooboo@gmail.com        | 123acb |
      | abc@gmail.com           | 123456 |
