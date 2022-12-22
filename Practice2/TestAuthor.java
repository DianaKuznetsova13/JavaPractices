import java.lang.*;
import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args){
        Author a1 = new Author("Alexander Sergeevich Pushkin", 'm', "-");
        System.out.println("Автор: " + a1);
        Scanner in = new Scanner(System.in);
        System.out.println("Введите email автора: ");
        String em = in.nextLine();
        a1.setEmail(em);
        System.out.println("Автор: " + a1);
    }
}
