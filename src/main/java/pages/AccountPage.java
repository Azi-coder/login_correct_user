package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage {
    private WebDriver driver;
    private By logoutButton = By.cssSelector("a[href = \"/logout\"]");
    private By deleteAccountButton = By.cssSelector("a[href = \"/delete_account\"]");
    private By userName = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a/b");

    public AccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clicklogoutButton() {
        driver.findElement(logoutButton).click();
        return new LoginPage(driver);
    }

    public DeleteAccountPage clickdeleteAccountButton() {
        driver.findElement(deleteAccountButton).click();
        return new DeleteAccountPage(driver);
    }

    public String getUserName() {
        return driver.findElement(userName).getText();
    }
}

