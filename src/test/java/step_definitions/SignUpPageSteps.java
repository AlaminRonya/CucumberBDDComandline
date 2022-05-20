package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HomePage;
import pages.SingUpPage;

import java.io.IOException;

public class SignUpPageSteps extends ConfigSteps{
    private SingUpPage singUpPage;
    private HomePage page;



    @Given("Click on Sign up")
    public void clickOnSignUp() throws IOException, InterruptedException {
        setUp();
        singUpPage = homePage.clickSinUpPage();

    }

    @And("^Fill up (.*) id, Full (.*), (.*)$")
    public void fillUpEmailIdFullNamePassword(String email, String name, String password) {
        singUpPage.userEmail(email);
        singUpPage.username(name);
        singUpPage.userPassword(password);
    }


    @Then("Click Continue")
    public void clickContinue() throws InterruptedException {
        singUpPage.clickContinueBtn();
    }

    @Then("Click fb")
    public void clickFb() throws InterruptedException {
        singUpPage.clickFbBtn();
    }
}
