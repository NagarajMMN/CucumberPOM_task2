package StepDefinitions;

import com.pages.CartPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CartPOMsteps {
    WebDriver driver;
    CartPage login = new CartPage(null);

    @Given("user is on the HomePage")
    public void user_is_on_the_home_page() throws InterruptedException {
        System.out.println("Browser is open");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nagar\\Downloads\\Compressed\\chromedriver_win32_2\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(10000);
        login.ClickSignin();
    }

    @When("user enters the user_name and pass_word")
    public void user_enters_the_user_name_and_pass_word() {
        login.Susername("nagarajm8300@gmail.com");
        login.Spassword("Nagaraj767@");
    }

    @When("user click the loginbutton")
    public void user_click_the_loginbutton() {
        login.Login();
    }

    @When("user enters the hompage")
    public void user_enters_the_hompage() {
        login.Home();
    }

    @When("user clicks AddtoCart for any product")
    public void user_clicks_addto_cart_for_any_product() {
        login.setClickcart();
    }

    @When("user gets the price")
    public void user_gets_the_price() {
        login.Price();
    }

    @When("user clicks contiue shoppingg")
    public void user_clicks_contiue_shoppingg() {
        login.Continue();
    }

    @When("user clicks the checkout options")
    public void user_clicks_the_checkout_options() {
        login.ClickCheckout();
        login.Price2();
    }

    @When("user compares the Actuall price and Cart values")
    public void user_compares_the_actuall_price_and_cart_values() {

    }

    @Then("place the order")
    public void place_the_order() {
        login.Oder();
    }

}
