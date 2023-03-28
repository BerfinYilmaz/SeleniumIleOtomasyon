package testler;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sayfalar.Anasayfa;
import sayfalar.GirisYapSayfasi;

import java.time.Duration;

public class LoginTests {

    private WebDriver driver;
    private Anasayfa anasayfa;
    private GirisYapSayfasi girisYapSayfasi;
    @BeforeEach
    void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        anasayfa = new Anasayfa(driver);
        girisYapSayfasi = new GirisYapSayfasi(driver);
    }
    @Test
    void hepsiburadaLoginTesti() throws InterruptedException{
        driver.get("http://www.hepsiburada.com");

        anasayfa.elementGozukeneKadarBekle(anasayfa.hesabim);
        anasayfa.tusaBas(anasayfa.hesabim);
        anasayfa.elementGozukeneKadarBekle(anasayfa.girisyap);
        Thread.sleep(3000);
        anasayfa.tusaBas(anasayfa.girisyap);

        girisYapSayfasi.elementGozukeneKadarBekle(girisYapSayfasi.emailAdresi);
        girisYapSayfasi.alanaYaziYaz(girisYapSayfasi.emailAdresi, "seleniumOtomasyonu@gmail.com");
        girisYapSayfasi.elementGozukeneKadarBekle(girisYapSayfasi.girisYapTusu);
        girisYapSayfasi.tusaBas(girisYapSayfasi.girisYapTusu);
    }
    @AfterEach
    void tearDown(){
        driver.close();
    }

}
