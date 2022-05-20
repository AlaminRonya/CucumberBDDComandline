package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLogin {
    private WebDriver driver;
    @FindBy(css = "#content > div > div > header > nav > ul > li.main-nav__sectiondary-login-button > a")
    private WebElement txt_email;
    @FindBy(xpath = "//*[@id='pass']")
    private WebElement txt_password;

    @FindBy(id = "loginbutton")
    private WebElement login;

    public FacebookLogin(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setTxt_email(){
        txt_email.sendKeys("abc@gmail.com");
    }
    public void clickLoginBtn(){
//        login.click();
    }
}
