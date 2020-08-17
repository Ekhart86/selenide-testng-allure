package app.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends BasePage {

    public SelenideElement loginField = $("#username");
    public SelenideElement passwordField = $("#password");
    public SelenideElement signInButton = $("button.radius");
    public SelenideElement successMessage = $("div.error");

    public LoginPage(String pageUrl) {
        super(pageUrl);
    }

    @Step("Авторизуемся c логином - {0} и паролем - {1} ")
    public void login(String email, String password) {
        loginField.setValue(email);
        passwordField.setValue(password);
        signInButton.click();
    }

    @Step("Тогда выводится сообщение '{0}'")
    public void checkErrorMessage(String message) {
        successMessage.shouldHave(text(message));
    }
}
