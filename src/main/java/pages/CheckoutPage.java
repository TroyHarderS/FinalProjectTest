package pages;

import Helper.Common;
import models.CustomerModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

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

    public CheckoutPage saveFinalPrice() throws InterruptedException {
        WebElement element = driver.findElement(finalPriceElement);
        wait.until(ExpectedConditions.visibilityOf(element));
        String price = element.getText();
        finalPrice = price.substring(0, price.length() -2);
        return this;
    }

    public void saveFinalPriceTry() {
        SharedContext.startPrice = driver.findElement(finalPriceElement).getText();
        ;
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
    }
}





//package pages;
//
//import Helper.Common;
//import models.CustomerModel;
//import models.ProductModel;
//import org.openqa.selenium.By;
//
//public class CheckoutPage extends Common {
//
//    private By getFromOfficeElement = By.xpath("//label[@class='for-radio click-toggle']");
//    private By nameBarElement = By.id("address_first_name");
//    private By lastNameBarElement = By.id("address_last_name");
//    private By phoneNumberBarElement = By.id("address_phone_number");
//    private By chooseLucavsala = By.xpath("//input[@type='radio']");
//    private By finalPriceElement = By.xpath("//p[@class='detailed-cart-item__total']");
//
//    public void validateFinalPrice() {
//        ProductModel productModel = new ProductModel();
//        driver.findElement(finalPriceElement).getText();
//    }
//
//    public void fillCustomerForm() {
//
//        CustomerModel customerModel = new CustomerModel();
//
//        driver.findElements(getFromOfficeElement).get(2).click();
//
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        driver.findElements(chooseLucavsala).get(4).click();
//        driver.findElement(nameBarElement).sendKeys(customerModel.getName());
//        driver.findElement(lastNameBarElement).sendKeys(customerModel.getLastName());
//        driver.findElement(phoneNumberBarElement).sendKeys(customerModel.getPhoneNumber());
//
//    }
//}
