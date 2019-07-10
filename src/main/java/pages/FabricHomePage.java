package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.PageObject;

public class FabricHomePage {
    @FindBy(xpath = "//*[@id='email']")
    WebElementFacade enterUserName;

    public static boolean isexecuted = false;
    public static WebDriver driver;
    public static void settingProperty(){
        if(!isexecuted) {
            System.setProperty("webdriver.chrome.driver", "/Users/Manidhar/Documents/craslytics-automation/crashlytics-logger/chromedriver");
            driver = new ChromeDriver();
            FabricHomePage.isexecuted = true;
        }
    }
    public static WebDriver driver(){
        FabricHomePage.settingProperty();
        return driver;
    }
    public static void LaunchBrowser(){
        driver().navigate().to("https://fabric.io/login/");
    }
    public void login(String username,String password){
        enterUserName.sendKeys(username);
        driver().findElement(By.xpath("//*[@id='password']")).sendKeys(password);
        driver().findElement(By.xpath("//*[@class='block sdk-button sign-in']")).click();
    }

    public static void navigateToCrashlytics(String platformName) throws InterruptedException {
        driver().findElement(By.xpath("//input[@class='inverse']")).sendKeys(platformName);
        Thread.sleep(2000);
        driver().findElement(By.xpath("//*[@class='flex-1 flex-box flex-column js-app-view']")).click();
    }
    public void sample() throws InterruptedException {
        FabricHomePage.LaunchBrowser();
        Thread.sleep(5000);
        login("mradu.mishra@gdn-commerce.com", "Mradu123");
        Thread.sleep(2000);
        FabricHomePage.navigateToCrashlytics("Blibli Android");
    }
}
