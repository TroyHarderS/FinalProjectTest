package pages;

import helper.Common;
import org.openqa.selenium.By;

import static org.assertj.core.api.Assertions.assertThat;
import static pages.SharedContext.finalPrice;
import static pages.SharedContext.startPrice;

public class PaymentPage extends Common {

    private By payWithCashElement = By.xpath("//div[@class='label-in clearfix']");
    private By finalPriceElement = By.xpath("//td[@class='checkout-order-summary-total-products__price']");

    public void saveFinalPrice() {
        SharedContext.finalPrice = driver.findElement(finalPriceElement).getText();
    }

    public void validatePrice() {

        assertThat(startPrice).isEqualTo(finalPrice);
        System.out.println("Start price: " + startPrice);
        System.out.println("Final price: " + finalPrice);
    }

    public void fillPaymentForm() {
        driver.findElements(payWithCashElement).get(1).click();
        saveFinalPrice();
        validatePrice();
    }

}
