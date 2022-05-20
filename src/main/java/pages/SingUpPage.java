package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SingUpPage {
    private WebDriver driver;

    @FindBy(name = "email")
    private WebElement txt_email;
    @FindBy(name = "realName")
    private WebElement txt_fullName;
    @FindBy(name = "password")
    private WebElement txt_password;
    @FindBy(css = "#content > div > div > div.modal-overlay > section > div.eyhuarf17.css-hdb914.e1bh8es30 > div > div.e1nhs9m40.css-19w953.eyhuarf7 > form > button")
    private WebElement btn_continue;
    @FindBy(className = "facebook-icon")
    private WebElement btn_fb;


    public SingUpPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void userEmail(String email){
        txt_email.sendKeys(email);
    }
    public void username(String name){
        txt_fullName.sendKeys(name);
    }
    public void userPassword(String password){
        txt_password.sendKeys(password);
    }

    public void clickContinueBtn() throws InterruptedException {
        Thread.sleep(2000);
        btn_continue.click();
    }
    public void clickFbBtn() throws InterruptedException {
        Thread.sleep(2000);
        btn_fb.click();
    }


}
