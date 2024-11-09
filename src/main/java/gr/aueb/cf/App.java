package gr.aueb.cf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * Hello world with Selenium Web Driver!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://tutorialsninja.com/demo/index.php?route=common/home");

        chromeDriver.manage().window().maximize();

        WebElement searchField =  chromeDriver.findElement(By.name("search"));




        chromeDriver.close();
    }
}
