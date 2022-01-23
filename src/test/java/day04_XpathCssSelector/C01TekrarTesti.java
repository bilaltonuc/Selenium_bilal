package day04_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01TekrarTesti {

    //1. Bir class oluşturun : AmazonSearchTest
    //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
    //    a.google web sayfasına gidin. https://www. amazon.com/
    //
    //    c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın



    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");
        WebElement aramaButonu=driver.findElement(By.id("twotabsearchtextbox"));
        //b. Search(ara) “city bike”
        aramaButonu.sendKeys("city bike"+ Keys.ENTER);
        //aramaButonu.submit();
        //c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırınw
        WebElement sonucYazısıElement=driver.findElement(By.className("sg-col-inner"));
        System.out.println(sonucYazısıElement.getText());

        //    e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.

      //WebElement resim= driver.findElement(By.className("s-image"));
    //  resim.click();

      driver.findElement(By.className("sg-col-inner")).click();
        driver.findElement(By.xpath("nav-logo-sprites"));
    }

}
