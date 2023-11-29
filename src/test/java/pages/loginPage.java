package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

    protected WebDriver driver;

    By txt_username = By.name("username");
    By txt_password = By.name("password");
    By btn_login = By.tagName("button");
    By error_inavlidlogin = By.className("orangehrm-login-error");

    public loginPage(WebDriver driver)
    {
        this.driver= driver;
    }

    public void enterUsername(String username)
    {
        driver.findElement(txt_username).sendKeys(username);
    }

    public void enterPassword(String password)
    {
        driver.findElement(txt_password).sendKeys(password);
    }

    public void clickLogin()
    {
        driver.findElement(btn_login).submit();
    }

    public boolean error_invalidlogin()
    {
        return driver.findElement(error_inavlidlogin).isDisplayed();
    }


}
