package app.pages;

import allure.AllureStep;
import app.AppConfig;
import com.codeborne.selenide.Selenide;
import helpers.Trim;
import io.qameta.allure.Step;

import static allure.AllureStep.showStep;

/**
 * Все страницы наследуются от базового класса BasePage.
 * В конструктор page object'а передается относительный url страницы.
 * Все элементы страницы имеют модификатор доступа public.
 */
public abstract class BasePage {

    protected String pageUrl;

    public BasePage(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    @Step("Открываем страницу:")
    public void open() {
        String url = Trim.rightTrimSymbol(AppConfig.BASE_URL, "/") + "/" + Trim.leftTrimSymbol(pageUrl, "/");
        AllureStep.showStep(url);
        Selenide.open(url);
    }
}
