package pages;
import Helper.Common;
import models.CustomerModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

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
