package lecture.exception;

public class ColumnConversionException extends Exception {

    public ColumnConversionException(int expected, int actual) {
        super("Ошибка преобразования: ожидалось " + expected + " столбцов, но было " + actual);
    }
}
