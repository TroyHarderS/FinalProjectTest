package pages;

import Helper.Common;
import models.ProductModel;
import org.openqa.selenium.By;
import static org.assertj.core.api.Assertions.assertThat;

public class PlayStation4Page extends Common {

    private By addToCartElement = By.id("add_to_cart_btn");
    private By goToCartElement = By.xpath("//a[@class='main-button']");
    private final By startPrice = By.xpath("//span[@class='price']//span[1]");

    public void saveStartPrice() {
        SharedContext.startPrice = driver.findElement(startPrice).getText();
    }


        public void addToCart() {
            driver.findElement(addToCartElement).click();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            saveStartPrice();
            driver.findElement(goToCartElement).click();
        }


    }

