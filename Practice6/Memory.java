public class Memory {
    private String name;
    private int MHz;
    private byte Gigabyte;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return MHz;
    }

    public void setPower(int power) {
        MHz = power;
    }

    public byte getObj() {
        return Gigabyte;
    }

    public void setObj(byte obj) {
        Gigabyte = obj;
    }
}