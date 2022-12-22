public class Phone {
    private String number = "0-000-000-00-00";
    private String model = " ";
    private double weight = 10;

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone() {

    }
    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public String toString() {
        return "Номер: " + this.number + ", модель: " + this.model + ", ширина: " + this.weight;
    }
    public String receiveCall(String name) {
        return " звонит " + name;
    }
    public String receiveCall(String name, String number) {
        return "Звонит " + name + ", номер: " + number;
    }
    public String getNumber() {
        return number;
    }
    public void sendMessage(int n, String[] number) {
        for (int i = 0; i < n; ++i) {
            System.out.println(number[i]);
        }
    }
}