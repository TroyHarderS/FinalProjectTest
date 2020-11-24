package pages;
import org.openqa.selenium.By;
import models.*;

import static org.assertj.core.api.Assertions.assertThat;


public class HomePage extends Common {

    private By searchBarElement = By.id("q");
    private By searchButtonElement = By.xpath("//button[@class='main-search-submit ']");
    private By validate1aLink = By.id("c-left");

    public void findStation() {
        ProductModel model = new ProductModel();
        driver.findElement(searchBarElement).sendKeys(model.getType());
        driver.findElement(searchButtonElement).click();

    }

    public void validate1aString (String text) {
        String messageText = driver.findElements(validate1aLink).get(1).getText();
        assertThat(messageText).isEqualTo(text);
    }


}
