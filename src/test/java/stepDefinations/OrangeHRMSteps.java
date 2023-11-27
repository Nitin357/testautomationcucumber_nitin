package stepDefinations;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMSteps {

    WebDriver driver;

    @Given("I launch Chrome browser")
    public void i_launch_chrome_browser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/windows/chromedriver.exe");
        driver = new ChromeDriver();
        Thread.sleep(4000);


    }

    @When("I open OrangeHRM Home Page")
    public void i_open_orange_hrm_home_page() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(4000);


    }

    @Then("I verify OrangeHRM logo Present on Home Page")
    public void i_verify_orange_hrm_logo_present_on_home_page() throws InterruptedException {
        Thread.sleep(4000);
        boolean status = driver.findElement(By.xpath("//div[@class='orangehrm-login-logo']")).isEnabled();
        Assert.assertTrue(status);

    }

    @And("close Browser")
    public void close_browser() {
         driver.close();
    }



}
