#@tag
Feature: Application Login


Scenario:  Admin Page default login

Given User is on NetBanking landing page
When User login into application with "admin" and password "1234"
Then Home Page is displayed
And Cards are displayed

#Resuable

Scenario:  User Page default login

Given User is on NetBanking landing page
When User login into application with user and password 0987
Then Home Page is displayed
And Cards are displayed


Scenario Outline:  User Page default login

Given User is on NetBanking landing page
When User login into application with "<Username>" and password "<Password>"
Then Home Page is displayed
And Cards are displayed

Examples:
  | Username | Password |
  | debitUser|  hello12 |
  | creditUser|  lpo123 |


