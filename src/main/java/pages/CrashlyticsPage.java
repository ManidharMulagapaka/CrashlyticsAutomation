package pages;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import static pages.FabricHomePage.driver;

public class CrashlyticsPage {
    public static void navigateToCrashlytics() throws InterruptedException {
            Thread.sleep(3000);
            driver().findElement(By.xpath("(//*[@class='flex-box align-items-center'])[4]")).click();
            Thread.sleep(3000);
    }
    public static void buildNumber() throws InterruptedException {
        Thread.sleep(5000);
        driver().findElement(By.xpath("//*[@class='Select-arrow']")).click();
        driver().findElement(By.xpath("//*[@class='Select-value']/span")).click();
        Thread.sleep(7000);
        driver().findElement(By.xpath("//*[@class='Select-arrow']")).click();
        Thread.sleep(8000);
        driver().findElement(By.xpath("(//*[@role='combobox'])[1]")).click();
        driver().findElement(By.xpath("(//*[@role='combobox'])[1]")).sendKeys(Keys.ENTER);
        Thread.sleep(7000);
    }
    public static void main(String[] args) throws InterruptedException {
        FabricHomePage f =new FabricHomePage();
        f.sample();
        navigateToCrashlytics();

    }
}
