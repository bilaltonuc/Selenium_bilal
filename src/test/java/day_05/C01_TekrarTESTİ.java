package day_05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.time.Duration;

public class C01_TekrarTESTİ {
    //1-C01_TekrarTesti isimli bir class olusturun
    //2- https://www.amazon.com/ adresine gidin
    //3- Browseri tam sayfa yapin
    //4-Sayfayi “refresh” yapin
    //5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin






    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/ ");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().fullscreen();
        driver.navigate().refresh();
        driver.manage().window().fullscreen();
        String actualTitle= driver.getTitle();
        String expectedTitle="Spend less";
        if (actualTitle.contains(expectedTitle)){
            System.out.println("test PASSED");
        }else {
            System.out.println("test FAİLED/n title:"+ actualTitle);
        }
       //6- Gift Cards sekmesine basin
        driver.findElement(By.xpath("//a[@href='/gift-cards/b/?ie=UTF8&node=2238192011&ref_=nav_cs_gc']")).click();
        //7- Birthday butonuna basin

        driver.findElement(By.xpath("//img[@alt='Birthday Gift Cards']")).click();

        //8- Best Seller bolumunden ilk urunu tiklayin

        driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[1]")).click();
        //9- Gift card details’den 25 $’i secin
        driver.findElement(By.id("a-autoid-9")).click();
        //10-Urun ucretinin 25$ oldugunu test edin
        WebElement urunÜcreti=driver.findElement(By.xpath("//span[@class='a-color-price a-text-bold']"));

        String expectedValue="$25.00";
        String actualValue=urunÜcreti.getText();
        if (expectedValue.equals(actualValue)){
            System.out.println("test PASSED");
        }else {
            System.out.println("test FAİLED");
        }
        //10-Sayfayi kapatin
        driver.close();




    }
}
