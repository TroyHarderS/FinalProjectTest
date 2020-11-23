package pages;

import models.CustomerModel;
import models.ProductModel;
import org.openqa.selenium.By;

public class LoginPage extends Common{

    private By emailBarElement = By.id("user_email");
    private By submitElement = By.xpath("//input[@class='users-session-form__submit']");

    public void loginWithEmail() {
        CustomerModel customerModel = new CustomerModel();
        driver.findElement(emailBarElement).sendKeys(customerModel.getEmail());
        driver.findElements(submitElement).get(1).click();
    }


}
