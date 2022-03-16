package com.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)// main execution point 
@CucumberOptions(
		
		features ="..//CucumberProject_002_Data_Parameterization/src/test/java/Features/login.feature",
		glue = {"com.stepDefination"}
		)

public class Runner {

}
