package pages;
import org.openqa.selenium.By;
import models.*;

import static org.assertj.core.api.Assertions.assertThat;


public class HomePage extends Common {

    private By searchBarElement = By.id("q");
    private By searchButtonElement = By.xpath("//button[@class='main-search-submit ']");
    private By validate1aLink = By.xpath("//a[@herf='https://www.1a.lv/']");

    public void findStation() {
        ProductModel model = new ProductModel();
        driver.findElement(searchBarElement).sendKeys(model.getType());
        driver.findElement(searchButtonElement).click();

    }

    public void validate1aString (String url) {
        String messageText = driver.findElement(validate1aLink).getText();
        assertThat(messageText).isEqualTo(url);
    }


}
