Feature: Add Products to Shopping Cart

  Background:
    Given User is logged into the application

  @functional
  Scenario: User is able to add products into the Shopping cart
    Given user clicks on Show All Notebooks and Laptops
    And user clicks on Macbook
    And user enters quantity
    When user clicks on Add to Cart button for Macbook
    And user clicks on Shopping Cart link
    Then Macbook is added to the shopping cart