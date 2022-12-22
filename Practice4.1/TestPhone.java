public class TestPhone {
    public static void main(String[] args) {
        Phone[] phone = new Phone[3];
        phone[0] = new Phone("8-916-555-35-35", "IPhone", 63.1);
        phone[1] = new Phone("8-940-111-55-22", "Nokia", 76.4);
        phone[2] = new Phone("8-977-555-11-11", "Sony", 68.3);

        for (int i = 0; i < 3; ++i) {
            System.out.println(phone[i].toString());
        }

        System.out.println("Номер: " + phone[0].getNumber() + phone[0].receiveCall("Михаил"));
        System.out.println("Номер: " + phone[1].getNumber() + phone[1].receiveCall("Ольга"));
        System.out.println("Номер: " + phone[2].getNumber() + phone[2].receiveCall("Кристина"));

        System.out.println(phone[0].receiveCall("Владимир", "8-950-900-48-10"));

        String[] number = new String[3];
        number[0] = "8-953-960-34-16";
        number[1] = "8-960-911-15-87";
        number[2] = "8-961-635-63-90";
        phone[0].sendMessage(3, number);
    }
}