package cucumber_sample;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\admin\\eclipse-workspace\\sample\\Login.feature",
glue="cucumber_sample"
		)
public class TestRunner {

}
