Feature: Bookcart application demo

  #Background: 
    #Given User should navigate to the application

  @cleanup
  Scenario Outline: Add a product to the cart
    And User should login as "<username>" and "<password>"
    And user should search a "<book>"
    When User add the book to the cart
    Then the cart badge should be updated

    Examples: 
      | username | password | book              |
      | ortoni   | pass1234 | Birthday Girl     |
      | ortonikc | pass1234 | Like a Love Story |
     
    @regression
    Examples: 
      | username | password | book       |
      | ortoni   | pass1234 | Fix Her Up |
