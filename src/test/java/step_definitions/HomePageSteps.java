package step_definitions;

import io.cucumber.java.en.*;
import java.io.IOException;

public class HomePageSteps extends ConfigSteps{

    @Given("Open browser")
    public void open_browser() throws IOException, InterruptedException {
        setUp();
    }
    @And("Type url of the taxrise in search bar")
    public void type_url_of_the_taxrise_in_search_bar() {

    }
    @Then("Press Enter")
    public void press_enter() {
//        driver.navigate().to(url);

    }

}
