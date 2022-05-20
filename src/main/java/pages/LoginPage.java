package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;
    @FindBy(className = "facebook-icon")
    private WebElement btn_facebook;
    @FindBy(id = "u_0_0_Cr")
    private WebElement btn_fb_login;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public FacebookLogin clickFacebook(){
        btn_facebook.click();
        return new FacebookLogin(driver);
    }







}
