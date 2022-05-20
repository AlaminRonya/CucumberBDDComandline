package step_definitions;

import io.cucumber.java.en.*;
import pages.FacebookLogin;
import pages.LoginPage;

import java.io.IOException;

public class LoginPageSteps extends ConfigSteps{
    private LoginPage loginPage;
    private FacebookLogin facebookLogin;

    @Given("Click on Login")
    public void click_on_login() throws IOException, InterruptedException {
        setUp();
        loginPage = homePage.clickLoginPage();
    }
    @And("Click on Facebook")
    public void click_on_facebook() {
        facebookLogin = loginPage.clickFacebook();
        facebookLogin.setTxt_email();

    }
    @Then("Click Continue as")
    public void click_continue_as() throws InterruptedException {
        Thread.sleep(2000);
        facebookLogin.clickLoginBtn();

    }

}
