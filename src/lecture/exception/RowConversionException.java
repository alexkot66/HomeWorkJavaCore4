package lecture.exception;

public class RowConversionException extends Exception {

    public RowConversionException(int expected, int actual) {
        super("Ошибка преобразования: ожидалось " + expected + " строк, но было " + actual);
    }
}
