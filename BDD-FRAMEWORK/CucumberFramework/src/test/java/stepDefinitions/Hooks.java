package stepDefinitions;

import io.cucumber.java.After;
import utils.TextContextSetup;

import java.io.IOException;

public class Hooks {
    TextContextSetup textContextSetup;
    public Hooks(TextContextSetup textContextSetup){
        this.textContextSetup = textContextSetup;
    }

    @After
    public void AfterScenario() throws IOException {

        textContextSetup.testBase.WebDriverManager().quit();
    }
}
