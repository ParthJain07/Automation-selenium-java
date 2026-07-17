Feature: Search the Place the order for Products

Scenario: Search Experience for product search in both home and Offers page

Given User is on GreenCart Landing Page
When user searched with shortname "Tom" and extracted actual name of product
Then user searched for same shortname "Tom" in offers page
And validate product name in offers page matches with Landing Page