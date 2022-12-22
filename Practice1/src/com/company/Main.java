package com.company;
import java.util.Scanner;

public class Main {
    public static void ex3() {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;
        double sr_ar = 0;
        System.out.print("Введите 10 элементов массива: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = in.nextInt();
            sum += arr[i];
        }
        sr_ar = sum / 10.0;
        System.out.println("Сумма элементов: " + sum);
        System.out.println("Среднее арифметическое элементов: "+ sr_ar + "\n");
    }

    public static void ex4() {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0, i = 0, min = 0, max = 0;
        System.out.print("Введите 10 элементов массива: ");
        do {
            arr[i] = in.nextInt();
            sum += arr[i];
            i++;
        } while (i < 10);

        i = 0;
        min = arr[0];
        while (i < 10) {
            if (min > arr[i])
                min = arr[i];
            if (max < arr[i])
                max = arr[i];
            i++;
        }
        System.out.println("Сумма элементов: " + sum);
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max + "\n");
    }

    public static void ex5(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i]);
            System.out.println("\n");
        }
    }

    public static void ex6() {
        System.out.print("Первые 10 чисел гармонического ряда: ");
        for (int i = 1; i < 11; i++) {
            System.out.print("\n" + "1/" + i + "  ");
        }
        System.out.println("\n");
    }

    public static void ex7() {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int fact = 1;
        System.out.print("Введите число: ");
        n = in.nextInt();
        for (int i = 1; i < n + 1; i++) {
            fact *= i;
        }
        System.out.println("Факториал введённого числа: " + fact + "\n");
    }

    public static void main(String[] args) {
        int menu;
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Завершение работы программы: 0.\nВведите номер упражнения (3, 4, 5, 6 или 7): ");
            menu = in.nextInt();
            switch(menu) {
                default: {
                    System.out.print("Упражнения с таким номером нет. Попробуйте ещё раз.\n");
                    break;
                }
                case 3: {
                    ex3();
                    break;
                }
                case 4: {
                    ex4();
                    break;
                }
                case 5: {
                    ex5(args);
                    break;
                }
                case 6: {
                    ex6();
                    break;
                }
                case 7: {
                    ex7();
                    break;
                }
            }
        } while (menu != 0);
    }
}