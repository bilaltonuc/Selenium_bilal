package day_02;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C07_ManageWindowSet {

    //1. Yeni bir Class olusturalim.C07_ManageWindowSet
    //2. Amazon soyfasina gidelim. https://www.amazon.com/



    //8. Sayfayi kapatin
    //Collapse
    //
    //
    //
    //white_check_mark
    //eyes
    //raised_hands
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com");
        //3. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());
        //4. Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin

        driver.manage().window().setPosition(new Point(0,0));
        driver.manage().window().setSize(new Dimension(300,500));

        int xKordinat=driver.manage().window().getPosition().getX();
        int yKordinat=driver.manage().window().getPosition().getY();
        int genislik=driver.manage().window().getSize().getWidth();
        int yukseklık=driver.manage().window().getSize().getHeight();

        if (xKordinat==0 && yKordinat==0 && genislik==300 && yukseklık==500){

            System.out.println("olceklendrıme test PASS");
        }else {
            System.out.println("olceklendırme testı FAİLED");

        }
        //5. Sayfanin sizin istediginiz konum ve boyuta geldigini test edin


driver.close();

    }
}
