public class Seasons_ex1 {
    public enum Season {
        WINTER(-7.3),
        SPRING(10.2),
        SUMMER(24.8) {
            public String getDescription() {
                return "Тёплое время года";
            }
        },
        AUTUMN(8.4);
        private double temp;
        Season(double temp) {
            this.temp = temp;
        }
        public double getTemp(double temp) {
            return temp;
        }
        public String getDescription() {
            return "Холодное время года";
        }
    }
    public static void print(Season season) {
        switch (season) {
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
        }
    }
    public static void printAllValues() {
        for (Season s: Season.values()) {
            System.out.println(s + ", средняя температура: " + s.temp);
            System.out.println("Описание: " + s.getDescription());
        }
    }
    public static void main(String[] args) {
        Season season = Season.SUMMER;
        System.out.println(season);
        print(Season.SUMMER);
        System.out.println("\nВремена года: ");
        printAllValues();
    }
}