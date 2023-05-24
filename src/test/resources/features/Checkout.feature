@regression
Feature: Checkout Products

  Background:
    Given User is logged into the application
    And User adds product to the Shopping Cart

  Scenario: User is able to checkout products from Shopping Cart
    Given User clicks on Checkout button
    And User enters Billing Details
    And User clicks on Continue button
    And User clicks on Agree checkbox
    And User clicks on Continue button

