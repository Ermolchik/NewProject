package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "C:\\driver browser\\Chrome driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebDriverWait wait = new WebDriverWait(driver, 5);
         try{
             driver.get("https://crm.geekbrains.space/user/login");
             Thread.sleep(5000);

             LoginPage lp = new LoginPage();

             lp.Login("Applanatest1","Student2020!");

         } catch (Exception e) {
             e.printStackTrace();
         }


    }
    }
