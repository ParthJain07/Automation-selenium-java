#@tag
Feature: Application Login

Background:
When launch the browser from config variables
And hit the home page url of banking site


@Mobile @RegressionTest @NetBanking
Scenario:  User Page default login

Given User is on NetBanking landing page
When User login into application with user and password 0987
Then Home Page is displayed
And Cards are displayed

@SmokeTest @RegressionTest @Mortage
Scenario Outline:  User Page default login

Given User is on NetBanking landing page
When User login into application with "<Username>" and password "<Password>"
Then Home Page is displayed
And Cards are displayed

Examples:
  | Username | Password |
  | debitUser|  hello12 |
  | creditUser|  lpo123 |

@SmokeTest
Scenario:  User Page default sign up

Given User is on Practice landing page
When User Signup into application
  | rahul |
  |   shetty    |
  | contact@email.com |
  | 5265177269 |
Then Home Page is displayed
And Cards are displayed


