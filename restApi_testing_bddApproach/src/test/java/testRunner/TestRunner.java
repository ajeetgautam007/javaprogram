package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

features = "C:\\Users\\AjeetG\\eclipse-workspace\\restApi_testing_bddApproach\\features",
glue = "stepDefinition"
)
public class TestRunner {

}
