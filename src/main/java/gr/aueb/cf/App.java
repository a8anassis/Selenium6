package gr.aueb.cf;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


/**
 * Hello world with Selenium Web Driver!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://tutorialsninja.com/demo/index.php?route=common/home");

        chromeDriver.manage().window().maximize();

        WebElement searchField =  chromeDriver.findElement(By.name("search"));
        searchField.click();
        Thread.sleep(3000);
        searchField.sendKeys("MacBook");
        Thread.sleep(3000);

        WebElement btn =  chromeDriver.findElement(By.className("btn-default"));
        btn.click();

        WebElement makBookLink = chromeDriver.findElement(By.linkText(""));
        makBookLink.click();




        chromeDriver.close();
    }
}
