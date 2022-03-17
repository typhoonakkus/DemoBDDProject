package Runner;


import Base.Driver;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/Features/Test.feature",
		glue = {"stepDef","Hooks"},
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		//tags = "@Smoke or @Regression
		)


public class Runner extends Driver{

}
