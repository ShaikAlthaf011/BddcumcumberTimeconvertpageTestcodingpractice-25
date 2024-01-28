package StepDefinitions;
import TechnicalComponent.ComponentTechnical;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class LoginPageTest {
  public WebDriver driver;
  ComponentTechnical componentTechnical;
  @BeforeMethod
    public void Enviornment(){
      System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
  }

  @Given("Navigate to Time Convert Page Test")
  public void navigate_to_time_convert_page_test() {
    driver=new ChromeDriver();
    driver.navigate().to("https://qatimeconverter.ccbp.tech/");
    driver.manage().window().maximize();
    componentTechnical=new ComponentTechnical(driver);
  }

  @When("Verify the convert second button")
  public void Verify_the_convert_second_button() {
  componentTechnical.verify_convertBtn();
  }

  @Then("Verify the Expected String")
  public void verify_the_expected_string() {
  componentTechnical.Verify_Error_message();
  }

  @Then("Close the browser")
  public void close_the_browser() {
  driver.quit();
  }

  @When("Verify the Enter Hour Input Field")
  public void verify_the_enter_hour_input_field() {
  componentTechnical.Verify_enter_hour();
  }
  @Then("Verify The Error message expected Text")
  public void verify_the_error_message_expected_text() {
  componentTechnical.Verify_Message_Error();
  }
  @When("Verify Enter the Hours")
  public void verify_enter_the_hours() {
  componentTechnical.Verify_Hours_input();
  }

  @Then("Verify Enter the Minutes")
  public void verify_enter_the_minutes() {
  componentTechnical.Verify_minutes_input();
  }
  @Then("Verify Get the get Text Message")
  public void verify_get_the_get_text_message() {
  componentTechnical.Verify_Text();
  }
}
