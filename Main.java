import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map.Entry;


public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop(2, 250, "Windows", "Чёрный", 15);
        Laptop laptop2 = new Laptop(2, 320, "Windows", "Чёрный", 15);
        Laptop laptop3 = new Laptop(4, 320, "MacOs", "Серый", 15);
        Laptop laptop4 = new Laptop(4, 500, "MacOs", "Серый", 15);
        Laptop laptop5 = new Laptop(4, 500, "Windows", "Серый", 17);
        Laptop laptop6 = new Laptop(8, 500, "Windows", "Чёрный", 17);
        Laptop laptop7 = new Laptop(8, 1000, "MacOs", "Чёрный", 17);
        Laptop laptop8 = new Laptop(16, 1000, "Astra Linux", "Белый", 17);
        Laptop laptop9 = new Laptop(16, 1000, "RedOS", "Белый", 15);
        Laptop laptop10 = new Laptop(16, 1500, "Linux", "Чёрный", 17);

        HashSet<Laptop> laptopsSet = new HashSet<>();
        laptopsSet.add(laptop1);
        laptopsSet.add(laptop2);
        laptopsSet.add(laptop3);
        laptopsSet.add(laptop4);
        laptopsSet.add(laptop5);
        laptopsSet.add(laptop6);
        laptopsSet.add(laptop7);
        laptopsSet.add(laptop8);
        laptopsSet.add(laptop9);
        laptopsSet.add(laptop10);

        Laptop search = new Laptop();
        search.inputSearch(laptopsSet);
        
    }
}

        
        

        

