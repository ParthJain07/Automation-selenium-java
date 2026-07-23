package stepDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.LandingPage;
import pageObjects.OfferPage;
import pageObjects.PageObjectManager;
import utils.TextContextSetup;

import java.util.Iterator;
import java.util.Set;

public class OfferPageStepDefinition {
public String offerPageProductName;
public WebDriver driver;
TextContextSetup textContextSetup;
PageObjectManager pageObjectManager;
//Single Responsibility Principle
//Loosley coupled
//Factory Design Pattern
    public OfferPageStepDefinition(TextContextSetup textContextSetup) {
        this.textContextSetup = textContextSetup;
    }


    @Then("^user searched for same shortname (.+) in offers page$")
    public void user_searched_for_same_shortname_in_offers_page_to_check_if_product_exist(String shortname) throws InterruptedException {
        //offer page ->enty grab text

        switchToOffersPage();
        OfferPage offerPage = textContextSetup.pageObjectManager.getOffersPage();
        offerPage.SearchItem(shortname);
        //textContextSetup.driver.findElement(By.xpath("//input[@id='search-field']")).sendKeys(shortname);
        Thread.sleep(2000);
        offerPageProductName = offerPage.getProductName();
        System.out.println("Extracted product name from the offer page : " + offerPageProductName);

    }

    public void switchToOffersPage(){

        //If switched to offer page -> skip below part
        LandingPage landingPage = textContextSetup.pageObjectManager.getLandingPage();
        landingPage.selectTopDealsPage();
        textContextSetup.genericUtils.SwitchWindowToChild();
    }

    @Then("validate product name in offers page matches with Landing Page")
    public void And_validate_product_name_in_offers_pag_matches_with_Landing_Page(){
        Assert.assertEquals(offerPageProductName, textContextSetup.landing_page_product_name);
    }


}
