package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features= "C:\\Users\\durga\\eclipse-workspace\\BddCucumberW3HRM\\src\\test\\java\\features\\login.feature",
		glue="stepDefination",
		tags = "@Smoke",
		plugin= {"pretty",
				"html:Reports/newreport.html",
				"json:Reports/newreport.json",
				"rerun:target/rerun.txt",    //Mandatory to capture failures
		}
		)
public class TestRunner {

}
