#TC#5: SmartBear order process
#1. User is logged into SmartBear Tester account and on Order page
#2. User fills out the form as followed from the table below:
#3. User selects “product” from product dropdown
#4. User enters “quantity” to quantity
#5. User enters “customer name” to costumer name
#6. User enters “street” to street
#7. User enters “city” to city
#8. User enters “state” to state
#9. User enters “zip” to zip
#10. User selects “cardType” as card type
#11. User enters “card number” to card number
#12. User enters “expiration date” to expiration date
#13. User clicks process button
#14. User verifies “costumer name” is in the list
#
#Pass the following table in Scenario outline.

Feature: SmartBear order process

  @ScenarioOutline
  Scenario Outline: SmartBear order process
    Given User is on SmartBear Tester account page
    And User clicks on Order
    When User selects "<product>" from product dropdown
    And User enters "<quantity>" to quantity
    And User enters "<customerName>" to costumer name
    And User enters "<street>" to street
    And User enters "<city>" to city
    And User enters "<state>" to state
    And User enters "<zipcode>"
    And User selects "<cardType>" as card type
    And User enters "<cardNumber>" to card number
    And User enters "<expDate>" to expiration date
    And User clicks process button
    Then User verifies "<expectedName>" is in the list

    Examples:
      | product      | quantity | customerName   | street      | city    | state | zipcode | cardType | cardNumber    | expDate | expectedName   |
      | MyMoney      | 1        | Ken Adams       | Kinzie st   | Chicago | IL    | 60004   | Visa     | 313313133315  | 12/22   | Ken Adam       |
      | Family Album | 4        | Joey Tribbiani | State st    | Chicago | IL    | 60656   | Visa     | 1234335333336 | 11/22   | Joey Tribbiani |
      | Screen Saver | 5        | Rachel Green   | Michigan st | Chicago | IL    | 60056   | Visa     | 3353333333337 | 10/22   | Rachel Green   |
      | My Money     | 5        | Chandler Bing  | Erie st     | Chicago | IL    | 60666   | Visa     | 4333533333338 | 10/22   | Chandler Bing  |





















