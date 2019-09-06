package dzieciak;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {
                "src/test/resources/features/"
        },
        plugin = {
                "pretty",
                "html:target/cucumber/report-html",
                "json:target/cucumber/report.json",
                "junit:target/cucumber/junit_report.xml",
                "timeline:target/cucumber/timeline"
        },
        tags = {
                "@Demo"
        })
public class CucumberTests extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

}
