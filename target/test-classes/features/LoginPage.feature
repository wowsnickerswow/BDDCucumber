Feature: Buying a phone

  Scenario: Previously created user logins and buying a phone
    Given user is on home page.
    When title should be "STORE"
    And he clicks login button
    And user enters "notstandartuser" as username
    And user enters "password" as password
    Then clicks sign in button.
    And select Phones category
    Then clicking on a first phone from a list
    And add choosen phone to the cart
    And redirecting to Cart
    Then clicking place order button
    And type name as "Oleksandr Test"
    And type Country as "Poland"
    And type City as "Gdansk"
    And type credit card as "4444 4444 4444 4444"
    And type month as "12"
    And type year as "2030"
    And clicking purchase button
    Then if purchase successull text "Thank you for your purchase" should be displayed
    Then confirm Ok button
