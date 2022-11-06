package pages;

import base.BasePage;
import logger.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void selectProductOne(){
        // Ekranı Aşağı Kaydırır
        scrollDown();
        // Ürünü Seçer
        click(By.partialLinkText("Apple iPhone 13 Magsafe Silikon Kılıf – (Product)Red MM2C3ZM/A"));
        Log.info("Ürün Seçildi");
        // Sonraki Sekmeye Geçer
        switchToNextTab();
        // Bir Saniye Bekler
        waitBySeconds(1);
        // Ekranı Aşağı Kaydırır
        scrollDown();
        // Koyu Lacivert Rengi Seçer
        click(By.xpath("//label[@for='Renk2']"));
        Log.info("Koyu Lacivert Renk Seçildi");
        // Bir Saniye Bekler
        waitBySeconds(1);
        // Ürünü Sepete Ekler
        click(By.xpath("//button[@id='addToCart']"));
        Log.info("Ürün Sepete Eklendi");
        // Ürün Eklendikten Sonra 5 Saniye Bekler
        waitBySeconds(5);
        // Önceki Sekmeye Geri Döner
        closeTabAndReturn();
    }


    public void selectProductTwo(){
        // Ekranı Aşağı Kaydırır
        scrollDown();
        // Ürünü Seçer
        click(By.partialLinkText("Fibaks Apple iPhone 13 Uyumlu Kılıf Şeffaf Berrak Kamera Korumalı Renkli Yumuşak"));
        Log.info("Ürün Sepete Eklendi");
        // Sonraki Sekmeye Geçer
        switchToNextTab();
        // Ekranı Aşağı Kaydırır
        scrollDown();
        // Siyah Rengi Seçeneğine Tıklar
        click(By.xpath("//label[@for='Renk4']"));
        Log.info("Siyah Renk Seçildi");
        //İphone 13 Pro Max Seçeneğine Tıklar
        click(By.xpath("//label[@for='Se&#231;enek4']"));
        Log.info("Cihaz Türü Seçildi");
        // 1 Saniye Bekler
        waitBySeconds(1);
        // Ürünü Sepete Ekler
        click(By.xpath("//button[@id='addToCart']"));
        Log.info("Ürün Sepete Eklendi");
        // Pop-up İçin 5 Saniye Bekler
        waitBySeconds(5);


    }

}
