import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static app.AppConfig.VALID_LOGIN;
import static app.AppConfig.VALID_PASSWORD;

@Listeners(ScreenShotOnFailListener.class)

public class LoginTest2 extends BaseTest {

    @Test(description = "Positive login test 2")
    public void positiveLoginTest() {
        app.loginPage.open();
        app.loginPage.login(VALID_LOGIN, VALID_PASSWORD);
        app.securePage.checkLogoutButton();
        app.securePage.checkSuccessMessage();
    }

    @Test(description = "Negative login test 2")
    public void negativeLoginTest() {
        app.loginPage.open();
        app.loginPage.login(VALID_LOGIN, "failed_password");
        app.loginPage.checkErrorMessage("Your password is invalid!");
        app.loginPage.login("failed_user", VALID_PASSWORD);
        app.loginPage.checkErrorMessage("Your username is invalid!");
        app.loginPage.login("", "");
        app.loginPage.checkErrorMessage("Your username is invalid!");
    }
}
