package pages;

import base.BasePage;
import logger.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }
    public void basket(){
        //Sepete Gider
        click(By.xpath("//button[normalize-space()='Sepete git']"));
        Log.info("Sepete Gidildi");
    }
    public String productOneName()
    // Sepette Olan İlk Ürünün Kontrolü İçin Text Yazısını Alıyoruz
    {
       String text= find(By.xpath("//a[contains(text(),'Fibaks Apple iPhone 13 Pro Max Uyumlu Kılıf Şeffaf')]")).getText();
        Log.info("İlk Ürün adı: "+text);
        return text;
    }
    public String productTwoName()
    // Sepette Olan ikinci Ürünün Kontrolü İçin Text Yazısını Alıyoruz
    {
        String text = find(By.xpath("//a[contains(text(),'Apple iPhone 13 Magsafe Silikon Kılıf – Midnight M')]")).getText();
        Log.info("İkinci ürün adı: "+text);
        return text;
    }
    public String productOneSeller()
    // Sepette Olan İlk Ürünün Satıcısının  Kontrolü İçin Text Yazısını Alıyoruz
    {
        String text = find(By.xpath("//a[normalize-space()='fiberaksesuar']")).getText();
        Log.info("İlk Ürün Satıcısı Adı: "+text);
        return text;
    }
    public String productTwoSeller()
    // Sepette Olan İkinci Ürünün Satıcısının  Kontrolü İçin Text Yazısını Alıyoruz
    {

        String text = find(By.xpath("//a[normalize-space()='hepsiburada']")).getText();
        Log.info("İkinci Ürün Satıcısı Adı: "+text);
        return text;
    }


}
