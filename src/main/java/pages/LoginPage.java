package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By signInButton = By.cssSelector("button[data-qa = login-button]");
    private By signInEmail = By.cssSelector("input[data-qa = login-email]");

    private By signInPassword = By.cssSelector("input[data-qa = login-password]");
    
    private By signInText = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/h2");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setEmail(String userEmail) {
        driver.findElement(signInEmail).sendKeys(userEmail);
    }

    public void setPassword(String userPassword) {
        driver.findElement(signInPassword).sendKeys(userPassword);
    }
    
    public String getText(){
        return driver.findElement(signInText).getText();
    }

    public AccountPage clickSignInButton() {
        driver.findElement(signInButton).click();
        return new AccountPage(driver);
    }


}

