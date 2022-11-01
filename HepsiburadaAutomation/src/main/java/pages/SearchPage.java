package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage extends BasePage {
    public SearchPage(WebDriver driver) {
        super(driver);
    }
    public void searchProductOne(){
        // İphone Kılıf Aramasını Başlatır Ve Enter Tuşuna Basar
        typeEnter(By.className("desktopOldAutosuggestTheme-UyU36RyhCTcuRs_sXL9b"),"İphone Kılıf");
        //Bir Saniye Bekler
        waitBySeconds(1);
    }
    public void searchProductTwo(){
        // 1 Saniye Bekler
        waitBySeconds(1);
        // Şefaf Kelimesini Ekler Ve Enter Tuşuna Basar
        typeEnter(By.className("desktopOldAutosuggestTheme-UyU36RyhCTcuRs_sXL9b")," Şeffaf");
    }
}
