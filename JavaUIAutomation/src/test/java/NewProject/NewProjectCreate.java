package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class NewProjectCreate {
    WebDriver driver = new ChromeDriver();
    WebElement inputname = driver.findElement(By.xpath("//input[@name='crm_project[name]']"));
    WebElement newproject = driver.findElement(By.xpath("//span[text()='Укажите организацию']"));
    WebElement namefirm = driver.findElement(By.xpath("//div[text()='1234']"));
    Actions project = new Actions(driver);
    Select project2 = new Select(driver.findElement(By.xpath("//select[@name='crm_project[businessUnit]']")));
    Select curator = new Select(driver.findElement(By.xpath("//select[@name='crm_project[curator]']")));
    Select rp = new Select(driver.findElement(By.xpath("//select[@name='crm_project[rp]']")));
    Select manager = new Select(driver.findElement(By.xpath("//select[@name='crm_project[manager]']")));
    WebElement contact = driver.findElement(By.xpath("//div[@class='select2-container select2']"));
    WebElement contactname = driver.findElement(By.xpath("//div[text()='Норина Александра']"));
    Actions contactname2 = new Actions(driver);
    WebElement saveproject = driver.findElement(By.xpath("//*[@id='crm_project-uid-61193b08a7b3d']/div[1]/div/div/div[2]/div[1]/div[3]/button"));

    public void CreateProject(String namenewproject){
        inputname.click();
        inputname.sendKeys(namenewproject);
        newproject.click();
        project.moveToElement(namefirm).click().build().perform();
        project2.selectByValue("1");
        curator.selectByValue("40");
        rp.selectByValue("59");
        manager.selectByValue("11");
        contact.click();
        contactname2.moveToElement(contactname).click().build().perform();
        saveproject.click();
    }
}
