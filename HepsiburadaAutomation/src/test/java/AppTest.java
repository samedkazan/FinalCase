import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;
import pages.SearchPage;
import pages.CartPage;


public class AppTest extends BaseTest {

    HomePage homePage;
    LoginPage loginPage;
    SearchPage searchPage;
    ProductPage productPage;
    CartPage cartPage;
    @Test
    @Order(1)
    public void accept_cookies(){
    homePage = new HomePage(driver);
    homePage.acceptCookies();
    }
   /*
   //Login testi yapılmak istenirse yorum satırından çıkarılması gerekir....
   @Test
    @Order(2)
    public void log_in_sign_in_button(){
        homePage.logInOrSignInButton();
        loginPage.login();
        Assertions.assertEquals("Giriş Yapılamadı","Test Test",loginPage.loginVerification());
    }
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
        Assertions.assertEquals("Fibaks Apple iPhone 13 Pro Max Uyumlu Kılıf Şeffaf Berrak Kamera Korumalı Renkli Yumuşak", cartPage.productOneName(), "Yanlış Ürün :");
    }
    @Test
    @Order(8)
    public void second_product_verification(){
        Assertions.assertEquals("Apple iPhone 13 Magsafe Silikon Kılıf – Abyss Blue MM293ZM/A", cartPage.productTwoName(), "Yanlış Ürün :");
    }
    @Test
    @Order(9)
    public void different_seller_verification(){
        Assertions.assertNotSame(cartPage.productOneSeller(), cartPage.productTwoSeller(), "Aynı Satıcılar");
    }
}
