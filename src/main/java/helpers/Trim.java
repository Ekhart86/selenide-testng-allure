package helpers;


import java.util.regex.Pattern;

public class Trim {

    /**
     * Метод возвращает строку без символов trimSymbol в начале и в конце строки,
     * если такие есть, или их несколько
     *
     * @param trimSymbol Символ который необходимо убрать с начала или с конца строки
     * @param string     Строка в которой есть лишние символы в начале или в конце
     *                   Pattern.quote() делает из trimSymbol шаблон регулярного выражения
     *                   Добавляя \Q в начало и \E в конец
     */
    public static String trimSymbol(String string, String trimSymbol) {
        return leftTrimSymbol(rightTrimSymbol(string, trimSymbol), trimSymbol);
    }

    /**
     * Метод возвращает строку без символа trimSymbol в начале строки,
     * если такой есть, или их несколько
     *
     * @param trimSymbol Символ который необходимо убрать с начала строки
     * @param string     Строка в которой есть лишний символ в начале
     *                   Pattern.quote() делает из trimSymbol шаблон регулярного выражения
     *                   Добавляя \Q в начало и \E в конец
     */
    public static String leftTrimSymbol(String string, String trimSymbol) {
        trimSymbol = Pattern.quote(trimSymbol);
        return string.replaceAll("^" + trimSymbol + "+", "");
    }

    /**
     * Метод возвращает строку без символа trimSymbol в конце строки,
     * если такой есть, или их несколько
     *
     * @param trimSymbol Символ который необходимо убрать с конца строки
     * @param string     Строка в которой есть лишний символ на конце
     *                   Pattern.quote() делает из trimSymbol шаблон регулярного выражения
     *                   Добавляя \Q в начало и \E в конец
     */
    public static String rightTrimSymbol(String string, String trimSymbol) {
        trimSymbol = Pattern.quote(trimSymbol);
        return string.replaceAll(trimSymbol + "+$", "");
    }
}
