package com.demoqa.steps.homepage;

/**
 * Created by New on 4/20/2017.
 */

import com.demoqa.pageobjects.homepage.HomePage;
import cucumber.api.java8.En;
import static org.assertj.core.api.Assertions.*;

public class TestHomePage implements En {
    HomePage homePage;

   public TestHomePage(){

        Given("^I have \"([^\"]*)\" open$", (String browser) -> {
            homePage = new HomePage();
            homePage.setBrowser(browser);
        });

        When("^I visit \"([^\"]*)\"$", (String url) -> {
            homePage.openPage();
        });

        Then("^home page title should be \"([^\"]*)\"$", (String title) -> {
            assertThat(homePage.getTitle()).isEqualTo(title);
            homePage.close();
        });
    }
}
