package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import net.bytebuddy.implementation.bind.annotation.RuntimeType;


@CucumberOptions(
        features = "src/test/resources/features/",
        tags = "@tag",
        glue = {"stepdefinitions","utils"},
        plugin = {
                "html:target/cucumber-reportsUI.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt"
        }

)

public class Runner extends AbstractTestNGCucumberTests {
}
