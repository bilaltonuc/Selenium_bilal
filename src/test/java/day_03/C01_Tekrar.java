package day_03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Tekrar {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.navigate().to("https://www.youtube.com");

        String actualTitleYoutube= driver.getTitle();
        String expectedTitleYoutube="youtube";
        if (actualTitleYoutube.equals(expectedTitleYoutube)){

            System.out.println("PASS");

        }else{
            System.out.println("FAİLED"+actualTitleYoutube);
        }
        //3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru URL'yi yazdırın.
        String actualYoutubeUrl= driver.getCurrentUrl();
        String arananKelimeYoutubeUrl="youtube";

        if (actualYoutubeUrl.contains(arananKelimeYoutubeUrl)){
            System.out.println("Yotube URL testi : PASS");
        }else {

            System.out.println("youtube URL testi :FAİLED\n actual url youtbe :"+ actualYoutubeUrl);

        }
        //4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com");
        //5. Youtube sayfasina geri donun
        driver.navigate().back();
        //6. Sayfayi yenileyin
        driver.navigate().refresh();
        //7. Amazon sayfasina donun
        driver.navigate().forward();
        //8. Sayfayi tamsayfa yapin
        driver.manage().window().fullscreen();
        //9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa doğru başlığı(Actual Title) yazdırın.
        String actualAmazonTitle= driver.getTitle();
        String amazonTitleArananKelime="Amazon";

        if (actualAmazonTitle.contains(amazonTitleArananKelime)){
            System.out.println("amazon testi PASS");
        }
        else {
            System.out.println("actual title :"+ actualAmazonTitle);
        }

        //10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru URL'yi yazdırın

        String actualUrlAmazon=driver.getCurrentUrl();
        String expectedUrlAmazon="https://www.amazon.com/";
        if (actualUrlAmazon.equals(expectedUrlAmazon)){
            System.out.println("url PASS");

        }else {
            System.out.println("FAİLED/n  doğrusu:"+ actualUrlAmazon);
        }


       //11.Sayfayi kapatin

        driver.close();


    }

}
