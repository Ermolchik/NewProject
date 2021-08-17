package Page;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NewContactFace extends Main {
      WebDriver driver;

      @FindBy(xpath = "//input[@name='crm_contact[lastName]']")
      private WebElement inpitlastname;

      @FindBy(xpath = "//input[@name='crm_contact[firstName]']")
      private WebElement inputfirstname;

      @FindBy(xpath = "//span[text()='Укажите организацию']")
      private WebElement namefirm ;

      @FindBy(xpath = "//div[text()='1234']")
      private WebElement namefirm2;
      Actions usenamefirm = new Actions(driver);

      @FindBy(xpath = "//input[@name='crm_contact[jobTitle]']")
      private WebElement inputposition;

      @FindBy(xpath = "//*[@id='crm_contact-uid-611a3b08de985']//div[3]/button")
      private WebElement saveandclose;

      @FindBy(xpath = "//*[text()='Иванов']")
      private WebElement lastnametest;

      @FindBy(xpath = "//*[text()='Анатолий']")
      private WebElement firstnametest;

      @FindBy(xpath = "//*[text()='1234']")
      private WebElement nameorgtest;

      @FindBy(xpath = "//*[text()='Менеджер']" )
      private WebElement nameopositiontest;

      public void NewContactFace(WebDriver driver){
          this.driver = driver;
          PageFactory.initElements(driver,this);
      }
      @Test
      @DisplayName("Создание нового контактного лица")
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
        assertEquals(lastnametest,"Иванов");
        assertEquals(firstnametest,"Анатолий");
        assertEquals(nameorgtest,"1234");
        assertEquals(nameopositiontest,"Менеджер");
    }
}
