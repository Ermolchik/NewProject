package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginPage{
      
    
    WebDriver driver = new ChromeDriver();

    WebElement inputlog = driver.findElement(By.id("prependedInput"));
    WebElement inputpas = driver.findElement(By.id("prependedInput2"));
    WebElement button = driver.findElement(By.xpath("//button[@id='_submit']"));

    public void Login(String login,String pass){
       try {
           System.setProperty("webdriver.chrome.driver", "C:\\driver browser\\Chrome driver\\chromedriver.exe");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://crm.geekbrains.space/user/login");
        inputlog.click();
        inputlog.sendKeys(login);
        inputpas.click();
        inputpas.sendKeys(pass);
        button.click();} 
       catch (Exception e) {
           e.printStackTrace();
       }
    }}
