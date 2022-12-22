import java.util.Scanner;

public class Wrapper {
    public static void ex1() {
        Double double1 = Double.valueOf("0.000001");
        Double double2 = Double.valueOf(0.123456789);
        Double double3 = Double.valueOf(10.987654321);
        System.out.println("Объекты класса Double: " + double1 + ", " + double2 + ", " + double3);
    }
    public static void ex2() {
        String a = "19.03102003";
        Double.parseDouble(a);
        System.out.println("Полученное число: " + a);
    }
    public static void ex3() {
        Double b = new Double(19.04102003);
        System.out.println("Double: " + b + '\n');
        byte byteB = b.byteValue();
        System.out.println("byte: " + byteB);
        short shortB = b.shortValue();
        System.out.println("short: " + shortB);
        int intB = b.intValue();
        System.out.println("int: " + intB);
        long longB = b.longValue();
        System.out.println("long: " + longB);
        float floatB = b.floatValue();
        System.out.println("float: " + floatB);
    }
    public static void ex4() {
        Double c = new Double(11.11111);
        System.out.println("Значение объекта Double: " + c);
    }
    public static void ex5() {
        String d = Double.toString(3.14);
        System.out.println("Полученная строка: " + d);
    }
    public static void main(String[] args) {
        int menu;
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("\n\nЗавершение работы программы: 0.\nВыберите номер упражнения (от 1 до 5).\nВвод: ");
            menu = in.nextInt();
            switch (menu) {
                default: {
                    System.out.println("Некорректный номер упражнения. Попробуйте ещё раз.");
                }
                case 0: {
                    System.out.println("Работа программы успешно завершена.");
                }
                case 1: {
                    ex1();
                    break;
                }
                case 2: {
                    ex2();
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
                    ex5();
                    break;
                }
            }
        }while (menu != 0);
    }
}