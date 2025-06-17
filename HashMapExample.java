import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
       
        Map<String, Integer> studentScores = new HashMap<>();

        
        studentScores.put("Alice", 95);
        studentScores.put("Bob", 88);
        studentScores.put("Charlie", 92);
        studentScores.put("David", 78);

      
        int aliceScore = studentScores.get("Alice");
        System.out.println("Alice's score: " + aliceScore);

     
        boolean hasBob = studentScores.containsKey("Bob");
        System.out.println("Has Bob? " + hasBob);

      
        studentScores.put("Bob", 90);
        System.out.println("Bob's new score: " + studentScores.get("Bob"));

        
        studentScores.remove("Charlie");

        
        System.out.println("All scores:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        
        int size = studentScores.size();
        System.out.println("Number of students: " + size);

        
        studentScores.clear();
        System.out.println("Is HashMap empty? " + studentScores.isEmpty());
    }
}