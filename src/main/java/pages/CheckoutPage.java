package pages;

import models.CustomerModel;
import org.openqa.selenium.By;

public class CheckoutPage extends Common{

    private By getFromOfficeElement = By.xpath("//label[@class='for-radio click-toggle']");
    private By nameBarElement = By.id("address_first_name");
    private By lastNameBarElement = By.id("address_last_name");
    private By phoneNumberBarElement = By.id("address_phone_number");
    private By chooseLucavsala = By.xpath("//input[@type='radio']");

    public void fillCustomerForm() {

        CustomerModel customerModel = new CustomerModel();

        driver.findElements(getFromOfficeElement).get(2).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElements(chooseLucavsala).get(4).click();
        driver.findElement(nameBarElement).sendKeys(customerModel.getName());
        driver.findElement(lastNameBarElement).sendKeys(customerModel.getLastName());
        driver.findElement(phoneNumberBarElement).sendKeys(customerModel.getPhoneNumber());

    }
}
