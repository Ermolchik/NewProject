package Page;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.PageFactory;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NewProjectCreate extends Main {
    WebDriver driver;

    @FindBy(xpath = "//input[@name='crm_project[name]']")
    private WebElement inputname;

    @FindBy(xpath = "//span[text()='Укажите организацию']")
    private WebElement newproject;

    @FindBy(xpath = "//div[text()='1234']")
    private WebElement namefirm;

    Actions project = new Actions(driver);
    Select project2 = new Select(driver.findElement(By.xpath("//select[@name='crm_project[businessUnit]']")));
    Select curator = new Select(driver.findElement(By.xpath("//select[@name='crm_project[curator]']")));
    Select rp = new Select(driver.findElement(By.xpath("//select[@name='crm_project[rp]']")));
    Select manager = new Select(driver.findElement(By.xpath("//select[@name='crm_project[manager]']")));

    @FindBy(xpath = "//div[@class='select2-container select2']")
    private WebElement contact;

    @FindBy(xpath = "//div[text()='Норина Александра']")
    private WebElement contactname;
    Actions contactname2 = new Actions(driver);

    @FindBy(xpath = "//*[@id='crm_project-uid-61193b08a7b3d']/div[1]/div/div/div[2]/div[1]/div[3]/button")
    private WebElement saveproject;

    @FindBy(xpath = "//div[text()=\"Попытка номер один\"]")
    private WebElement nameoprojtest;

    @FindBy(xpath = "//*[text()=\"1234\"]")
    private WebElement nameorgtest;

    @FindBy(xpath = "//div[text()='Research & Development']")
    private WebElement namepodrtest;

    @FindBy(xpath = "//div[text()='Ким Юрий']")
    private WebElement namecuratortest;

    @FindBy(xpath = "//div[text()='Дедова Маргарита']")
    private WebElement namerptest;

    @FindBy(xpath = "//div[text()='Исаева Анастасия']")
    private WebElement namemanagertest;

    @FindBy(xpath = "//div[text()='Норина Александра']")
    private WebElement contactnametest;

    public void NewProjectCreate(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @Test
    @DisplayName("Создание нового проекта")
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
        assertEquals(nameoprojtest,"Попытка номер один");
        assertEquals(nameorgtest,"1234");
        assertEquals(namepodrtest, "Research & Development");
        assertEquals(namecuratortest,"Ким Юрий" );
        assertEquals(namerptest,"Дедова Маргарита");
        assertEquals(namemanagertest, "Исаева Анастасия");
        assertEquals(contactnametest, "Норина Александра");

    }
}
