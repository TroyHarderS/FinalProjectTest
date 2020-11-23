package pages;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Common {

    public static WebDriver driver;

    public void startPage(String url) {
        String driverPath = "C:\\Users\\andre\\IdeaProjects\\GradleTestProject\\src\\test\\resources\\";
        System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(url);



    }

    public void scrollUp() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(0,-800)"); }

        public void scrollDown () {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("javascript:window.scrollBy(0,1000)");
        }
        public void stopDriver () {
            driver.quit();
        }


}
