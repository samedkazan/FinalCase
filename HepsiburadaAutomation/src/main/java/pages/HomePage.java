package pages;

import base.BasePage;
import logger.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void acceptCookies(){
        // Çerezi Kabul Eder
        click(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
        //Bir saniye bekler
        waitBySeconds(1);
        Log.info("Çerezler kabul edildi");
    }

    public void logInOrSignInButton(){
        //Hesabım Butonuna Tıklar
        hover(By.xpath("//div[@id='myAccount']"));
        //click(By.xpath("//div[@id='myAccount']"));
        Log.info("Hesabım butonuna tıklandı");
        //Bir saniye bekler
        waitBySeconds(1);
        //Giriş Yap Butonuna Tıklar
        click(By.xpath("//a[@id='login']"));
        Log.info("Açılan menüden giriş yap butonuna tıklandı");
    }

}
