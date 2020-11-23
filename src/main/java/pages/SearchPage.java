package pages;
import org.openqa.selenium.By;
import models.*;
import org.openqa.selenium.JavascriptExecutor;

public class SearchPage extends Common {
    private By brandSonyElement = By.xpath("//a[@class='filter-link']");
    private By brandSearchBarElement = By.xpath("//input[@class='form-control filter-search__input']");
    private By bestDealElement = By.xpath(("//input[@type='checkbox']"));
    private By bestDeal = By.xpath("//div[@class='new-product-item catalog-taxons-product']");


    public void findExpensivePS4() {
        ProductModel model = new ProductModel();
        Common common = new Common();


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElements(brandSonyElement).get(10).click();
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
        driver.findElements(brandSonyElement).get(3).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

            driver.findElement(bestDeal).click();

            // public void chooseTopElement() {
            //  driver.findElements(bestDealElement).get(11).click();
        }

        //  public void choosePS4() {
        //     driver.findElement(bestDeal).click();
        //  }
    }


