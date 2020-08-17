package app.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class SecurePage extends BasePage {

    public SelenideElement logoutButton = $("i.icon-signout");
    public SelenideElement successMessage = $("div.success");

    public SecurePage(String pageUrl) {
        super(pageUrl);
    }

    @Step("Кнопка выхода присутствует")
    public void checkLogoutButton() {
        logoutButton.shouldBe(Condition.visible, Condition.enabled);
    }

    @Step("Текст об успешной авторизации присутствует")
    public void checkSuccessMessage() {
        successMessage.shouldHave(text("You logged into a secure area!"));
    }


}
