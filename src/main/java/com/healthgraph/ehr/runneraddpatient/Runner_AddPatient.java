package com.healthgraph.ehr.runneraddpatient;

import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "C:\\Users\\lenovo\\eclipse-workspace\\HealthGraph\\src\\main\\java\\com\\heathgraph\\ehr\\feature\\AddPatient.feature",
		glue = {"com.healthgraph.ehr.addpatient" }, 
		monochrome = true, 
		dryRun = false,
		strict = true,
		 format =
		 {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
		tags = { "@Validate_Add_New_Patient" })

public class Runner_AddPatient {

}
