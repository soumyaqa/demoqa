package com.demoqa;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//@CucumberOptions(tags = {"@in-progress"}, features = {"src/test/resources/features"}, plugin = {"pretty","html:target/cucumber"})
@CucumberOptions(features = {"src/test/resources/features"}, format = {"pretty","html:target/cucumber"})
public class RunCukesTest{

}