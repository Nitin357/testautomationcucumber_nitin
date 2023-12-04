package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dashboard {

    protected WebDriver driver;

    @FindBy(xpath = "//h6[text()='Dashboard']")
    WebElement text_dashboard;

    public dashboard(WebDriver driver)
    {
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }
    /*
    By text_dashboard = By.xpath("//h6[text()='Dashboard']");

    public dashboard(WebDriver driver)
    {
        this.driver = driver;
    }

     */

    public String text_dasboard()
    {
        return text_dashboard.getText();
    }
}

