package com.demoqa.steps.homepage;

/**
 * Created by New on 4/20/2017.
 */

import com.demoqa.pageobjects.homepage.HomePage;
import com.demoqa.utils.Log;
import cucumber.api.java8.En;
import static org.assertj.core.api.Assertions.*;

public class TestHomePage implements En {
    private static final HomePage homePage  = new HomePage();

   public TestHomePage(){

        Given("^I have \"([^\"]*)\" open$", (String browser) -> {
            Log.info("opening the browser");
            homePage.setBrowser(browser);
        });

        When("^I visit \"([^\"]*)\"$", (String url) -> {
            Log.info("opening the home page");
            homePage.openPage();
        });

        Then("^home page title should be \"([^\"]*)\"$", (String title) -> {
            Log.info("verifying the title");
            assertThat(homePage.getTitle()).isEqualTo(title);
            homePage.close();
        });
    }
}
