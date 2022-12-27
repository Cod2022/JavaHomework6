import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/*
 *  Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
    Создать множество ноутбуков.
    Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
    “Введите цифру, соответствующую необходимому критерию:
    1 - ОЗУ
    2 - Объем ЖД
    3 - Операционная система
    4 - Цвет …
    Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
    Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям    
 */

public class Laptop {
    private int ram;
    private int harDriveCapacity; 
    private String operatingSystem;
    private String color;
    private int screenSize;

    public Laptop(int ram, int harDriveCapacity, String operatingSystem, String color, int screenSize){
        this.ram = ram;
        this.harDriveCapacity = harDriveCapacity;
        this.operatingSystem = operatingSystem;
        this.color = color;
        this.screenSize = screenSize;
    }

    public Laptop() {

    }

    public int getRam () {
        return ram;
    }
    

    public void setRam (int ram) {
        this.ram = ram;
    }

    public int gethardDrive () {
        return harDriveCapacity;
    }
    

    public void setHardDrive (int harDriveCapacity) {
        this.harDriveCapacity = harDriveCapacity;
    }

    public String getOperatingSystem () {
        return operatingSystem;
    }
    

    public void setOperatingSystem (String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getColor () {
        return color;
    }
    

    public void setColor (String color) {
        this.color = color;
    }

    public int getScreenSize () {
        return screenSize;
    }
    

    public void setScreenSize (int screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return String.format("RAM: %d Hard drive: %d Operating system: %s Color: %s Screen size: %d;", ram, harDriveCapacity, operatingSystem, color, screenSize);
    }

    @Override
    public boolean equals(Object o) {
        var t = (Laptop) o;
        return ram == t.ram; 
    }

    public boolean equalsDrive(Object o) {
        var t = (Laptop) o;
        return harDriveCapacity == t.harDriveCapacity; 
    }

    public boolean equalsSystem(Object o) {
        var t = (Laptop) o;
        return operatingSystem == t.operatingSystem; 
    }

    public boolean equalsColor(Object o) {
        var t = (Laptop) o;
        return color == t.color; 
    }

    public boolean equalsScreenSize(Object o) {
        var t = (Laptop) o;
        return screenSize == t.screenSize; 
    }




    public void inputSearch (HashSet<Laptop> laptopsSet) {
        Iterator<Laptop> laptops = laptopsSet.iterator();
        Laptop laptop = new Laptop();
        System.out.println("Выберите критерий для поиска:\n 1 - Объём памяти \n 2 - Размер жёсткого диска \n 3 - Операционная система \n 4 - Цвет \n 5 - Размер экрана");
        Scanner in = new Scanner(System.in, "ibm866");
        int i = in.nextInt();
        if (i == 1){
            System.out.println("Введите объём памяти (2, 4, 8 или 16 гигабайт) для поиска: ");
            laptop.setRam(in.nextInt());
            while (laptops.hasNext()) {
                Laptop l = laptops.next();
                if (l.equals(laptop)) {
                    System.out.println(l);
                }
            }
        }
        if (i == 2) {
            System.out.println("Введите размер жёсткого диска (250, 320, 500, 1000 или 1500 гигабайт) для поиска: ");
            laptop.setHardDrive(in.nextInt());
            while (laptops.hasNext()) {
                Laptop l = laptops.next();
                if (l.equalsDrive(laptop)) {
                    System.out.println(l);
                }
            }
        }
        if (i == 3) {
            System.out.println("Введите операционную систему (Windows, MacOs, Linux, Astra Linux, RedOS) для поиска: ");
            laptop.setOperatingSystem(in.next());
            // laptop.setOperatingSystem("Windows");
            while (laptops.hasNext()) {
                Laptop l = laptops.next();
                if (l.equalsSystem(laptop)) {
                    System.out.println(l);
                }
            }
        }
        if (i == 4) {
            System.out.println("Введите цвет (Чёрный, Серый, Белый) для поиска: ");
            // laptop.setColor(in.next());
            laptop.setColor("Чёрный");
            while (laptops.hasNext()) {
                Laptop l = laptops.next();
                if (l.equalsColor(laptop)) {
                    System.out.println(l);
                }
            }
        }
        if (i == 5) {
            System.out.println("Введите размер экрана (15 или 17 дюймов) для поиска: ");
            laptop.setScreenSize(in.nextInt());
            while (laptops.hasNext()) {
                Laptop l = laptops.next();
                if (l.equalsScreenSize(laptop)) {
                    System.out.println(l);
                }
            }
        }
        in.close(); 
    }
}
