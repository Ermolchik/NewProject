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

        driver.get("https://diary.ru/user/login");

        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        WebDriverWait element = (new WebDriverWait(driver,20));

        WebElement inputlogin = driver.findElement(By.name("LoginForm[username]"));
        inputlogin.click();
        inputlogin.sendKeys("franfrukt");

        WebElement inputpassword = driver.findElement(By.name("LoginForm[password]"));
        inputpassword.click();
        inputpassword.sendKeys("qwerty");

        WebElement captcha = driver.findElement(By.id("id=recaptcha-anchor-label"));
        captcha.click();

        WebElement button = driver.findElement(By.name("login-button"));
        button.click();

    }
}

