package app;

import app.pages.LoginPage;
import app.pages.SecurePage;

/**
 * Класс в конструкторе которого,
 * создаются все необходимые для выполнения тестов объекты страниц.
 */
public class App {

    public LoginPage loginPage;
    public SecurePage securePage;

    public App() {
        loginPage = PageBuilder.buildLoginPage();
        securePage = PageBuilder.buildSecurePage();
    }
}
