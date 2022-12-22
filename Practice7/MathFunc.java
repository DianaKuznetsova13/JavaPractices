public class MathFunc implements MathCalculable {
    public double pov(double x, double y) {
        double z = x;
        for (int i = 1; i < y; ++i) {
            z = z * x;
        }
        return z;
    }

    public double module(double x, double y) {
        return Math.sqrt(((x*x)+(y*y)));
    }

    public double PI() {
        return 3.1415926535;
    }
}