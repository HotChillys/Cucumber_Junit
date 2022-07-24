#TC#51: Etsy Title Verification
#1. User is on https://www.etsy.com
#2. User sees title is as expected.
#Expected: Etsy Canada - Shop for handmade, vintage, custom, and unique gifts for everyone
#Note: Follow POM

#TC#52: Etsy Search Functionality Title Verification (without parameterization)
#1. User is on https://www.etsy.com
#2. User types Wooden Spoon in the search box
#3. User clicks search button
#4. User sees Wooden Spoon is in the title
#Note: Follow POM

#TC#53: Etsy Search Functionality Title Verification (with parameterization)
#1. User is on https://www.etsy.com
#2. User types Wooden Spoon in the search box
#3. User clicks search button
#4. User sees Wooden Spoon is in the title
#Note: Follow POM

Feature: Etsy title verification and search functionality verification


  Scenario: Etsy title verification
    Given User is on "https://www.etsy.com/"
    Then User should see "Etsy Canada - Shop for handmade, vintage, custom, and unique gifts for everyone"


  Scenario: Etsy Search Functionality Title Verification (without parameterization)
    Given User is on Etsy home page
    When User types Wooden Spoon in the search box
    And User clicks search button
    Then User sees Wooden Spoon is in the title


  Scenario: Etsy Search Functionality Title Verification (with parameterization)
    Given User is on "https://www.etsy.com/"
    When User types "Wooden Spoon" in the search box
    And User clicks search button
    Then User sees "Wooden spoon" is in the title


