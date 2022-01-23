package day_02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_GetMethods {
    //1. Yeni bir package olusturalim : day01
    //2. Yeni bir class olusturalim : C01_GetMethods

    //10. Sayfayi kapatin.
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //3. Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");
        //4. Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle());
        //5. Sayfa basliginin “Amazon” icerdigini test edin
        String actualTitle=driver.getTitle();
        String arananKelime="Amazon";
        if (actualTitle.contains(arananKelime)){
            System.out.println("Tıtle testi PASS");
        }

        else{
            System.out.println("failed");
        }
//6. Sayfa adresini(url) yazdirin
        driver.getCurrentUrl();
        //7. Sayfa url’inin “amazon” icerdigini test edin.
        String actualUrl=driver.getCurrentUrl();
        String urlArnan="Amazon";
        if (actualTitle.contains(urlArnan)) {
            System.out.println("pass");
        }else {
            System.out.println("failed");
        }
//8. Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());

        //9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin
        String actualPageSource= driver.getPageSource();
        String pageArananKelime="alisveris";

        if (actualPageSource.contains(arananKelime)){
            System.out.println("Tıtle testi PASS");
        }

        else{
            System.out.println("failed");
        }
        //10. Sayfayi kapatin.
        driver.close();

    }
}
