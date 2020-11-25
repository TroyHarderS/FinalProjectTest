package pages;
import Helper.Common;
import org.openqa.selenium.By;

public class CartPage extends Common {

    private By continueElement = By.xpath("//input[@class='main-button cart-main-button']");


    public void pressContinue() {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(continueElement).click();
    }


}
