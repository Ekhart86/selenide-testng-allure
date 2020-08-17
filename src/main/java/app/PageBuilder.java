package app;

import app.pages.LoginPage;
import app.pages.SecurePage;

/**
 * Класс для компоновки страниц
 */
public class PageBuilder {

    public static LoginPage buildLoginPage() {
        return new LoginPage("/login");
    }

    public static SecurePage buildSecurePage() {
        return new SecurePage("/secure");
    }
}
