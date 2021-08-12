package NewProject;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class Main {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "E://webdriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

       try {
           driver.get("https://crm.geekbrains.space/user/login");

           driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
           WebDriverWait element = (new WebDriverWait(driver, 20));

           WebElement inputlogin = driver.findElement(By.xpath("//input[@id='prependedInput']"));
           inputlogin.click();
           inputlogin.sendKeys("Applanatest1");

           WebElement inputpassword = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
           inputpassword.click();
           inputpassword.sendKeys("Student2020!");

           WebElement button = driver.findElement(By.xpath("//button[@id='_submit']"));
           button.click();

           //new WebDriverWait(driver,15);

           //WebElement myproject = driver.findElement(By.cssSelector("div.dropdown:nth-child(3) .single:nth-child(4) .title"));
           //myproject.click();

       } catch (Exception e) {
           e.printStackTrace();
       }


    }
    }
//    ("//div[@class=’recaptcha-checkbox-border’]")

