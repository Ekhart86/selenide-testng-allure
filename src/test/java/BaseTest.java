import app.App;
import helpers.Driver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;

/**
 * Все тестовые классы наследуются от класса A_BaseTest, в котором создается объект приложения App,
 * логгер, softAssert, открывается и закрывается браузер, очищаются куки после каждого теста.
 */

class BaseTest {

    protected App app;
    protected SoftAssert softAssert;
    protected Logger logger;

    @BeforeClass
    public void setUp() {
        Driver.initDriver();
        app = new App();
        softAssert = new SoftAssert();
        logger = LoggerFactory.getLogger(BaseTest.class);
    }

    @AfterMethod
    public void clearCookies() {
        Driver.clearCookies();
    }

    @AfterClass
    public void tearDown() {
        Driver.close();
    }
}
