package lecture;

import lecture.exception.RowConversionException;
import lecture.exception.ColumnConversionException;
/**
 * Класс для вычисления суммы элементов квадратной матрицы.
 * Ожидается, что матрица будет размером 5x5. Если матрица
 * имеет неверное количество строк или столбцов, выбрасываются соответствующие исключения.
 */

public class MatrixSum {

    private static final int EXPECTED_SIZE = 5;

    /**
     * Метод для вычисления суммы элементов матрицы.
     */
    public int sumMatrix(int[][] matrix) throws RowConversionException, ColumnConversionException {
        if (matrix.length != EXPECTED_SIZE) {
            throw new RowConversionException(EXPECTED_SIZE, matrix.length);
        }

        for (int[] row : matrix) {
            if (row.length != EXPECTED_SIZE) {
                throw new ColumnConversionException(EXPECTED_SIZE, row.length);
            }
        }

        int sum = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                sum += value;
            }
        }

        return sum;
    }
}
