package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteAccountPage {
    private WebDriver driver;
    private By deleteAccountButton1 = By.cssSelector("a[href = \"/delete_account\"]");
    private By deleteAccountButton2 = By.cssSelector("button[data-toggle = \"modal\"]");
    private By deleteAccountButton3 = By.xpath("//*[@id=\"deleteModal\"]/div/div/div[2]/form/button");

    public DeleteAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickdeleteAccountButton1() {
        driver.findElement(deleteAccountButton1).click();
    }

    public void clickdeleteAccountButton2() {
        driver.findElement(deleteAccountButton2).click();
    }

    public void clickdeleteAccountButton3() {
        driver.findElement(deleteAccountButton3).click();
    }
}

