package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class dashboard {

    protected WebDriver driver;
    By text_dashboard = By.xpath("//h6[text()='Dashboard']");

    public dashboard(WebDriver driver)
    {
        this.driver = driver;
    }

    public String text_dasboard()
    {
        return driver.findElement(text_dashboard).getText();
    }
}

