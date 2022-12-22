import java.util.Scanner;

public class Store_ex3 {
    public static class Product {
        String nameProd;
        double cost;
        double rating;

        Product(String nameProd, double cost, double rating) {
            this.nameProd = nameProd;
            this.cost = cost;
            this.rating = rating;
        }
    }
    public static class Category {
        String nameCat;
        Product[] products;
        Category(String nameCat, Product[] products) {
            this.nameCat = nameCat;
            this.products = products;
        }
    }
    public static class Basket {
        Product[] bought;
        Basket(Product[] bought) {
            this.bought = bought;
        }
    }

    public static class User {
        public User(String login, String pass) {
            this.login = login;
            this.pass = pass;
        }
        public String login, pass;
        public Basket bought;
        boolean authorization(String login, String pass) {
            if(this.login == login && this.pass == pass)
                return true;
            else
                return false;
        }
    }
    public static void getMenu() {
        System.out.println("\nМеню" + "\n0) Выйти" +"\n1) Категории товаров" + "\n2) Корзина" + "\n3) Оплатить товары");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch(number) {
            case 0: {
                break;
            }
            case 1: {
                getCategory(all);
                break;
            }
            case 2: {
                getBasket(card);
                break;
            }
            case 3: {
                Buy();
                break;
            }
        }
    }
    public static void Buy() {
        Basket cards = new Basket(card);
        client.bought = cards;
        System.out.println("Товарный чек");
        for (int i = 0; i < client.bought.bought.length; ++i) {
            if(client.bought.bought[i] == null) break;
            System.out.println((i + 1) + ") " + client.bought.bought[i].nameProd + "; цена: " + client.bought.bought[i].cost + "; рейтинг: " + client.bought.bought[i].rating);
        }
        double gc = getCash(client.bought.bought);
        System.out.print("Общая сумма покупок: " + gc);
    }
    public static double getCash(Product[] p) {
        double cash = 0.0;
        for (int i = 0; i < p.length; ++i) {
            if(p[i] == null) break;
            cash += p[i].cost;
        }
        return cash;
    }
    public static void getCategory(Category[] c) {
        System.out.println("0) Вернуться");
        for (int i = 0; i < c.length; ++i)
            System.out.println((i + 1) + ") " + c[i].nameCat);
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number == 0)getMenu();
        else seeProduct(all[number - 1]);
    }
    public static void getBasket(Product[] b) {
        for(int i = 0; i < b.length; ++i) {
            if(b[i] == null) break;
            System.out.println((i + 1) + ") " + b[i].nameProd + "; цена: " + b[i].cost + "; рейтинг: " + b[i].rating);
        }
        System.out.println("0) Вернуться");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number == 0)getMenu();
    }
    public static void seeProduct(Category cat) {
        System.out.println("0) Вернуться");
        for(int i = 0; i < cat.products.length; ++i) {
            System.out.println((i+1) + ") " + cat.products[i].nameProd + "; цена: " + cat.products[i].cost + "; рейтинг: " + cat.products[i].rating);
        }
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number == 0)
            getCategory(all);
        else
            buyProduct(cat.products[number-1]);
    }
    private static void buyProduct(Product p) {
        System.out.println("Товар " + p.nameProd + " за " + p.cost + " добавлен в корзину.");
        for (int i = 0; i < card.length; ++i) {
            if (card[i] == null) {
                card[i] = p;
                break;
            }
            else {
                if(i + 1 == card.length && card[i] == null) {
                    System.out.println("Корзина заполнена.");
                    break;
                }
            }
        }
        getCategory(all);
    }
    static Product shirt = new Product("Рубашка", 700.0, 4.6);
    static Product trousers = new Product("Брюки", 1300.0, 4.1);
    static Product boots = new Product("Ботинки", 3200.0, 5.0);
    static Product blouse = new Product("Блузка", 800.0, 4.4);
    static Product skirt = new Product("Юбка", 1100.0, 4.3);
    static Product shoes = new Product("Туфли", 2800.0, 4.9);
    static Product[] Man = { shirt, trousers, boots };
    static Product[] Woman = { blouse, skirt, shoes };
    static Category man = new Category("Мужская одежда", Man);
    static Category woman = new Category("Женская одежда", Woman);
    static Category[] all = { man, woman };
    static Product[] card;
    static User client;

    public static void main(String[] args) {
        client = new User("123","123");
        Scanner in = new Scanner(System.in);
        card = new Product[10];
        System.out.println("Авторизация пользователя\nВведите логин и пароль:");
        String login = (String)in.nextLine();
        String password = (String)in.nextLine();
        if (!client.authorization(login, password)) {
            getMenu();
        }
    }
}