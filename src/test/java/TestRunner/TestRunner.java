package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\nagar\\OneDrive\\Desktop\\New folder\\New folder (2)\\QualityAnalystt\\Features\\ShoppingCart.feature",
        glue = "StepDefinitions",
        monochrome = true,
        plugin = {"pretty","html:target/HtmlReport.html"}
)
public class TestRunner {
}
