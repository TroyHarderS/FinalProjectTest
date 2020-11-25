package pages;

import Helper.Common;
import models.CustomerModel;
import org.openqa.selenium.By;

public class LoginPage extends Common {

    private By emailBarElement = By.id("user_email");
    private By submitElement = By.xpath("//input[@class='users-session-form__submit']");

    public void loginWithEmail() {
        CustomerModel customerModel = new CustomerModel();
        driver.findElements(emailBarElement).get(1).sendKeys(customerModel.getEmail());
        driver.findElements(submitElement).get(1).click();
    }

}
