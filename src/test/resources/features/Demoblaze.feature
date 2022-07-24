#== Interview Task ( Demoblaze ) ==

#SHOP: https://www.demoblaze.com/index.html

#• Customer navigation through product categories: Phones, Laptops and Monitors
#• Navigate to "Laptops" → "Sony vaio i5" and click on "Add to cart". Accept pop up confirmation.
#• Navigate to "Phones" → "Samsung galaxy s6" and click on "Add to cart". Accept pop up confirmation.
#• Navigate to "Monitors" → "Apple monitor 24" and click on "Add to cart". Accept pop up confirmation.
#• Navigate to "Cart" → Delete "Apple monitor 24" from cart.
#• Click on "Place order".
#• Fill in all web form fields.
#• Click on "Purchase"
#• Capture and log purchase Id and Amount.
#• Assert purchase amount equals expected.
#• Click on "Ok"
#• Verify that there is no product in the cart

Feature: User should be able to navigate through products and add items to their cart,
  delete product from their cart, place order and make purchase.

  Scenario: user should be able to navigate through phones, laptops and monitors
    Given user is on Demoblaze home page
    When user clicks on Laptops, Sony vaio i5 and Add to cart, Accept pop up confirmation.
    And user clicks on Home
    And user clicks on Phones, Samsung galaxy s6 and Add to cart, Accept pop up confirmation.
    And user clicks on Home
    And user clicks on Monitors, Apple monitor 24 and Add to cart, Accept pop up confirmation.
    Then user clicks on cart and deletes Apple monitor 24 from cart
    And user clicks on Place Order
    And user fill out the web form fields and click on Purchase
    And user captures purchase Id and Amount and clicks OK
    And user click on Cart
    And Verify there is no product in the cart





