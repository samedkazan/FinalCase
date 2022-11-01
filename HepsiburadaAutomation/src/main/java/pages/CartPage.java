package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }
    public void basket(){
        click(By.cssSelector("div[class='checkoutui-ProductOnBasketHeader-m4tLG']>button"));
    }
    public String productOneName()
    // Sepette Olan İlk Ürünün Kontrolü İçin Text Yazısını Alıyoruz
    {
        return find(By.partialLinkText("Fibaks Apple iPhone 13 Pro Max Uyumlu Kılıf Şeffaf Berrak Kamera Korumalı Renkli Yumuşak")).getText();
    }
    public String productTwoName()
    // Sepette Olan ikinci Ürünün Kontrolü İçin Text Yazısını Alıyoruz
    {
        return find(By.partialLinkText("Apple iPhone 13 Magsafe Silikon Kılıf – Midnight MM2A3ZM/A")).getText();
    }
    public String productOneSeller()
    // Sepette Olan İlk Ürünün Satıcısının  Kontrolü İçin Text Yazısını Alıyoruz
    {
        return find(By.className("merchantLink_2Ii8s")).getText();
    }
    public String productTwoSeller()
    // Sepette Olan İkinci Ürünün Satıcısının  Kontrolü İçin Text Yazısını Alıyoruz
    {
        return find(By.className("merchantLink_2Ii8s")).getText();
    }
}
