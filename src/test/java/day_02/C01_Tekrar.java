package day_02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Tekrar {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");

    WebDriver driver=new ChromeDriver();

    driver.get("https://www.amazon.com");

    Thread.sleep(5000);
    // java'dan gelir,içine yazılan mili saniye kadar codeların calısmasını durdurur.

    driver.close();
    driver=new ChromeDriver();
    driver.get("https://www.java.com");

    }




}
