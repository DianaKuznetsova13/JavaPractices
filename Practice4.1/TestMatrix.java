public class TestMatrix {
    public static void main(String[] args)
    {
        Matrix A = new Matrix(3,3);
        Matrix B = new Matrix(3,3);
        System.out.println("\nВведённые матрицы: ");
        System.out.println(A.toString());
        System.out.println(B.toString());
        System.out.println("Сумма матриц: ");
        A.PlusMatrix(B);
        System.out.println(A.toString());
        System.out.println("Произведение матриц: ");
        A.Multiplication(3);
        System.out.println(A.toString());
    }
}