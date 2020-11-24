package pages;

import models.CustomerModel;
import models.ProductModel;
import org.openqa.selenium.By;

public class PlayStation4Page extends Common{

    private By addToCartElement = By.id("add_to_cart_btn");
    private By goToCartElement = By.xpath("//a[@class='main-button']");
    private By blankFrame = By.id("_hjRemoteVarsFrame");
    private By priceElement = By.xpath("//div[@class='product-price-details__block']");


     public void validateStartPrice() {
         ProductModel productModel = new ProductModel();
         driver.findElement(priceElement).getText();

     }

      public void switchFrame() {
          driver.switchTo().frame("_hjRemoteVarsFrame");
      }

       public void addToCart(){
        driver.findElement(addToCartElement).click();

           try {
               Thread.sleep(3000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }

          // driver.switchTo().frame("cart-popup-container");
     //  driver.switchTo().frame(driver.findElement(blankFrame));
      //  driver.findElement(goToCartElement).click();
    }


}
