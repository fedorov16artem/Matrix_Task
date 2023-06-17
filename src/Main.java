import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите размер матриц: ");
            int size = scanner.nextInt();


        Matrix m1 = new Matrix(size);
        Matrix m2 = new Matrix(size);
        Matrix matrix = new Matrix(size);

        System.out.println("m1: \n " + matrix.getMatrix());

        System.out.println("m2: \n " + matrix.getMatrix());

        System.out.println("m1 + m2:" +matrix.sumMatrix(m1,m2));

        System.out.println("m1 - m2:" + matrix.subtract(m1,m2) );

        System.out.println("m1 * m2:" + matrix.multiply(m1,m2));

        System.out.println("m1, column 1:");
        m1.printColumn(1);

        System.out.println("m1, row 0:");
        m1.printRow(0);

        System.out.println("m1, main diagonal:");
        m1.printMainDiagonal();

        System.out.println("m1, secondary diagonal:");
        m1.printSecondaryDiagonal();

    }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}