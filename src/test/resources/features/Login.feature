@Regression

Feature: library app login feature

  User Story:
  As a user, I should be able to login with correct credentials to different accounts.
  and dashboard should be displayed.
  Accounts are: librarian, student, admin

  Background: For the scenario in this feature file, user is expected to be on login page
    Given user is on library login page

  @librarian @employee  @smoke
  Scenario: Login as librarian
    #Given user is on librarian login page
    When  user enters librarian username
    And user enters librarian password
    Then dashboard should be displayed

  @student
  Scenario: Login as student
    #Given user is on student login page
    When  user enters student username
    And user enters student password
    Then dashboard should be displayed

  @admin @smoke
  Scenario: Login as admin
    #Given user is on admin login page
    When  user enters admin username
    And user enters admin password
    Then dashboard should be displayed






