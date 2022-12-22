public class Circle {
    final double PI = 3.14;
    private Point point;
    private double radius;
    private double area;
    private double length;

    public Circle(int x, int y, double radius) {
        this.point = new Point(x, y);
        this.radius = radius;
        area = PI * radius * radius;
        length = 2 * PI * radius;
    }
    public Circle(int x, int y) {
        this.point = new Point(x, y);
        radius = (int)(Math.random() * 45 + 5);
        area = PI * radius * radius;
        length = 2 * PI * radius;
    }
    public String toString() {
        return "Координаты центра: " + point + "\nРадиус: " + radius + "\nДлина окр-ти: " + length + "\nПлощадь окр-ти: " + area;
    }
}