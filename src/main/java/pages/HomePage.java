package pages;
import Helper.Common;
import org.openqa.selenium.By;
import models.*;

import static org.assertj.core.api.Assertions.*;
import static pages.SharedContext.*;



public class HomePage extends Common {

    private By searchBarElement = By.id("q");
    private By searchButtonElement = By.xpath("//button[@class='main-search-submit ']");
    private By link1aElement = By.xpath("//snap[@calss='main-menu__handle-text']");

    public void findStation() {
        ProductModel model = new ProductModel();
        driver.findElement(searchBarElement).sendKeys(model.getType());
        driver.findElement(searchButtonElement).click();

    }

    }