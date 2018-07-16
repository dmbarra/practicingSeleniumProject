package practicing.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import practicing.pages.SearchPage;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class BaseSetupTest {

    protected WebDriver driver;
    protected SearchPage searchPage;

    protected String key;
    protected String category;

    @BeforeTest
    public void setUp() throws InterruptedException, MalformedURLException {
        driver = new RemoteDriverSelenium().connectBrowserStack();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        searchPage = PageFactory.initElements(driver, SearchPage.class);
        driver.get("http://computer-database.herokuapp.com/computers");
    }

    @AfterTest
    public void before() {
        driver.close();
        driver.quit();
    }

}
