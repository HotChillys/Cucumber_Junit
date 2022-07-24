

Feature: User Story: As a user when I am on Vytrack => Fleet => Vehicles,
  I should be able to see Export Grid dropdown, Refresh, Reset and
  Grid Settings Buttons



   Scenario: truck driver should have access to Vehicles page under fleet module
     Given user logged in as truck driver
     Given user hover over to Fleet
     And clicks Vehicles
     Then user should see "Cars" header

  Scenario: user should be able to click on Export Grid dropdown on the left side
    Given user logged in as truck driver
    Given user hover over to Fleet
    And clicks Vehicles
    And user should verify Export Grid dropdown is on the left side of the page and is clickable

