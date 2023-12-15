package stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.dashboard;
import pages.loginPage;

import java.time.Duration;

public class LoginOrangeHRMSteps {

    WebDriver driver;

    @Before
    public void browserSetup() {
        System.setProperty("webdriver.chrome.driver","drivers/windows/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

    }
    @Given("User is on login page")
    public void user_is_on_login_page() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @When("the user enters valid username and password credentials")
    public void the_user_enters_valid_username_and_password_credentials() throws InterruptedException {
        loginPage login =new loginPage(driver);
        login.enterUsername("Admin");
        login.enterPassword("admin123");
        Thread.sleep(4000);
           }

    @When("the user enters invalid credentials")
    public void the_user_enters_invalid_credentials() throws InterruptedException {
        loginPage login =new loginPage(driver);
        login.enterUsername("Admin");
        login.enterPassword("admin");
        Thread.sleep(4000);
    }
    @When("clicks the login button")
    public void clicks_the_login_button() throws InterruptedException {
        loginPage login =new loginPage(driver);
        login.clickLogin();
        Thread.sleep(4000);
    }
    @Then("the user should be redirected to the dashboard")
    public void the_user_should_be_redirected_to_the_dashboard() {
        dashboard dash =new dashboard(driver);
        Assert.assertEquals("Dashboard", dash.text_dasboard());
    }

    @Then("the user should see an error message")
    public void the_user_should_see_an_error_message() {
        loginPage login =new loginPage(driver);
        Assert.assertTrue(login.error_invalidlogin());

    }

    @After
    public void teardown()
    {
        driver.close();
        driver.quit();
    }


}
