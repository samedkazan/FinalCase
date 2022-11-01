package base;

import org.openqa.selenium.*;

import java.util.ArrayList;

public class BasePage {
    WebDriver driver;
    public BasePage(WebDriver driver) {

        this.driver = driver;
    }

    public WebElement find(By locator) {
        //Find için method atıyoruz.
        return driver.findElement(locator);

    }
    public void switchToNextTab() {
        ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tab.get(1));
    }

    public void closeTabAndReturn() {
        driver.close();
        ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tab.get(0));
    }

    public void click(By locator) {
        //click için method atıyoruz.
        find(locator).click();
    }
    public void scrollDown(){
        //Ekranı aşağı kaydıran method atıyoruz.
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,300)","");
    }
    public void scrollUp(){
        //Ekranı yukarı kaydıran method atıyoruz.
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,-300)","");
    }

    public void type(By locator, String text) {
        //sendkeys için method atıyoruz.
        find(locator).sendKeys(text);
    }

    public void typeEnter(By locator,String text){
        //İstenilen alana texti yazdırır ve enter tuşuna basan method atıyoruz.
        find(locator).sendKeys(text, Keys.ENTER);
    }
    public void waitBySeconds(long seconds) {
        //statik bekleme için method atıyoruz.
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
