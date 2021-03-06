package pages;

import helper.Common;
import models.CustomerModel;
import org.openqa.selenium.By;

public class CheckoutPage extends Common {

    private By getFromOfficeElement = By.xpath("//label[@class='for-radio click-toggle']");
    private By nameBarElement = By.id("address_first_name");
    private By lastNameBarElement = By.id("address_last_name");
    private By phoneNumberBarElement = By.id("address_phone_number");
    private By chooseLucavsala = By.xpath("//div[@class='pickup-point-name']");
    private By checkElement = By.xpath("//button[@class='main-button upcase button-min-width']");
    private By continueElement = By.xpath("//button[@class='main-button upcase fr small-radius button-min-width checkout-shipping-continue-button']");

    public void fillCustomerForm() {
        CustomerModel customerModel = new CustomerModel();
        Common common = new Common();

        driver.findElement(getFromOfficeElement).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(chooseLucavsala).click();
        driver.findElement(nameBarElement).sendKeys(customerModel.getName());
        driver.findElement(lastNameBarElement).sendKeys(customerModel.getLastName());
        driver.findElement(phoneNumberBarElement).sendKeys(customerModel.getPhoneNumber());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(checkElement).click();



        driver.findElement(continueElement).submit();
    }
}
