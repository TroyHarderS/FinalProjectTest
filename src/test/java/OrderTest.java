
import Helper.Common;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.*;

public class OrderTest {

    @Before

    public void beforeTest() {
        System.out.println("Its Shopping Time!");
    }

    @Test
    public void OrderPS4Test() {
        Common common = new Common();
        HomePage homePage = new HomePage();
        SearchPage searchPage = new SearchPage();
        PlayStation4Page playStationPage = new PlayStation4Page();
        CheckoutPage checkoutPage = new CheckoutPage();
        CartPage cartPage = new CartPage();
        LoginPage loginPage = new LoginPage();


        common.startPage("https://www.1a.lv/");


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //homePage.validate1aString("Ir četri galvenie sīkfailu veidi, kuriem mēs sekojam 1a.lv vietnē.");

        homePage.findStation();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        common.scrollDown();
        searchPage.findExpensivePS4();
        playStationPage.addToCart();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cartPage.pressContinue();
        loginPage.loginWithEmail();
        checkoutPage.fillCustomerForm();
        checkoutPage.saveFinalPriceTry();
        checkoutPage.saveFinalPrice();
        checkoutPage.checkIfFinalPriceIsEqualToStartPrice();


        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @After
    public void reportReady() {
        Common common = new Common();
        common.stopDriver();
        System.out.println("Well Done!");
    }

}