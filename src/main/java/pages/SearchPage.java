package pages;
import helper.Common;
import org.openqa.selenium.By;

public class SearchPage extends Common {
    private By brandSonyElement = By.xpath("//a[@class='filter-link']");
    private By bestDeal = By.xpath("//div[@class='new-product-item catalog-taxons-product']");


    public void findExpensivePS4() {
        Common common = new Common();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElements(brandSonyElement).get(11).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        common.scrollUp();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
        driver.findElements(brandSonyElement).get(4).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(bestDeal).click();

    }
}


