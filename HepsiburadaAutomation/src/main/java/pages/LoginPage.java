package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void login(){
        waitBySeconds(2);
        type(By.id("txtUserName"),"vinam37815@fgvod.com");
        click(By.id("btnLogin"));
        type(By.id("txtPassword"),"TestDeneme1234");
        click(By.id("btnEmailSelect"));
    }
    public String loginVerification(){
        return find(By.xpath("//*[@id=\"myAccount\"]/span/a/span[2]")).getText();
    }
}
