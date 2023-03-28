package sayfalar;

import org.openqa.selenium.WebDriver;

public class Anasayfa extends Sayfa {
    public final String hesabim = "myAccount";
    public final String girisyap = "login";

    public Anasayfa(WebDriver driver) {
        super(driver);
    }
}
