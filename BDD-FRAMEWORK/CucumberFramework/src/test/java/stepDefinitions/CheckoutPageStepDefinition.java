package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.CheckoutPage;
import pageObjects.LandingPage;
import utils.TextContextSetup;

public class CheckoutPageStepDefinition {
public WebDriver driver;
TextContextSetup textContextSetup;
public CheckoutPage checkoutPage;
//Spring framework EJB
//SRP
    public CheckoutPageStepDefinition(TextContextSetup textContextSetup){
        this.textContextSetup = textContextSetup;
        checkoutPage = textContextSetup.pageObjectManager.getCheckoutPage();
    }

    @Then("Verify user has ability to enter the promo code and place the holder")
    public void verify_user_has_ability_enter_promo(){


        Assert.assertTrue(checkoutPage.VerifyPromoBtn());
        Assert.assertTrue(checkoutPage.VerifyPlaceOrder());
    }

    @Then("^user proceed to Checkout and Validate the (.+) items in checkout page$")
    public void user_proceeds_to_checkout(String name){
        checkoutPage.CheckOutItems();
        //Assertion to extract name from screen and compare with name
    }

}
