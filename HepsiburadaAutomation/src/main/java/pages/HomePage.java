package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void cookies(){
        // Çerezi Kabul Eder
        click(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]"));
        waitBySeconds(1);
    }

    public void loginButton(){
        //Hesabım Butonuna Tıklar
        click(By.xpath("//*[@id=\"myAccount\"]"));
        waitBySeconds(1);
        //Giriş Yap Butonuna Tıklar
        click(By.xpath("//*[@id=\"login\"]"));
    }

}
