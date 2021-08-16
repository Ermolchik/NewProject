package Page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

    WebDriver driver = new ChromeDriver();

    WebElement inputlogin = driver.findElement(By.xpath("//input[@id='prependedInput']"));
    WebElement inputpassword = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
    WebElement button = driver.findElement(By.xpath("//button[@id='_submit']"));

    public void Login(String login,String password){
        inputlogin.click();
        inputlogin.sendKeys(login);
        inputpassword.click();
        inputpassword.sendKeys(password);
        button.click();
    }}
