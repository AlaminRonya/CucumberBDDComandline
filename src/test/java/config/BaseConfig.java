package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseConfig {

    private WebDriver driver;
    private String url;


    public WebDriver getDriver() throws IOException {
        if (driver == null){
            webDriverManager();
        }
        return driver;
    }

    public String getUrl() {
        if (url == null){
            new IllegalStateException("Url is empty!");
        }
        return url;
    }

    private void webDriverManager() throws IOException {
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/global.properties");
        Properties prop = new Properties();
        prop.load(fis);

        url = prop.getProperty("QAUrl");
        String browser_properties = prop.getProperty("browser");
        String browser_maven = System.getProperty("browser");
        String browser = browser_maven != null ? browser_maven : browser_properties;

        if (driver == null){
            if (browser.equalsIgnoreCase("chrome")){

                System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/resources/chromedriver.exe");
                driver = new ChromeDriver();
            }

            if(browser.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/src/main/resources/geckodriver/chromedriver.exe");
                driver = new FirefoxDriver();
            }
            assert driver != null;
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.manage().window().maximize();
        }

    }

}
