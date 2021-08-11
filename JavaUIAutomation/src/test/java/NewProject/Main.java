package NewProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "E://webdriver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://diary.ru/user/login");
    }
}
