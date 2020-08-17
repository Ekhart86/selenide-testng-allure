package helpers;

/**
 * Из этого класса можно достать настройки с которыми запускаются тесты.
 * Также здесь указаны настройки по умолчанию.
 * Значения переменных передаются из командной строки при запуске тестов
 * mvn test -Dbrowser=chrome -Dheadless=1
 */
public class TestConfig {

    public static String browser = "chrome";
    public static String headless = "0";

    public static void initConfig() {
        browser = System.getProperty("browser") == null ? "chrome" : System.getProperty("browser");
        headless = System.getProperty("headless") == null ? "0" : System.getProperty("headless");
    }

    public static boolean isHeadless() {
        return headless.contains("1");
    }
}
