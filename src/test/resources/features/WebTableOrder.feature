#TC #: Order place scenario
#1- Given user is already logged in to web table app
#2- When user is on the “Order” page
#3- Then user enters appropriate test data
#a. Product
#b. Quantity
#c. Customer name
#d. Street
#e. City
#f. State
#g. Zip
#h. Payment info:
#i. Card type: Visa/MasterCard/American Express
#ii. Card No
#iii. Expire date
#4- And user clicks to “Process Order”
#5- Then user should see new order in the table on “View all orders”
#page
#
#Note: Follow POM
##1- Parameterize scenario
##2- Scenario Outline after.

Feature: Web table user order feature

  Scenario: user should be able to place order and order seen on web table
    Given user is already logged in and on order page
    When user selects product type "Familybea"
    And user enters quantity 2
    And user enters customer name "Sherlock Holmes"
    And user enters street "2218 Baker Street"
    And user enters city "London"
    And user enters state "England"
    And user enters zipcode "50505"
    And user enters credit card type "MasterCard"
    And user enters credit card number "1111222233334444"
    And user enters expiry date "12/23"
    And user clicks process order button
    Then user should see "Sherlock Holmes" in first row of the web table


  Scenario Outline: user should be able to place order and order seen on web table
    Given user is already logged in and on order page
    When user selects product type "<productType>"
    And user enters quantity <quantity>
    And user enters customer name "<customerName>"
    And user enters street "<street>"
    And user enters city "<city>"
    And user enters state "<state>>"
    And user enters zipcode "<zipcode>"
    And user enters credit card type "<cardType>"
    And user enters credit card number "<cardNumber>"
    And user enters expiry date "<expiryDate>"
    And user clicks process order button
    Then user should see "<expectedName>" in first row of the web table

    @femaleScientists
    Examples: famous female scientists
      | productType | quantity | customerName       | street    | city   | state   | zipcode | cardType         | cardNumber   | expiryDate | expectedName       |
      | MoneyCog    | 2        | Marie Curie         | London St | London | England | 50550   | Visa             | 121212121212 | 12/23      | Marie Curie        |
      | Familybea   | 3        | Rosalind Franklin  | London St | London | England | 50550   | MasterCard             | 121212121212 | 12/23      | Rosalind Franklin  |
      | Screenable  | 1        | List Meitner       | London St | London | England | 50550   | American Express | 121212121212 | 12/23      | List Meitner       |
      | MoneyCog    | 5        | Chien-Shiung Wu    | London St | London | England | 50550   | Visa             | 121212121212 | 12/23      | Chien-Shiung Wu    |
      | MoneyCog    | 6        | Barbara McClintock | London St | London | England | 50550   | Visa             | 121212121212 | 12/23      | Barbara McClintock |

    @maleScientists
    Examples: famous female scientists
      | productType | quantity | customerName       | street    | city   | state   | zipcode | cardType         | cardNumber   | expiryDate | expectedName       |
      | MoneyCog    | 2        | Marie Curie        | London St | London | England | 50550   | Visa             | 121212121212 | 12/23      | Marie Curie        |
      | Familybea   | 3        | Rosalind Franklin  | London St | London | England | 50550   | Visa             | 121212121212 | 12/23      | Rosalind Franklin  |
      | Screenable  | 1        | List Meitner       | London St | London | England | 50550   | American Express | 121212121212 | 12/23      | List Meitner       |
      | MoneyCog    | 5        | Chien-Shiung Wu    | London St | London | England | 50550   | Visa             | 121212121212 | 12/23      | Chien-Shiung Wu    |
      | MoneyCog    | 6        | Barbara McClintock | London St | London | England | 50550   | MasterCard             | 121212121212 | 12/23      | Barbara McClintock |















