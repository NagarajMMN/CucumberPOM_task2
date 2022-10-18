package TestNg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;

public class TradingView {
    ChromeDriver driver;
    @Test
    public void Trade() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        Trading tradee=new Trading(driver);
        driver.get("https://in.tradingview.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        tradee.ClickMarket();
        tradee.ClickStock();
        tradee.ClickQuotes();
        Thread.sleep(10000);
        tradee.ClickToploser();
        System.out.println();
        System.out.println("Strong Buy==================");
        List<WebElement> lbuy = driver.findElements(By.xpath("//div[text()='Strong Buy']//preceding::sup[1]"));
        for (WebElement e : lbuy) {
            System.out.println(e.getText());
        }
        System.out.println();
        System.out.println("Strong BUY==================");
        tradee.ClickMostactive();
        List<WebElement> abuy = driver.findElements(By.xpath("//div[text()='Strong Buy']//preceding::sup[1]"));

        for(WebElement sell1 : abuy) {
            System.out.println(sell1.getText());

        }
        System.out.println();
        System.out.println("matching=======");
        System.out.println(lbuy!=abuy);


	Thread.sleep(10000);
	driver.quit();
    }
}
