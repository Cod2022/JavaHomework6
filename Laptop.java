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
    private boolean sold;

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
    

    public void sethardDrive (int harDriveCapacity) {
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

    public void inputSearch (HashSet<Laptop> laptopsSet) {
        Laptop ram = new Laptop();
        System.out.println("Введите объём памяти (2, 4, 8 или 16 гигабайт) для поиска: ");
        Scanner in = new Scanner(System.in);
        ram.setRam(in.nextInt());
        in.close();

        Iterator<Laptop> laptops = laptopsSet.iterator();
        while (laptops.hasNext()) {
            Laptop l = laptops.next();
            if (l.equals(ram)) {
                System.out.println(l);
            }
                }
    }

 
}
