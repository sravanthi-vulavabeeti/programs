import java.util.Arrays;

public class CoinChangeGreedy {

    public static void makeChange(int[] coins, int amount) {
        Arrays.sort(coins); 
        int count = 0;
        System.out.print("Coins used: ");
        for (int i = coins.length - 1; i >= 0; i--) {
            while (amount >= coins[i]) {
                amount -= coins[i];
                System.out.print(coins[i] + " ");
                count++;
            }
        }
        System.out.println("\nTotal coins used: " + count);
    }

    public static void main(String[] args) {
        int[] coins = {1, 5, 10, 25, 50};
        int amount = 87;
        makeChange(coins, amount);
    }
}