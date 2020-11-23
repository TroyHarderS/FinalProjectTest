package pages;

import org.openqa.selenium.By;

public class PlayStation4Page extends Common{

    private By addToCartElement = By.id("add_to_cart_btn");
    private By goToCartElement = By.xpath("//a[@class='main-button']");

       public void addToCart(){
        driver.findElement(addToCartElement).click();
        driver.switchTo().frame("_hjRemoteVarsFrame");
        driver.findElement(goToCartElement).click();
    }


}
