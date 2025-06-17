import java.util.HashMap;

public class HashMapAccessing {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<>();
        capitalCities.put("USA", "Washington D.C.");
        capitalCities.put("France", "Paris");
        capitalCities.put("Japan", "Tokyo");

        
        String capitalOfFrance = capitalCities.get("France");
        System.out.println("Capital of France: " + capitalOfFrance);


        
        String capitalOfUSA = capitalCities.get("USA");
        System.out.println("Capital of USA: " + capitalOfUSA);
    }
}