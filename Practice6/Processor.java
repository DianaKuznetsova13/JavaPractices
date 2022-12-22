public class Processor {
    private String name;
    private double MHz;
    private int Core;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public double getPower() {
        return MHz;
    }

    public void setPower(double power) {
        MHz = power;
    }

    public int getObj() {
        return Core;
    }

    public void setObj(byte obj) {
        Core = obj;
    }
}