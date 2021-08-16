package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class StartPage {

    WebDriver driver = new ChromeDriver();

    WebElement ca = driver.findElement(By.xpath("//span[text()='Контрагенты']"));
    Actions actions = new Actions(driver);

    WebElement contactface = driver.findElement(By.xpath("//span[text()='Контактные лица']"));
    WebElement createca = driver.findElement(By.xpath("//*[text()='Создать контактное лицо']"));

    WebElement myproject = driver.findElement(By.xpath("//span[text()='Проекты']"));
    Actions actionsproj = new Actions(driver);
    WebElement myprojectclick = driver.findElement(By.xpath("//span[text()=\"Мои проекты\"]"));
    WebElement createproject = driver.findElement(By.xpath("//*[text()='Создать проект']"));

    public void NewContragent(){
       try {
           actions.moveToElement(ca).build().perform();
           contactface.click();
           createca.click();
           Thread.sleep(5000);

       }
       catch (InterruptedException e) {
           e.printStackTrace();
       }
    }

    public void NewProject(){
        try{
            actionsproj.moveToElement(myproject).build().perform();
            myprojectclick.click();
            Thread.sleep(5000);
            createproject.click();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
