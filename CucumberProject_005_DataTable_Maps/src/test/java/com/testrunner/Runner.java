package com.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)// main execution point 
@CucumberOptions(
		
		features ="G:\\Trupti\\CucumberProject_005_DataTable_Maps\\src\\test\\java\\Features\\login.feature",
		glue = "com.stepDefination",
		monochrome =  true,
		dryRun= false,
		plugin = {"pretty", "html:target/bdd.html", "json: target/Json/login.json"}
		)

public class Runner {

}
