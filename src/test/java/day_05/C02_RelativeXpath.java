package day_05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C02_RelativeXpath {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");

        WebElement toronto= driver.findElement(By.id("pid2_thumb"));
        WebElement berlin=driver.findElement(By.id("pid7_thumb"));
        WebElement mountie= driver.findElement(By.id("pid10_thumb"));
        WebElement london= driver.findElement(By.id("pid5_thumb"));







        WebElement boston=driver.findElement(RelativeLocator.with(By.tagName("img")).below(toronto).above(mountie));
        WebElement boston2= driver.findElement(RelativeLocator.with(By.tagName("img")).toRightOf(london).toLeftOf(berlin));

        String expectedValue="pid6_thumb";
        String actualValue=boston.getAttribute("id");
        String actualValue1=boston2.getAttribute("id");

        if (expectedValue.equals(actualValue)){
            System.out.println("1.relative locate testi PASSED");
        }else {
            System.out.println("1.relative locate testi FAİLED");
        }
        if (expectedValue.equals(actualValue1)){
            System.out.println("2.relative locate testi PASSED");
        }else {
            System.out.println("2.relative kocate testi FAİLED");
        }



    }



}
