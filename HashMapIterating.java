import java.util.HashMap;
import java.util.Map;

public class HashMapIterating {
    public static void main(String[] args) {
        HashMap<String, Integer> productPrices = new HashMap<>();
        productPrices.put("Laptop", 1200);
        productPrices.put("Mouse", 25);
        productPrices.put("Keyboard", 75);

        // Iterating through keys and values
        for (Map.Entry<String, Integer> entry : productPrices.entrySet()) {
            System.out.println(entry.getKey() + ": $" + entry.getValue());
        }
    }
}