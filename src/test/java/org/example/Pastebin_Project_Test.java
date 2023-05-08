package org.example;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Pastebin_Project_Test extends TestBase {
    @Test
    public void loginverification() throws InterruptedException {

        page.openpastebinlink();
        Thread.sleep(2000);
        page.NewPaste();
        Thread.sleep(2000);
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0,700)", "");
        Thread.sleep(2000);
        page.paste_Expiration();
        Thread.sleep(2000);

        page.expireTime();
        Thread.sleep(2000);

        page.pasteName();
        Thread.sleep(2000);

        page.Submit();
        Thread.sleep(2000);

    }

}

