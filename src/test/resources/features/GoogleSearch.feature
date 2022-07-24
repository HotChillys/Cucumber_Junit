#TC#1: Google Search Functionality Title Verification
#1. User is on Google search page
#2. User types apple in the google search box and clicks enter
#3. User sees Steve Jobs is in the google title
#Note: Follow POM
#
@google
  Feature: Google search functionality
    Scenario: Search functionality result title
      Given user is on Google search page
      When user types apple and clicks enter
      Then user sees "apple" in the google title
















