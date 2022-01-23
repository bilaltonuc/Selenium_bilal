package day_03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_LoginTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //    a. http://a.testaddressbook.com adresine gidiniz.
   driver.navigate().to("http://a.testaddressbook.com");
       //    b. Sign in butonuna basin

        WebElement SignInLinki=driver.findElement(By.id("sign-in"));
        SignInLinki.click();
        //    c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement textBox=driver.findElement(By.id("session_email"));
        WebElement passwordBox=driver.findElement(By.id("session_password"));
        WebElement SıngInButonu=driver.findElement(By.name("commit"));

        //    d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        //        i. Username : testtechproed@gmail.com
        //        ii. Password : Test1234!

        textBox.sendKeys("testtechproed@gmail.com");
        passwordBox.sendKeys("Test1234!");

        Thread.sleep(3000);
        SıngInButonu.click();
        //    e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
          WebElement girişYazısı= driver.findElement(By.tagName("h1"));
        System.out.println(girişYazısı.getText());

        String actualGirişYazısı= girişYazısı.getText();
        String expectedGirişYazısı="Welcome to Address Book";
        if (actualGirişYazısı.equals(expectedGirişYazısı)) {

            System.out.println("giriş yazısı testi PASS");
        }else {
            System.out.println("giriş yazısı testi FAİLED");
        }

        //    f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).

       WebElement adressWebElement=driver.findElement(By.linkText("Addresses"));
        WebElement signOutElement=driver.findElement(By.linkText("Sign out"));
        System.out.println(adressWebElement.isDisplayed());
        if (adressWebElement.isDisplayed()){
            System.out.println("görüntüleme testi PASS");
        }else{
            System.out.println("görüntüleme testi FAİLED");
        }

        System.out.println(signOutElement.isDisplayed());
        if (signOutElement.isDisplayed()){
            System.out.println("görüntüleme testi PASS");
        }else{
            System.out.println("görüntüleme testi FAİLED");
        }

        //3. Sayfada kac tane link oldugunu bulun.
        List<WebElement>LinklerListesi=driver.findElements(By.tagName("a"));
        System.out.println("sayfada "+LinklerListesi.size()+" adet link vardır");
        driver.close();
    }
}
