package pages;

import Helper.Common;
import models.CustomerModel;
import org.openqa.selenium.By;

import static org.assertj.core.api.Assertions.*;
import static pages.SharedContext.finalPrice;
import static pages.SharedContext.startPrice;

public class CheckoutPage extends Common {

    private By getFromOfficeElement = By.xpath("//div[@class='label-in clearfix']");
    private By nameBarElement = By.id("address_first_name");
    private By lastNameBarElement = By.id("address_last_name");
    private By phoneNumberBarElement = By.id("address_phone_number");
    private By chooseLucavsala = By.xpath("//input[@type='radio']");
    private By finalPriceElement = By.xpath("//td[@class='checkout-order-summary-total-products__price']");


    public void saveFinalPrice() {
        SharedContext.finalPrice = driver.findElement(finalPriceElement).getText();
    }

    public CheckoutPage checkIfFinalPriceIsEqualToStartPrice() {
        System.out.println("Start price: " + startPrice);
        System.out.println("Final price: " + finalPrice);
        assertThat(startPrice).isEqualTo(finalPrice);
        return this;
    }

    public void fillCustomerForm() {
        CustomerModel customerModel = new CustomerModel();

        driver.findElements(getFromOfficeElement).get(1).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElements(chooseLucavsala).get(4).click();
        driver.findElement(nameBarElement).sendKeys(customerModel.getName());
        driver.findElement(lastNameBarElement).sendKeys(customerModel.getLastName());
        driver.findElement(phoneNumberBarElement).sendKeys(customerModel.getPhoneNumber());

        saveFinalPrice();
        checkIfFinalPriceIsEqualToStartPrice();
    }
}
