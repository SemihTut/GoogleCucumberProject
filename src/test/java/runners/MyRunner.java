package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports",
                "rerun:target/rerun.txt"},
        features = "src/test/resources/",
        glue = "stepDefinitions",
        dryRun = false




)
/**
 * We can run the test cases directly with mvn command belo
 * mvn test -Dbrowser=firefox -Dcucumber.options="--tags @smoke"
 * mvn test -Dcucumber.options="--tags @smoke"
 */
public class MyRunner {

}
//mvn test -Dbrowser=firefox -Dcucumber.options="--tags @smoke"
//mvn test -Dcucumber.options="--tags @smoke"