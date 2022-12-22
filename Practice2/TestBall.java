import java.lang.*;
import java.util.Scanner;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(10.5f, 13.7f);
        System.out.println("Координаты мяча: " + b1);
        Scanner in = new Scanner(System.in);
        System.out.print("На сколько Вы хотите сдвинуть мяч по X?\nВвод: ");
        float xDisp = in.nextFloat();
        System.out.print("На сколько Вы хотите сдвинуть мяч по Y?\nВвод: ");
        float yDisp = in.nextFloat();
        b1.move(xDisp, yDisp);
        System.out.println("Новые координаты мяча: " + b1);
    }
}
