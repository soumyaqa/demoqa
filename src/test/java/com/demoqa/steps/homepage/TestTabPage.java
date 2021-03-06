package com.demoqa.steps.homepage;

import com.demoqa.pageobjects.homepage.HomePage;
import com.demoqa.pageobjects.homepage.TabPage;
import cucumber.api.java8.En;
import static org.assertj.core.api.Assertions.*;
/**
 * Created by New on 4/21/2017.
 */
public class TestTabPage implements En{
    private static final TabPage tabPage = new TabPage();
    public static HomePage homePage;

    public TestTabPage(){
        Given("^I'm on the homepage$", () -> {
            homePage = new HomePage();
            homePage.setBrowser("chrome");
            homePage.openPage();
        });

        When("^I select (\\d+) Tab$", (Integer tabNumber) -> {
            tabPage.setHomePage(homePage);
            tabPage.selectTab(tabNumber);
        });

        Then("^I should see \"([^\"]*)\" as title$", (String tabTitle) -> {
            assertThat(tabPage.getTitle()).isEqualTo(tabTitle);
            tabPage.close();
        });
    }
}
