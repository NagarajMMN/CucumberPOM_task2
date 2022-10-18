package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Trading {
    WebDriver driver;
    @FindBy(how= How.XPATH, using="//DIV[@role='button'][text()='Markets']")
    WebElement Market;
    @FindBy(how=How.XPATH, using="//SPAN[@class='menuItemHeader-ml2L5a_a'][text()='Stocks']")
    WebElement Stocks;
    @FindBy(how=How.XPATH, using="//A[@href='/markets/stocks-india/market-movers-all-stocks/']")
    WebElement Quotes;
    @FindBy(how=How.XPATH, using="//div[text()='Biggest losers']")
    WebElement Toploser;
    @FindBy(how=How.XPATH, using="//div[text()='Most active']")
    WebElement MostActive;
    @FindBy(how=How.XPATH, using="//div[text()='Strong Buy']//preceding::sup[1]")
    WebElement BuyActive;
    @FindBy(how=How.XPATH, using="//div[text()='Strong Buy']//preceding::sup[1]")
    WebDriver BuyLoser;

    Trading(WebDriver d){
        driver = d;
        PageFactory.initElements(d, this);
    }

    public void ClickQuotes() {
        Quotes.click();
    }
    public void ClickMarket() {
        Market.click();
    }
    public void ClickStock() {
        Stocks.click();
    }
    public void ClickToploser () {
        Toploser.click();
    }
    public void ClickMostactive() {
        MostActive.click();
    }

}
