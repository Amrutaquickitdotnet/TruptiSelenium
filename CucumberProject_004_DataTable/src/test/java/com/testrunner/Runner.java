package com.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)// main execution point 
@CucumberOptions(
		
		features ="G:\\Trupti\\CucumberProject_004_DataTable\\src\\test\\java\\Features\\login.feature",
		glue = {"com.stepDefination"}
		)

public class Runner {

}
