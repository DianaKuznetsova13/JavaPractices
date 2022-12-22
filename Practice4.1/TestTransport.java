public class TestTransport {
    public static void main(String[] args)
    {
        double x = 2000;
        Auto A = new Auto(70, 50, 50, 4, 200, x);
        Train B = new Train(350, 6800, 500, 70, 3000, x);
        Ship C = new Ship(35, 3000, 2000, 150, 4000, x);
        Plane D = new Plane(3000,1000, 8000, 120, 8000, x);
        System.out.println("Автомобиль:");
        System.out.println("Время: " + A.time());
        System.out.println("Стом-ть перевозки груза: " + A.sumHeft());
        System.out.println("Стом-ть перевозки пассажиров: " + A.sumPassenger());

        System.out.println("\nПоезд:");
        System.out.println("Время: " + B.time());
        System.out.println("Стом-ть перевозки груза: " + B.sumHeft());
        System.out.println("Стом-ть перевозки пассажиров" + B.sumPassenger());

        System.out.println("\nКорабль:");
        System.out.println("Время: " + C.time());
        System.out.println("Стом-ть перевозки груза: " + C.sumHeft());
        System.out.println("Стом-ть перевозки пассажиров: " + C.sumPassenger());

        System.out.println("\nСамолёт:");
        System.out.println("Время: "+ D.time());
        System.out.println("Стом-ть перевозки груза: " + D.sumHeft());
        System.out.println("Стом-ть перевозки пассажиров: " + D.sumPassenger());
    }
}