package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features = "src/test/resources/features/searchEbay.feature", glue = "definitions")
public class runnerBusqueda extends AbstractTestNGCucumberTests {
}
