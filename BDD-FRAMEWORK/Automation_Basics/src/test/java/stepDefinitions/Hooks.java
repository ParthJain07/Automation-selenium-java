package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before("@NetBanking")
    public void netBankingSetup(){
        System.out.println("******************************************");
        System.out.println("Setup the entries in NetBanking database");

    }

    @After
    public void tearDown(){

        System.out.println("Clear the entries");
    }

    @Before("@Mortage")
    public void mortageSetup(){
        System.out.println("Setup the entries in Mortage database");

    }

}
