package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;
    private String url;
    @FindBy(css = "#content > div > div > header > nav > ul > li:nth-child(4) > div > a")
    private WebElement btn_signUp;
    @FindBy(css = "#content > div > div > header > nav > ul > li.main-nav__sectiondary-login-button > a")
    private WebElement btn_login;




    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public SingUpPage clickSinUpPage(){
        clickSignUpBtn();
        return new SingUpPage(driver);
    }

    public LoginPage clickLoginPage(){
        clickLoginBtn();
        return new LoginPage(driver);
    }

    public void clickSignUpBtn(){
        btn_signUp.click();
    }

    public void clickLoginBtn(){
        btn_login.click();
    }
}
