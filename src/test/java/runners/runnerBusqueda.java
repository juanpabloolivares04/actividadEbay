package runners;


import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(features = "src/test/resources/features/searchEbay.feature",glue = "definitions")
public class runnerBusqueda {
}
