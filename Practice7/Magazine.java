public class Magazine implements Printable {
    String name;
    Magazine(String name){
        this.name=name;
    }

    public String print() {
        return name;
    }
}