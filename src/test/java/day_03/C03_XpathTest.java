package day_03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_XpathTest {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        WebElement b = driver.findElement(By.xpath("//button[text()='Add Element']"));
        b.click();
        WebElement delete = driver.findElement(By.xpath("//button[text()='Delete']"));
        if (delete.isDisplayed()) {
            System.out.println("delete butonu görünüyo testi PASS");
        } else {
            System.out.println("delete butonu görünüyot testi FAİLED");
        }

        delete.click();
        WebElement addYazısıTesti = driver.findElement(By.xpath("//h3[text()='Add/Remove Elements']"));
        WebElement addYazısıTesti1 = driver.findElement(By.tagName("h3"));
        if (addYazısıTesti.isDisplayed()) {
            System.out.println("basarılı");
        } else {
            System.out.println("Failed");
        }
        driver.close();


    }
}
