package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
    public WebDriver driver;

    public LandingPage(WebDriver driver){
        this.driver = driver;
    }
    By search = By.xpath("//input[@type='search']");
    By productName = By.cssSelector("h4.product-name");
    By topDeals =By.linkText("Top Deals");
    By addToCart = By.xpath("//*[contains(text(), 'ADD TO CART')]");
    By increment = By.cssSelector("a.increment");

    public void SearchItem(String shortName){
        driver.findElement(search).sendKeys(shortName);
    }

    public void getSearchText(String shortName){
        driver.findElement(search).getText();
    }

    public String getProductName(){
        return driver.findElement(productName).getText();
    }

    public void selectTopDealsPage(){
        driver.findElement(topDeals).click();
    }

    public String getTitleLandingPage(){
        return  driver.getTitle();
    }

    public void incrementQuantity(int Quantity){
        int i = Quantity;
        while(i >0){
            driver.findElement(increment).click();
            i--;
        }
    }

    public void addToCartAction(){

    }
}
