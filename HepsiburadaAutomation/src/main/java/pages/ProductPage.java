package pages;

import base.BasePage;
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
        // Sonraki Sekmeye Geçer
        switchToNextTab();
        // Bir Saniye Bekler
        waitBySeconds(1);
        // Ekranı Aşağı Kaydırır
        scrollDown();
        // Koyu Lacivert Rengi Seçer
        click(By.xpath("/html/body/div[2]/main/div[3]/section[1]/div[3]/div/div[4]/div[1]/div[4]/div[4]/div/div[3]/label"));
        // Bir Saniye Bekler
        waitBySeconds(1);
        // Ürünü Sepete Ekler
        click(By.xpath("//*[@id=\"addToCart\"]"));
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
        // Sonraki Sekmeye Geçer
        switchToNextTab();
        // Ekranı Aşağı Kaydırır
        scrollDown();
        // Siyah Rengi Seçeneğine Tıklar
        click(By.xpath("/html/body/div[2]/main/div[3]/section[1]/div[3]/div/div[4]/div[1]/div[4]/div[4]/div[1]/div[5]/label"));
        //İphone 13 Pro Max Seçeneğine Tıklar
        click(By.xpath("/html/body/div[2]/main/div[3]/section[1]/div[3]/div/div[4]/div[1]/div[4]/div[4]/div[2]/div[2]/div[5]/label"));
        // 1 Saniye Bekler
        waitBySeconds(1);
        // Ürünü Sepete Ekler
        click(By.xpath("//*[@id=\"addToCart\"]"));
        // Sayfayı Yukarı Kaydırır
        scrollUp();
        // Pop-up İçin 5 Saniye Bekler
        waitBySeconds(5);
    }

}
