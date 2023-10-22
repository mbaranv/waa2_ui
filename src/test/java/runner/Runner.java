package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import net.bytebuddy.implementation.bind.annotation.RuntimeType;


@CucumberOptions(
        features = "src/test/resources/features/",
        tags = "@tag",
        glue = {"stepdefinitions","utils"},
        plugin = {
                "pretty"
        }

)

public class Runner extends AbstractTestNGCucumberTests {
}
