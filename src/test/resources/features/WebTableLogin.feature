#TC #: Login scenario
#1- Open a chrome browser
#2- Go to: https://web-table-2.cydeo.com/login
#3- Enter username: Test
#4- Enter password: Tester
#5- Verify URL:
#Expected: URL should end with “orders”
#
#Note: Follow POM
#Try different ways of implementing this step:
#
#
#TC #: Login scenario using maps/ alternative practice
#
#Scenario: User should be able to see all 12 months in
#months
#dropdown
#  Given User is on the login page of Web table app
#  When User enters below credentials
#    | username     | Test   |
#    | password     | Tester |
#  Then User should see url contains orders

  Feature: User should be able to login using correct credentials

    Background: User is on the login page
      Given User is on the login page of web table app

    Scenario: Positive login scenario 1
      When user enters username "Test"
      And user enters password "Tester"
      And User clicks to login button
      Then User should see url contains "orders"

    Scenario: Positive login scenario 2
      When user enters username "Test" password "Tester" and logins
      Then User should see url contains "orders"

    #TC #: Login scenario using maps/ alternative practice

    Scenario: User should be able to see all 12 months in months dropdown
      When User enters below credentials
        | username     | Test   |
        | password     | Tester |
      Then User should see url contains "orders"