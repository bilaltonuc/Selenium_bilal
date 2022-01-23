package day_02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverGetMethodları {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();


        driver.get("https://www.amazon.com");
        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getWindowHandles());

        System.out.println( driver.getPageSource());


    }
}
