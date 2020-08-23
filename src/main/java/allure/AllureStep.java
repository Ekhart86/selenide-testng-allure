package allure;

import io.qameta.allure.Step;

public class AllureStep {

    /**
     * Универсальный шаг Allure где первый параметр это название шага
     * а второй код который будет в этом шаге выполнен
     */
    @Step("{0}")
    public static void showStep(String title, Runnable code) {
        code.run();
    }

    /**
     * Шаг маркер для вывода URL
     */
    @Step("{0}")
    public static void showStep(String url) {}
}
