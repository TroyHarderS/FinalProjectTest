package pages;

import Helper.Common;
import models.OrderModel;
import org.openqa.selenium.By;
import static org.assertj.core.api.Assertions.assertThat;
import static pages.SharedContext.productNameOn1a;


public class PlayStation4Page extends Common {

    private By addToCartElement = By.id("add_to_cart_btn");
    private By goToCartElement = By.xpath("//a[@class='main-button']");
    private final By startPrice = By.xpath("//div[@class='detailed-cart-item__column detailed-cart-item__column--price']");
    private By productNameOn1aElement = By.xpath("//a[@class='detailed-cart-item__name-link']");

    public void saveStartPrice() {
        SharedContext.startPrice = driver.findElement(startPrice).getText();
    }
    public void saveProductNameOn1a() {
        SharedContext.productNameOn1a = driver.findElement(productNameOn1aElement).getText();
    }

    public PlayStation4Page validateItemName() {
        OrderModel orderModel = new OrderModel();
        System.out.println("Full name of the product: " + orderModel.getName());
        System.out.println("Full name on 1a: " + productNameOn1a);
        assertThat(orderModel.getName()).isEqualTo(productNameOn1a);
        return this;
    }


        public void addToCart() {

            driver.findElement(addToCartElement).click();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            saveProductNameOn1a();
            saveStartPrice();
            validateItemName();
            driver.findElement(goToCartElement).click();
        }


    }

