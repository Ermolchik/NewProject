package Page;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;

public class LoginPage extends Main{

     WebDriver driver;

    @FindBy(id = "prependedInput")
    private WebElement inputlog;

    @FindBy(id = "prependedInput2")
    private WebElement inputpas;

    @FindBy(xpath = "//button[@id='_submit']")
    private WebElement button;

    public LoginPage (WebDriver driver){
     this.driver = driver;
     PageFactory.initElements(driver,this);
    }

    @Test
    @DisplayName("Авторизация")
    public void Login(String login, String pass){
       try {

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://crm.geekbrains.space/user/login");
        inputlog.click();
        inputlog.sendKeys(login);
        inputpas.click();
        inputpas.sendKeys(pass);
        button.click();

       }


       catch (Exception e) {
           e.printStackTrace();
       }
       }
}
