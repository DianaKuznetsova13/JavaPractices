import java.lang.*;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Math_and_Random_ex1 {
    public static void randomMath() {
        double[] arr = new double[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = Math.random();
        }
        System.out.print("\nНеотсортированный массив: ");
        for (int j = 0; j < 10; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.print("\nОтсортированный массив: ");
        Arrays.sort(arr);
        for (int k = 0; k < 10; k++) {
            System.out.print(arr[k] + " ");
        }
}
    public static void classRandom() {
        Random rand = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = rand.nextInt();
        }
        System.out.print("\nНеотсортированный массив: ");
        for (int j = 0; j < 10; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.print("\nОтсортированный массив: ");
        Arrays.sort(arr);
        for (int k = 0; k < 10; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    public static void main(String[] args) {
        int menu;
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("\n\nЗавершение работы программы: 0.\nВыберите подход к генерации случ. чисел:\n1 - метод random() класса Math;\n2 - класс Random.\nВвод: ");
            menu = in.nextInt();
            switch (menu) {
                default: {
                    System.out.println("Вы ввели некорректное число. Попробуйте ещё раз.");
                }
                case 0: {
                    System.out.println("Работа программы успешно завершена.");
                }
                case 1: {
                    randomMath();
                    break;
                }
                case 2: {
                    classRandom();
                    break;
                }
            }
        }while (menu != 0);
    }
}
