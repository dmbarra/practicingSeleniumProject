package practicing.config;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import practicing.pages.ComputerPage;
import practicing.pages.SearchPage;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class BaseSetupTest {

    protected WebDriver webDriver;
    protected SearchPage searchPage;
    protected ComputerPage computerPage;

    @Before
    public void setUp() throws MalformedURLException {
        webDriver = new RemoteDriverSelenium().connectBrowserStack();
        webDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        searchPage = PageFactory.initElements(webDriver, SearchPage.class);
        computerPage = PageFactory.initElements(webDriver, ComputerPage.class);
        webDriver.get("http://computer-database.herokuapp.com/computers");
    }

    @After
    public void before() {
        webDriver.close();
        webDriver.quit();
    }

}
