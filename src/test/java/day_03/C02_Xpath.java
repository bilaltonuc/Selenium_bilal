package day_03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Xpath {
    //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
    //2- Add Element butonuna basin
    //3- Delete butonu’nun gorunur oldugunu test edin
    //4- Delete tusuna basin
    //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        WebElement b= driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        b.click();
        WebElement delete= driver.findElement(By.xpath("//button[@class='added-manually']"));
       if (delete.isDisplayed()) {
           System.out.println("delete butonu görünüyo testi PASS");
       }else {
           System.out.println("delete butonu görünüyot testi FAİLED");
       }

delete.click();
       WebElement addYazısıTesti=driver.findElement(By.xpath("//h3"));
       WebElement addYazısıTesti1=driver.findElement(By.tagName("h3"));
       if (addYazısıTesti.isDisplayed()){
           System.out.println(  "basarılı");
       }else {
           System.out.println("Failed");
       }
driver.close();
    }


}
