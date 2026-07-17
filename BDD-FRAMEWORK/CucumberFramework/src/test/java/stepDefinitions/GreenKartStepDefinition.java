package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.*;

public class GreenKartStepDefinition {
public WebDriver driver;
public String landing_page_product_name;
public String offerPageProductName;

    @Given("User is on GreenCart Landing Page")
    public void user_is_on_green_cart_landing_page() {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver","C:/Users/DELL/Documents/chromedriver-win64/chromedriver.exe" );
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

    }
    @When("user searched with shortname {string} and extracted actual name of product")
    public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortName) throws InterruptedException {

        driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortName);
        Thread.sleep(2000);
        landing_page_product_name =driver.findElement(By.cssSelector("h4.product-name"))
                .getText()
                .split("-")[0]
                .trim();
        System.out.println("Extracted product name from the home page : " + landing_page_product_name);


    }
    @Then("user searched for same shortname {string} in offers page")
    public void user_searched_for_same_shortname_in_offers_page_to_check_if_product_exist(String shortname) throws InterruptedException {
        //offer page ->enty grab text
        driver.findElement(By.linkText("Top Deals")).click();
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();
        String parentWindow = i1.next();
        String childWindow = i1.next();
        driver.switchTo().window(childWindow);

        driver.findElement(By.xpath("//input[@id='search-field']")).sendKeys(shortname);
        Thread.sleep(2000);
        offerPageProductName =driver.findElement(By.cssSelector("tr td:nth-child(1)")).getText();
        System.out.println("Extracted product name from the offer page : " + offerPageProductName);

    }

    @Then("validate product name in offers page matches with Landing Page")
    public void And_validate_product_name_in_offers_pag_matches_with_Landing_Page(){
        Assert.assertEquals(offerPageProductName, landing_page_product_name);
    }

}
