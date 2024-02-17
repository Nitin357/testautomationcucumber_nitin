package testRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//mvn test
//mvn test -Dcucumber.options=”Your Options”
//mvn test -Dcucumber.options=”--help”
//Run specific feature : mvn test -Dcucumber.options="src/test/resources/login.feature"
//Run specific scenario : mvn test -Dcucumber.options="feature file path:7"
//Run with Tags : mvn test -Dcucumber.options="--tags @Smoke"
//Reports : mvn test -Dcucumber.options=”--plugin html:target/HtmlReports”

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "features",
        glue = "stepDefinations",
        tags = "@smoke or @regression",
        plugin = {"pretty",
                "json:target/cucumber.json",
                "html:target/cucumber.html"}

)
public class TestRunner {


}
