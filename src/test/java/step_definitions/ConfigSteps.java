package step_definitions;

import config.BaseConfig;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import pages.HomePage;

import java.io.IOException;

public class ConfigSteps {
    protected BaseConfig baseConfig;
    protected HomePage homePage;
    protected WebDriver driver;
    protected String url;


    public void setUp() throws IOException, InterruptedException {
        this.baseConfig = new BaseConfig();
        this.driver = baseConfig.getDriver();
        homePage = new HomePage(driver);
        this.url = baseConfig.getUrl();
        driver.navigate().to(url);
    }

    @AfterClass
    public void teardown() throws InterruptedException, IOException {
        Thread.sleep(1000);
        driver.close();
        driver.quit();
    }
}
