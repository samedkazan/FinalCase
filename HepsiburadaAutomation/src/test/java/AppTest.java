import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import pages.*;

public class AppTest extends BaseTest {

    HomePage homePage;
    LoginPage loginPage;
    SearchPage searchPage;
    ProductPage productPage;
    CartPage cartPage;
    @Test
    @Order(1)
    public void home(){
    homePage = new HomePage(driver);
    homePage.cookies();
    // homePage.loginButton();
    }
    /*@Test
    @Order(2)
    public void login(){
        loginPage = new LoginPage(driver);
        loginPage.login();
        Assertions.assertEquals("Giriş Yapılamadı","Test Test",loginPage.loginVerification());
    }*/

    @Test
    @Order(2)
    public void search_product_one(){
        searchPage = new SearchPage(driver);
        searchPage.searchProductOne();
    }
    @Test
    @Order(3)
    public void product_one(){
        productPage = new ProductPage(driver);
        productPage.selectProductOne();
    }
    @Test
    @Order(4)
    public void search_product_two(){
        searchPage.searchProductTwo();
    }
    @Test
    @Order(5)
    public void product_two(){
        productPage.selectProductTwo();
    }
    @Test
    @Order(6)
    public void go_to_basket(){
        cartPage = new CartPage(driver);
        cartPage.basket();
    }
    @Test
    @Order(7)
    public void first_product_verification(){
        cartPage.productOneName();
        Assertions.assertEquals("Fibaks Apple iPhone 13 Pro Max Uyumlu Kılıf Şeffaf Berrak Kamera Korumalı Renkli Yumuşak", cartPage.productOneName(), "Yanlış Ürün :");
    }
    @Test
    @Order(8)
    public void second_product_verification(){
        cartPage.productTwoName();
        Assertions.assertEquals("Apple iPhone 13 Magsafe Silikon Kılıf – Midnight MM2A3ZM/A", cartPage.productTwoName(), "Yanlış Ürün :");
    }
    @Test
    @Order(9)
    public void different_seller_verification(){
        Assertions.assertNotSame(cartPage.productOneSeller(), cartPage.productTwoSeller(), "Aynı Satıcılar");
    }
}
