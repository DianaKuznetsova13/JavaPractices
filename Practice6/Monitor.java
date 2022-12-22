public class Monitor {
    private String name;
    private int Hz;
    private byte diagonal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return Hz;
    }

    public void setPower(int power) {
        Hz = power;
    }

    public byte getObj() {
        return diagonal;
    }

    public void setObj(byte obj) {
        diagonal = obj;
    }
}