package pages;

import base.BasePage;
import logger.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void login(){
        //2 saniye beklemeye alıyoruz
        waitBySeconds(2);
        //Kullanıcı mail adresi girilir
        type(By.id("txtUserName"),"vinam37815@fgvod.com");
        Log.info("Kullanıcı mail yazıldı...");
        //Butona tıklanır
        click(By.id("btnLogin"));
        //Kullanıcı şifresi girilir
        type(By.id("txtPassword"),"TestDeneme1234");
        Log.info("Kullanıcı şifre yazıldı...");
        //Butona tıklanır
        click(By.id("btnEmailSelect"));

    }
    public String successLogInText(){
        //Doğrulama işlemi için hesabım butonunun altında bulunan adı soyadı ekrandan alınır
        String text = find(By.xpath("//span[@class='sf-OldMyAccount-sS_G2sunmDtZl9Tld5PR']")).getText();
        Log.info("Kullanıcı: "+text);
        return text;

    }
}
