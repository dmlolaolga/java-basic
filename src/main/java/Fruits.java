import java.util.ArrayList;
import java.util.List;

public class Fruits {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Яблоко");
        fruits.add("Апельсин");
        fruits.add("Киви");
        fruits.add("Персик");
        fruits.add("Гранат");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println((i + 1) + ". " + fruits.get(i));
        }
        System.out.println();
    }
}
