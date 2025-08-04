package week3.MapEntry;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();

        scores.put("Ali", 85);
        scores.put("Yılmaz", 92);
        scores.put("Özlem", 94);
        scores.put("Zeynep", 86);
        scores.put("Ahmet", 95);
        scores.put("Gökhan", 77);
        scores.put("Caner", 88);
        scores.put("fatma", 47);

        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}