package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main{

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\driver browser\\Chrome driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
         try{
             Thread.sleep(5000);

             LoginPage lp = new LoginPage(driver);
             lp.Login("Applanatest1","Student2020!");

             StartPage sp = new StartPage(driver);
             sp.NewContragent();
             sp.NewProject();
             NewContactFace cf = new NewContactFace();
             cf.CreateContactFace("Иванов","Анатолий","Менеджер");

         } catch (Exception e) {
             e.printStackTrace();
         }

    }
}

