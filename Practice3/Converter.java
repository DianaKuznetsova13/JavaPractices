import java.util.*;
import java.text.DecimalFormat;

public class Converter
{
    public static void main(String[] args)
    {
        double amount;
        double dollar, pound, euro;
        int menu;

        DecimalFormat form = new DecimalFormat("##.##");
        Scanner in = new Scanner(System.in);

        System.out.print("\nЗавершение работы программы: 0.\nВведите сумму (руб.): ");
        amount = in.nextDouble();
        System.out.print("Выберите валюту, в к-рую хотите перевести рубли: 1 - доллары, 2 - фунты, 3 - евро.\nВвод: ");
        menu = in.nextInt();

        switch (menu)
        {
            default:
                System.out.println("Вы ввели некорректное число. Попробуйте ещё раз.");
            case 1: {
                dollar = amount / 62.33;
                System.out.println(amount + " руб = " + form.format(dollar) + " долларов");
                break;
            }
            case 2: {
                pound = amount / 69;
                System.out.println(amount + " руб = " + form.format(pound) + " фунтов");
                break;
            }
            case 3: {
                euro = amount / 60.19;
                System.out.println(amount + " руб = " + form.format(euro) + " евро");
                break;
            }
        }
    }
}