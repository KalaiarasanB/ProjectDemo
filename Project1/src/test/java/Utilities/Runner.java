package Utilities;

import org.junit.runner.RunWith;

import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
glue= {"com.stepdefiniation"},
dryRun=false,
monochrome=true,
plugin = {"pretty","html:target/HtmlReports",
		"json:target/JSONReports/report.json",
		"junit:target/JUnitReports/report.xml"}

)
public class Runner{
	
	
}