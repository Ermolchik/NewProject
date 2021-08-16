package NewProject;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestProject {

 @Test
 @DisplayName("Создание проекта")
 public static void main(String[] args){
 System.setProperty("webdriver.chrome.driver", "E://webdriver/chromedriver.exe");
 WebDriver driver = new ChromeDriver();

 try {
 driver.get("https://crm.geekbrains.space/user/login");

 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 WebDriverWait element = (new WebDriverWait(driver, 20));

 WebElement inputlogin = driver.findElement(By.xpath("//input[@id='prependedInput']"));
 inputlogin.click();
 inputlogin.sendKeys("Applanatest1");

 WebElement inputpassword = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
 inputpassword.click();
 inputpassword.sendKeys("Student2020!");

 WebElement button = driver.findElement(By.xpath("//button[@id='_submit']"));
 button.click();

 WebElement myproject = driver.findElement(By.xpath("//span[text()='Проекты']"));

 Actions actions = new Actions(driver);
 actions.moveToElement(myproject).build().perform();

 WebElement myprojectclick = driver.findElement(By.xpath("//span[text()=\"Мои проекты\"]"));
 myprojectclick.click();

 Thread.sleep(15000);
 WebElement createproject = driver.findElement(By.xpath("//*[text()='Создать проект']"));
 createproject.click();

 Thread.sleep(15000);
 WebElement inputname = driver.findElement(By.xpath("//input[@name='crm_project[name]']"));
 inputname.click();
 inputname.sendKeys("Попытка номер один");

 WebElement newproject = driver.findElement(By.xpath("//span[text()='Укажите организацию']"));
 newproject.click();

 WebElement namefirm = driver.findElement(By.xpath("//div[text()='1234']"));
 Actions project = new Actions(driver);
 project.moveToElement(namefirm).click().build().perform();

 Select project2 = new Select(driver.findElement(By.xpath("//select[@name='crm_project[businessUnit]']")));
 project2.selectByValue("1");

 Select curator = new Select(driver.findElement(By.xpath("//select[@name='crm_project[curator]']")));
 curator.selectByValue("40");

 Select rp = new Select(driver.findElement(By.xpath("//select[@name='crm_project[rp]']")));
 rp.selectByValue("59");

 Select manager = new Select(driver.findElement(By.xpath("//select[@name='crm_project[manager]']")));
 manager.selectByValue("11");

 WebElement contact = driver.findElement(By.xpath("//div[@class='select2-container select2']"));
 contact.click();

 WebElement contactname = driver.findElement(By.xpath("//div[text()='Норина Александра']"));
 Actions contactname2 = new Actions(driver);
 contactname2.moveToElement(contactname).click().build().perform();

 WebElement saveproject = driver.findElement(By.xpath("//*[@id='crm_project-uid-61193b08a7b3d']/div[1]/div/div/div[2]/div[1]/div[3]/button"));
 saveproject.click();

 WebElement nameoprojtest = driver.findElement(By.xpath("//div[text()=\"Попытка номер один\"]"));
 assertEquals(nameoprojtest,"Попытка номер один");

 WebElement nameorgtest = driver.findElement(By.xpath("//*[text()=\"1234\"]"));
 assertEquals(nameorgtest,"1234");

 WebElement namepodrtest = driver.findElement(By.xpath("//div[text()='Research & Development']"));
 assertEquals(namepodrtest, "Research & Development");

 WebElement namecuratortest = driver.findElement(By.xpath("//div[text()='Ким Юрий']"));
 assertEquals(namecuratortest,"Ким Юрий" );

 WebElement namerptest = driver.findElement(By.xpath("//div[text()='Дедова Маргарита']"));
 assertEquals(namerptest,"Дедова Маргарита");

 WebElement namemanagertest = driver.findElement(By.xpath("//div[text()='Исаева Анастасия']"));
 assertEquals(namemanagertest, "Исаева Анастасия");

 WebElement contactnametest = driver.findElement(By.xpath("//div[text()='Норина Александра']"));
 assertEquals(contactnametest, "Норина Александра");

 } catch (Exception e) {
 e.printStackTrace();
 } finally {
 driver.close();
 }
 }
}