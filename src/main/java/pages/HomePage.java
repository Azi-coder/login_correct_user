package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By loginButton = By.cssSelector("a[href = \"/login\"]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickloginButton() {
        driver.findElement(loginButton).click();
        return new LoginPage(driver);
    }


}

