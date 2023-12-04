package testRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C://Users//nitin.magar.ININDCRWS//Documents//GitHub//testautomationcucumber_nitin//features//LoginOrangeHRM.feature",
        glue = "stepDefinations"
)
public class TestRunner {
}
