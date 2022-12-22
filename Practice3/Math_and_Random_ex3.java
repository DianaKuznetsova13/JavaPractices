import java.lang.*;

public class Math_and_Random_ex3 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        System.out.print("Массив: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 89 + 10);
            System.out.print(arr[i] + " ");
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] >= arr[i]) {
                System.out.println("\nДанный массив не является возврастающей последовательностью.");
                break;
            }
            if (i == arr.length - 1)
                System.out.println("\nДанный массив является строго возрастающей последовательность.");
        }
    }
}