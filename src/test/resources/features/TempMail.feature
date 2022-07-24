#Task 2  -- TempMail
#
#Step 1. Go to "https://www.fakemail.net/"
#Step 2. Copy and save email as a string.
#Step 3. Then go to “https://practice-cybertekschool.herokuapp.com”
#Step 4. And click on “Sign Up For Mailing List"
#Step 5. Enter any valid name.
#Step 6. Enter email from the Step 2.
#Step 7. Click Sign Up
#Step 8. Verify that following message is displayed:
#“Thank you for signing up. Click the button below to return to the home page.”
#Step 9. Navigate back to the “https://www.fakemail.net/”
#Step 10. Verify that you’ve received an email from -> “do-not-reply@practice.cydeo.com”
#Step 11. Click on that email to open it.
#Step 12. Verify that email is from: “do-not-reply@practice.cydeo.com”
#Step 13. Verify that subject is: “Thanks for subscribing to practice.cydeo.com!”

  Feature:

    Scenario: user sign up for cydeo page using email address from fakemail, and verify the message
      Given user is on fakemail page "https://www.fakemail.net/"
      And user clicks copy
      Then user navigates to cydeo test page "https://practice-cybertekschool.herokuapp.com"
      And user clicks on Sign Up For Mailing List
      And User enters valid name
      And user paste email that copied from fakemail web page
      And user clicks sign up button
      Then verify "Thank you for signing up. Click the button below to return to the home page." this message is displayed
      Then user navigates back to fakemail web page "https://www.fakemail.net/"
      And Verify that you’ve received an email from -> "do-not-reply@practice.cydeo.com"
      And user click on the email to open it
      And Verify that email is from: "do-not-reply@practice.cydeo.com"
      And Verify that subject is: "Thanks for subscribing to practice.cydeo.com!"