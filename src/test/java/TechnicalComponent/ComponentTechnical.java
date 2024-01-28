package TechnicalComponent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ComponentTechnical {
    public WebDriver driver;
 @FindBy(xpath="//button[@id='convertBtn']")
 public WebElement Convert_button;

 @FindBy(xpath="//p[@id='errorMsg']")
 public WebElement Error;

 @FindBy(xpath="//input[@id='inputHours']")
 public WebElement Input_hour;

 @FindBy(xpath="//p[@id='errorMsg']")
 public WebElement Error_Message;

 @FindBy(xpath="//input[@id='inputMinutes']")
 public WebElement Input_minutes;

 @FindBy(xpath="//p[@id='timeInSeconds']")
 public WebElement Convert_text;
    public ComponentTechnical(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void verify_convertBtn(){
        Convert_button.click();
    }
    public void Verify_Error_message(){
        String str1=Error.getText();
        String str2="Please enter a valid number of hours.";
        Assert.assertEquals(str1,str2,"Text is mismatch");
    }
    public void Verify_enter_hour(){
        Input_hour.sendKeys("2");
    }
    public void Verify_Message_Error(){
        String str1=Error_Message.getText();
        String str2="Please enter a valid number of minutes.";
        Assert.assertEquals(str1,str2,"Text is Mismatch");
    }
    public void Verify_Hours_input(){
        Input_hour.sendKeys("2");
    }
    public void Verify_minutes_input(){
        Input_minutes.sendKeys("30");
    }
    public void Verify_Text(){
       String str1=Input_minutes.getText();
       String str2="9000s";
       Assert.assertEquals(str1,str2,"Text is Mismatched");
    }
}
