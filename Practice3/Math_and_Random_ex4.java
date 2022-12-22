import java.lang.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Math_and_Random_ex4 {
    public static void creationArray(int n) {
        int[] arr = new int[n];
        System.out.print("\nМассив: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * n);
            System.out.print(arr[i] + " ");
        }
        ArrayList<Integer> even_arr = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] % 2 == 0) {
                even_arr.add(arr[j]);
            }
        }
        if (even_arr.isEmpty()) {
            System.out.println("В данном массиве нет чётных элементов.");
        }
        else {
            System.out.print("\nМассив чётных элементов: ");
            for (int k = 0; k < even_arr.size(); k++) {
                System.out.print(even_arr.get(k) + " ");
            }
        }
    }
    public static void main(String[] args) {
        int n;
        do {
            System.out.print("\nВведите количество элементов массива (натур. число).\nВвод: ");
            Scanner in = new Scanner(System.in);
            n = in.nextInt();
            if (n < 1) {
                System.out.print("Вы ввели не натуральное число. Попробуйте ещё раз.");
            }
        }while (n < 1);
        creationArray(n);
    }
}