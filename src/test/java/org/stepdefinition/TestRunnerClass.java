package org.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources" , glue = "org.stepdefinition" , 
monochrome = true , strict = true,plugin = {"html:records1", "junit:reports1\\junitreports1.xml" ,"json:reports1\\jsonreports1.json"} )
public class TestRunnerClass {

}
