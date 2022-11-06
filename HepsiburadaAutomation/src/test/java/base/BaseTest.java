package base;

import logger.Log;
import logger.TestResultLog;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(TestResultLog.class)
public class BaseTest {
    public WebDriver driver;

    @BeforeAll
    public void setUp() {
        //Sayfayı ayağa kaldırıyoruz.
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--allow-insecure-localhost");
        options.addArguments("--acceptInsecureCerts");
        options.addArguments("--disable-blink-features=AutomationControlled");
        options.addArguments("--disable-extensions");
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.hepsiburada.com/");
        Log.startTestCase("Test için Chrome driver ayarları yapıldı... Test Başlıyor");
        //driver.get("https://www.hepsiburada.com/");
    }

    @AfterAll
    public void tearDown() {
    //Sayfayı kapatıyoruz
        driver.quit();
        Log.endTestCase("Test tamamlandı... Chrome kapatıldı...");
    }
}

