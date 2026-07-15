package stepDefinitions;
import java.util.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {
    @Given("User is on NetBanking landing page")
    public void user_is_on_net_banking_landing_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User is on NetBanking landing page");

    }
//    @When("User login into application with {string} and password {string}")
//    public void user_login_into_application_with_and_password(String username, String password) {
//        System.out.println(username + " and password " + password);
//
//    }

    @When("^User login into application with (.+) and password (.+)$")
    public void user_login_into_application_with_and_password(String username, String password) {
        System.out.println(username + " and password " + password);

    }

    @Then("Home Page is displayed")
    public void home_page_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Home Page is displayed");


    }
    @Then("Cards are displayed")
    public void cards_are_displayed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Cards are displayed");


    }

    @Given("User is on Practice landing page")
    public void user_is_on_practice_landing_page() {
        // Write code here that turns the phrase above into concrete actions

    }
    @When("User Signup into application")
    public void user_signup_into_application(List<String> data) {
        System.out.println(data.get(0));
        System.out.println(data.get(1));
        System.out.println(data.get(2));
        System.out.println(data.get(3));
    }

    @Given("setup the entries in database")
    public  void setEntries(){
        System.out.println("+++++++++++++++++++++++++");
        System.out.println("Setup foe entries");
    }

    @When("launch the browser from config variables")
    public void launchBrowser(){
        System.out.println("launch the browser from config variables");
    }

    @When("hit the home page url of banking site")
    public void lanuchUrl(){
        System.out.println("hit the home page url of banking site");
    }
}
