Feature: User want to purchase building products

  Scenario: products purchase
    Given User is on Homepage
    When User search for the multiple products
    And User find products which they want
    Then User should able to put that products in checkout basket

