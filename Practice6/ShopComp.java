import java.util.Scanner;
import java.util.ArrayList;

public class ShopComp {
    private static ArrayList<Computer> A;

    public static String searchProcessorName(String name)
    {
        int i = 0;
        for (i = 0; i < A.size(); ++i)
        {
            if (A.get(i).getProcessorName().equals(name)) {
                return "Компьютер №"+i+"\n"+A.get(i).getName()+"\n"+A.get(i).getProcessor()+"\n"+A.get(i).getMemory()+"\n"+A.get(i).getMonitor();
            }
        }
        return "Компьютер не найден.";
    }

    public static String searchMemoryName(String name) {
        int i = 0;
        for (i = 0; i < A.size(); ++i) {
            if (A.get(i).getMemoryName().equals(name)) {
                return "Компьютер №" + i + "\n" + A.get(i).getName() + "\n" + A.get(i).getProcessor()+"\n" + A.get(i).getMemory()+"\n"+A.get(i).getMonitor();
            }
        }
        return "Компьютер не найден.";
    }

    public static String searchMonitorName(String name) {
        int i = 0;
        for (i = 0; i < A.size(); ++i) {
            if (A.get(i).getMonitorName().equals(name)) {
                return "Компьютер №" + i + "\n" + A.get(i).getName() + "\n" + A.get(i).getProcessor()+"\n" + A.get(i).getMemory()+"\n"+A.get(i).getMonitor();
            }
        }
        return "Компьютер не найден.";
    }

    public static String searchProcessorPower(double power) {
        int i = 0;
        for (i = 0; i < A.size(); ++i) {
            if (A.get(i).getProcessorPower() == power) {
                return "Компьютер №" + i + "\n" + A.get(i).getName() + "\n" + A.get(i).getProcessor()+"\n" + A.get(i).getMemory()+"\n"+A.get(i).getMonitor();
            }
        }
        return "Компьютер не найден.";
    }

    public static String searchMemoryPower(int power) {
        int i = 0;
        for (i = 0; i < A.size(); ++i) {
            if (A.get(i).getMemoryPower() == power) {
                return "Компьютер №" + i + "\n" + A.get(i).getName() + "\n" + A.get(i).getProcessor()+"\n" + A.get(i).getMemory()+"\n"+A.get(i).getMonitor();
            }
        }
        return "Компьютер не найден.";
    }

    public static String searchMonitorPower(int power) {
        int i = 0;
        for (i = 0; i < A.size(); ++i) {
            if (A.get(i).getMonitorPower() == power) {
                return "Компьютер №" + i + "\n" + A.get(i).getName() + "\n" + A.get(i).getProcessor()+"\n" + A.get(i).getMemory()+"\n"+A.get(i).getMonitor();
            }
        }
        return "Компьютер не найден.";
    }

    public static String searchProcessorObj(byte obj) {
        int i = 0;
        for (i = 0; i < A.size(); ++i) {
            if (A.get(i).getProcessorObj() == obj) {
                return "Компьютер №" + i + "\n" + A.get(i).getName() + "\n" + A.get(i).getProcessor()+"\n" + A.get(i).getMemory()+"\n"+A.get(i).getMonitor();
            }
        }
        return "Компьютер не найден.";
    }

    public static String searchMemoryObj(byte obj) {
        int i = 0;
        for (i = 0; i < A.size(); ++i) {
            if (A.get(i).getMemoryObj() == obj) {
                return "Компьютер №" + i + "\n" + A.get(i).getName() + "\n" + A.get(i).getProcessor()+"\n" + A.get(i).getMemory()+"\n"+A.get(i).getMonitor();
            }
        }
        return "Компьютер не найден.";
    }

    public static String searchMonitorObj(byte obj) {
        int i = 0;
        for (i = 0; i < A.size(); ++i) {
            if (A.get(i).getMonitorObj() == obj) {
                return "Компьютер №" + i + "\n" + A.get(i).getName() + "\n" + A.get(i).getProcessor()+"\n" + A.get(i).getMemory()+"\n"+A.get(i).getMonitor();
            }
        }
        return "Компьютер не найден.";
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите кол-во компьютеров: ");
        int n = scanner.nextInt();
        A = new ArrayList<>(n);
        Computer buf;
        for (int i = 0; i < n; ++i) {
            buf = new Computer();
            A.add(i, buf);
        }
        boolean end = false;
        while (end == false) {
            System.out.println("Меню действий:\n0. Закрыть программу\n1. Добавить компьютер\n2. Удалить компьютер\n3. Найти компьютер\n");
            n = scanner.nextInt();
            switch (n) {
                case 1: {
                    buf = new Computer();
                    A.add(buf);
                    break;
                }
                case 2: {
                    System.out.print("Введите номер компьютера: ");
                    n = scanner.nextInt();
                    if (n > -1 && A.size() > n) {
                        System.out.println("Компьютер успешно удалён." + A.get(n).getName());
                        A.remove(n);
                    }
                    break;
                }
                case 3: {
                    System.out.println("Меню поиска:\n0. Назад\n1. Поиск по процессору\n2. Поиск по памяти\n3. Поиск по монитору");
                    n = scanner.nextInt();
                    switch (n) {
                        case 1: {
                            System.out.println("Меню поиска:\n0. Назад\n1. Поиск по имени\n2. Поиск по MHz\n3. Поиск по Core\n");
                            n = scanner.nextInt();
                            switch (n) {
                                case 1: {
                                    System.out.print("Введите название процессора: ");
                                    System.out.println(searchProcessorName(scanner.nextLine()));
                                    break;
                                }
                                case 2: {
                                    System.out.print("Введите MHz процессора: ");
                                    System.out.println(searchProcessorPower(scanner.nextDouble()));
                                    break;
                                }
                                case 3: {
                                    System.out.print("Введите Core процессора: ");
                                    System.out.println(searchProcessorObj(scanner.nextByte()));
                                    break;
                                }
                            }
                            break;
                        }
                        case 2: {
                            System.out.printf("Меню поиска:\n0. Назад\n1. Поиск по имени\n2. Поиск по MHz\n3. Поиск по кол-ву Gb");
                            n = scanner.nextInt();
                            switch (n) {
                                case 1: {
                                    System.out.print("Введите название памяти: ");
                                    System.out.println(searchMemoryName(scanner.nextLine()));
                                    break;
                                }
                                case 2: {
                                    System.out.print("Введите MHz памяти: ");
                                    System.out.println(searchMemoryPower(scanner.nextInt()));
                                    break;
                                }
                                case 3: {
                                    System.out.print("Введите кол-во Gb памяти: ");
                                    System.out.println(searchMemoryObj(scanner.nextByte()));
                                    break;
                                }
                            }
                            break;
                        }
                        case 3: {
                            System.out.println("Меню поиска:\n0. Назад\n%1. Поиск по имени\n2. Поиск по Hz\n3. Поиск по диагонали");
                            n = scanner.nextInt();
                            switch (n) {
                                case 1: {
                                    System.out.print("Введите название монитора: ");
                                    System.out.println(searchMonitorName(scanner.nextLine()));
                                    break;
                                }
                                case 2: {
                                    System.out.print("Введите Hz монитора: ");
                                    System.out.println(searchMonitorPower(scanner.nextInt()));
                                    break;
                                }
                                case 3: {
                                    System.out.print("Введите диагональ монитора: ");
                                    System.out.println(searchMonitorObj(scanner.nextByte()));
                                    break;
                                }
                            } break;
                        }
                    } break;
                }
                case 0: {
                    end = true;
                }
            }
        }
    }
}