#IQ : TECH CRUNCH

#Using any test automation framework, Java language (except record/play tools) and Maven dependency management, please do following:

#1- Go to https://techcrunch.com/
#2- For “The Latest News” list, verify followings;
#a. each news has an author
#b. each news has an image
#3- Click one of news from “The Latest News” list to reach the full content and verify followings;
#a. the browser title is the same with the news title
#b. the links within the news content

  Feature: user should be able to see all the authors of the news, when user clicks on the new, user should be able to see and navigate to all the hyperlinks

    Scenario: user should be able to see all the author of the news.
      Given user is on Tech Crunch home page
      And user should see all the author name
      And user should see all the images
      When user clicks on one of the news from The Latest News
      Then news title should be the same with browser title
      And verify all the links from the news content









