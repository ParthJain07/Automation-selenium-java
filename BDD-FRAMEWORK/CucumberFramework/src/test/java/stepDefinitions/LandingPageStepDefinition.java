package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageObjects.LandingPage;
import utils.TextContextSetup;

import java.util.*;

public class LandingPageStepDefinition {
public WebDriver driver;
TextContextSetup textContextSetup;
//Spring framework EJB
//SRP
    public LandingPageStepDefinition(TextContextSetup textContextSetup){
        this.textContextSetup = textContextSetup;
    }

    @Given("User is on GreenCart Landing Page")
    public void user_is_on_green_cart_landing_page() {
        // Write code here that turns the phrase above into concrete actions
        // Delete the System.setProperty, driver = new ChromeDriver(), and driver.get() lines here.
        // TestBase.java is already handling driver creation and navigation!
        // You can just leave this method empty or add an Assert for the page title.

    }
    @When("user searched with shortname {string} and extracted actual name of product")
    public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortName) throws InterruptedException {
        LandingPage landingPage =textContextSetup.pageObjectManager.getLandingPage();
        landingPage.SearchItem(shortName);
        Thread.sleep(2000);
        textContextSetup.landing_page_product_name = landingPage.getProductName().split("-")[0].trim();
        System.out.println("Extracted product name from the home page : " + textContextSetup.landing_page_product_name);

    }

}
