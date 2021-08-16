package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NewContactFace {
    WebDriver driver = new ChromeDriver();

    WebElement inpitlastname = driver.findElement(By.xpath("//input[@name='crm_contact[lastName]']"));
    WebElement inputfirstname = driver.findElement(By.xpath("//input[@name='crm_contact[firstName]']"));
    WebElement namefirm = driver.findElement(By.xpath("//span[text()='Укажите организацию']"));
    WebElement namefirm2 = driver.findElement(By.xpath("//div[text()='1234']"));
    Actions usenamefirm = new Actions(driver);
    WebElement inputposition = driver.findElement(By.xpath("//input[@name='crm_contact[jobTitle]']"));
    WebElement saveandclose = driver.findElement(By.xpath("//*[@id='crm_contact-uid-611a3b08de985']//div[3]/button"));

    public void CreateContactFace(String lastname, String firstname, String position){
        inpitlastname.click();
        inpitlastname.sendKeys(lastname);
        inputfirstname.click();
        inputfirstname.sendKeys(firstname);
        namefirm.click();
        usenamefirm.moveToElement(namefirm2).click().build().perform();
        inputposition.click();
        inputposition.sendKeys(position);
        saveandclose.click();
    }
}
