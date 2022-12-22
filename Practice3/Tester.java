import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите координату x: ");
        int x = in.nextInt();
        System.out.print("Введите координату y: ");
        int y = in.nextInt();
        Circle circle = new Circle(x, y);
        System.out.println(circle);
    }
}