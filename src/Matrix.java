import java.util.Arrays;
import java.util.Random;

public class Matrix {

    private final int[][] matrix;
//    private int rows;
//    private int columns;
    Random random = new Random();
    public Matrix(int size) {
        this.matrix = new int [size][size];
        generating();
//        this.rows = arr.length;
//        this.columns = arr[0].length;
    }
    private void generating() {
        for (int i = 0; i < matrix.length; i++) { //Прохождение по строкам матрицы
            for (int j = 0; j < matrix.length; j++) { // Прохождение по столбцам матрицы
                matrix[i][j] = random.nextInt(10); // Генерация случайных  чисел
            }
        }
    }
// Метод сложение матрицы
    public String sumMatrix(Matrix m1, Matrix m2) {
        int[][] res = new int[matrix.length][matrix.length];
        for(int i=0; i<matrix.length; i++) { //Прохождение по строкам матрицы
            for(int j=0; j<matrix.length; j++) { // Прохождение по столбцам матрицы
                res[i][j] = m1.matrix[i][j] + m2.matrix[i][j];
            }
        }
        return Arrays.deepToString(res);
    }

//Метод вычетание марицы
    public String subtract(Matrix m1, Matrix m2) {
        int[][] res = new int[matrix.length][matrix.length];
        for(int i=0; i<matrix.length; i++) { //Прохождение по строкам матрицы
            for(int j=0; j<matrix.length; j++) { // Прохождение по столбцам матрицы
                res[i][j] = m1.matrix[i][j] - m2.matrix[i][j];
            }
        }
        return Arrays.deepToString(res);
    }

// Метод умножения
    public String multiply(Matrix m1, Matrix m2) {
        int[][] res = new int[matrix.length][matrix.length]; // создаем новый двумерный массив с размерностью, соответствующей количеству строк текущей матрицы и столбцов переданной
        for(int r=0; r<matrix.length; r++) {  //Прохождение по строкам матрицы
            for(int c=0; c<matrix.length; c++) { // Прохождение по столбцам матрицы
                 // переменная для хранения суммы произведений элементов на текущей строке и соответствующем столбце
                for(int i=0; i<matrix.length; i++) { // проходим по каждому элементу текущей строки (и каждому элементу соответствующего столбца переданной)
                    res[r][i] = m1.matrix[r][i] * m2.matrix[i][c]; // прибавляем произведение элементов к сумме
                }
            }
        }
        return Arrays.deepToString(res); // возвращаем новую матрицу
    }
// метод для вывода матрицы в консоль
    public String getMatrix() {
        //Получение строкового представления многомерного массива
        String stringMatrix = Arrays.deepToString(matrix);
        /* Преобразование полученного стрового представления в удобочитаемый формат */
        stringMatrix = stringMatrix.replaceAll("\\[\\[", "[").replaceAll("]]", "]")
                .replaceAll("], ", "]\n");
        /* Возвращение строкового представления массива */
        return stringMatrix;
    }
// метод для вывода заданного столбца матрицы в консоль
    public void printColumn(int col) {
        for(int i=0; i<matrix.length; i++) {
            System.out.println(matrix[i][col]);
        }
    }
// метод для вывода заданной строки матрицы в консоль
    public void printRow(int row) {
        System.out.println(Arrays.toString(matrix[row]));
    }
 //выводится на экран главная диагональ матрицы
    public void printMainDiagonal() {
        for(int i=0; i<matrix.length; i++) {
            System.out.println(matrix[i][i]);
        }
    }
//выводится на экран побочная диагональ матрицы
    public void printSecondaryDiagonal() {
        for(int i=0; i<matrix.length; i++) {
            System.out.println(matrix[i][matrix.length-i-1]);
        }
    }
    //переопределен для удобства чтения матрицы в строковом виде
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int[] row : matrix) {
            sb.append(Arrays.toString(row)).append("\n");
        }
        return sb.toString();
    }

}
