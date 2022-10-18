package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    WebDriver driver;
    @FindBy(how= How.XPATH, using="//a[@href='http://automationpractice.com/index.php?controller=my-account']")
    static
    WebElement Signin;
    @FindBy(how=How.ID, using="email")
    static
    WebElement Uname;
    @FindBy(how = How.ID, using="passwd")
    static
    WebElement Password;
    @FindBy(how=How.ID, using="SubmitLogin")
    static
    WebElement Loginbutton;
    @FindBy(how=How.XPATH, using="//span[text()=' Home']")
    static
    WebElement Homebutton;
    @FindBy(how=How.XPATH, using="//a[@href='http://automationpractice.com/index.php?id_product=4&controller=product']")
    WebElement Clickproduct;
    @FindBy(how=How.XPATH, using="/html/body/div/div/div[3]/form/div/div[3]/div/p/button")
    static
    WebElement Clickcart;
    @FindBy(how=How.XPATH, using="//span[@id='layer_cart_product_price']")
    static
    WebElement Pricetext;
    @FindBy(how=How.XPATH, using ="//span[@class='continue btn btn-default button exclusive-medium']")
    static
    WebElement ClickContinue;
    @FindBy(how=How.XPATH, using = "//a[@href='http://automationpractice.com/index.php?controller=order']")
    static
    WebElement Checkout;
    @FindBy(how=How.XPATH, using="//span[@id='total_price']")
    static
    WebElement ActPrice;
    @FindBy(how=How.XPATH, using="(//span)[61]")
    static
    WebElement PlaceOrder;

    public CartPage(WebDriver d){
        PageFactory.initElements(d, this);
    }
    public void ClickSignin(){
        Signin.click();
    }
    public void Susername(String UN){
        Uname.sendKeys(UN);
    }
    public void Spassword(String PD){
        Password.sendKeys(PD);
    }
    public void Login(){
        Loginbutton.click();
    }
    public void Home(){
        Homebutton.click();
    }

    public void setClickcart() {
        Clickcart.click();
    }
    public void Price(){
        Pricetext.getText();
    }
    public void Continue(){
        ClickContinue.click();
    }
    public void ClickCheckout(){
        Checkout.click();
    }
    public void Price2(){
        ActPrice.getText();
    }
    public void Oder(){
        PlaceOrder.click();
    }
}
