package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Main extends LoginPage {

    public static void main(String[] args){


         try{
             Thread.sleep(5000);

             LoginPage lp = new LoginPage();
             lp.Login("Applanatest1","Student2020!");

             StartPage sp = new StartPage();
             sp.NewContragent();

             NewContactFace cf = new NewContactFace();
             cf.CreateContactFace("Иванов","Анатолий","Менеджер");


         } catch (Exception e) {
             e.printStackTrace();
         }

    }
    }
