package pages;
import org.openqa.selenium.By;
public class CartPage extends Common{

    private By continueElement = By.xpath("//input[@name='commit']");

    public void pressContinue() {
        driver.findElement(continueElement).click();
    }


}
