import lecture.MatrixSum;
import lecture.exception.ColumnConversionException;
import lecture.exception.RowConversionException;

// Перечисление для праздников
enum Holiday {
    NONE,
    NEW_YEAR,
    MARCH_8,
    FEBRUARY_23
}

// Основной класс программы
public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Иван", Customer.Gender.MALE),
                new Employee("Мария", Customer.Gender.FEMALE),
                new Employee("Петр", Customer.Gender.MALE)
        };

        // Поздравляем сотрудников
        congratulateEmployees(employees, Holiday.NEW_YEAR);
        congratulateEmployees(employees, Holiday.MARCH_8);
        congratulateEmployees(employees, Holiday.FEBRUARY_23);
        congratulateEmployees(employees, Holiday.NONE);

        MatrixSum matrixSum = new MatrixSum();

        int[][] matrix = {
                {1, 1, 1, 1, 1},
                {2, 2, 2, 2, 2},
                {3, 3, 3, 3, 3},
                {2, 2, 2, 2, 2},
                {1, 1, 1, 1, 1}
        };

        try {
            // Вычисление суммы элементов матрицы
            int sum = matrixSum.sumMatrix(matrix);
            System.out.println("Сумма элементов матрицы: " + sum);
        } catch (RowConversionException | ColumnConversionException e) {
            // Обработка исключений и вывод сообщения об ошибке
            System.out.println(e.getMessage());
        }
    }

    public static void congratulateEmployees(Employee[] employees, Holiday holiday) {
        for (Employee employee : employees) {
            switch (holiday) {
                case NEW_YEAR:
                    System.out.println("С Новым Годом, " + employee.getName() + "!");
                    break;
                case MARCH_8:
                    if (employee.getGender() == Customer.Gender.FEMALE) {
                        System.out.println("С 8 Марта, " + employee.getName() + "!");
                    }
                    break;
                case FEBRUARY_23:
                    if (employee.getGender() == Customer.Gender.MALE) {
                        System.out.println("С 23 Февраля, " + employee.getName() + "!");
                    }
                    break;
                case NONE:
                    System.out.println("Просто светлый день, работаем, " + employee.getName() + "!");
                    break;
                default:
                    break;
            }
        }
    }
}
