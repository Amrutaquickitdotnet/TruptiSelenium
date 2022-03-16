package com.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)// main execution point 
@CucumberOptions(
		
		features ="../CucumberProject/src/test/java/Features/login.feature",
		glue = {"com.stepDefination"}
		)

public class Runner {

}
