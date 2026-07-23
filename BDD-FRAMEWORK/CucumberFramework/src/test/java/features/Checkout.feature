Feature: Search the Place the order for Products

  Scenario Outline: Search Experience for product search in both home and Offers page

Given User is on GreenCart Landing Page
When user searched with shortname <Name> and extracted actual name of product
And Added "3" items of the selected product to the cart
Then user proceed to Checkout and Validate the <Name> items in checkout page
And Verify user has ability to enter the promo code and place the holder


    Examples:
      |Name|
      |TOM|
      | Beet  |