package pages;

import static org.assertj.core.api.Assertions.assertThat;
import helper.Common;
import org.openqa.selenium.By;
import models.*;

public class HomePage extends Common {

    private By searchBarElement = By.id("q");
    private By searchButtonElement = By.xpath("//button[@class='main-search-submit ']");

    public void findStation() {
        OrderModel model = new OrderModel();
        validateShop();
        driver.findElement(searchBarElement).sendKeys(model.getType());
        driver.findElement(searchButtonElement).click();

    }

    public void validateShop() {
        String urlNow = driver.getCurrentUrl();
        OrderModel orderModel = new OrderModel();
        assertThat(urlNow).isEqualTo(orderModel.getShop());
        System.out.println("YEP, its 1a.lv!  ");
        }
    }

