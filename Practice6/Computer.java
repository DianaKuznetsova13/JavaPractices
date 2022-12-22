import java.util.Scanner;

public class Computer {
    private String name;
    private Processor proc;
    private Memory mem;
    private Monitor monitor;

    public Computer() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название компьютера: ");
        name = scanner.nextLine();

        proc = new Processor();
        System.out.print("Введите марку процессора: ");
        proc.setName(scanner.nextLine());
        System.out.print("Введите кол-во MHz процессора: " + proc.getName());
        proc.setPower(scanner.nextDouble());
        System.out.print("Введите кол-во ядер процессора: " + proc.getName());
        proc.setObj(scanner.nextByte());
        scanner.nextLine();

        mem = new Memory();
        System.out.print("Введите марку памяти: ");
        mem.setName(scanner.nextLine());
        System.out.print("Введите кол-во MHz памяти: " + mem.getName());
        mem.setPower(scanner.nextInt());
        System.out.print("Введите кол-во гигабайт памяти: " + mem.getName());
        mem.setObj(scanner.nextByte());
        scanner.nextLine();

        monitor = new Monitor();
        System.out.print("Введите марку монитора: ");
        monitor.setName(scanner.nextLine());
        System.out.print("Введите кол-во Hz монитора: " + monitor.getName());
        monitor.setPower(scanner.nextInt());
        System.out.print("Введите диагональ монитора: " + monitor.getName());
        monitor.setObj(scanner.nextByte());
    }

    public String getProcessorName() {
        return proc.getName();
    }

    public String getMemoryName() {
        return proc.getName();
    }

    public String getMonitorName() {
        return monitor.getName();
    }

    public double getProcessorPower() {
        return proc.getPower();
    }

    public int getMemoryPower() {
        return mem.getPower();
    }

    public int getMonitorPower() {
        return monitor.getPower();
    }

    public int getProcessorObj() {
        return proc.getObj();
    }

    public int getMemoryObj() {
        return mem.getObj();
    }

    public int getMonitorObj() {
        return monitor.getObj();
    }

    public String getName() {
        return name;
    }

    public String getProcessor() {
        return "Processor: " + proc.getName() + ", MHz: " + proc.getPower() + ", core: " + proc.getObj();
    }

    public String getMemory() {
        return "Memory: " + mem.getName()+", MHz: " + mem.getPower() + ", gigabyte: " + mem.getObj();
    }

    public String getMonitor() {
        return "Monitor: " + monitor.getName() + ", Hz: " + monitor.getPower() + ", diagonal: " + monitor.getObj();
    }
}