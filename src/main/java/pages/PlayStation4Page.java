package pages;

import org.openqa.selenium.By;

public class PlayStation4Page extends Common{

    private By addToCartElement = By.id("add_to_cart_btn");
    private By goToCartElement = By.xpath("//a[@class='main-button']");


    private By blankFrame = By.id("_hjRemoteVarsFrame");


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
