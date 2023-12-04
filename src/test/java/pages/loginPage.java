package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

    protected WebDriver driver;

    @FindBy(name= "username")
    WebElement txt_username;

    @FindBy(name= "password")
    WebElement txt_password;

    @FindBy(tagName = "button")
    WebElement btn_login;

    @FindBy(className = "orangehrm-login-error")
    WebElement error_invalidlogin;

    public loginPage(WebDriver driver)
    {
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }



    /*
    By txt_username = By.name("username");
    By txt_password = By.name("password");
    By btn_login = By.tagName("button");
    By error_invlidlogin = By.className("orangehrm-login-error");

    public loginPage(WebDriver driver)
    {
        this.driver= driver;
    }
     */

    public void enterUsername(String username)
    {
        txt_username.sendKeys(username);
    }

    public void enterPassword(String password)
    {
        txt_password.sendKeys(password);
    }

    public void clickLogin()
    {
        btn_login.submit();
    }

    public boolean error_invalidlogin()
    {
        return error_invalidlogin.isDisplayed();
    }


}
