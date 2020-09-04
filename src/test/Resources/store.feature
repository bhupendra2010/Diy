Feature: Store finder

  Scenario: Store location
    Given User is on Homepage
    When User search for the store and enter his postcode
    Then User should find his nearby store