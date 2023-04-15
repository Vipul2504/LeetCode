package Medium;

import java.util.Arrays;

/**
 * MaximumIceCreamBars1833
 */
public class MaximumIceCreamBars1833 {

    public static void main(String[] args) {
        int[] costs = { 1, 3, 2, 4, 1 };
        int coins = 7;
        int ans = MaxIceCream(costs, coins);
        System.out.println(ans);
        System.out.println(ans);

    }

    private static int MaxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count = 0;
        for (int i = 0; i < costs.length; i++) {

            if (coins - costs[i] >= 0) {
                count++;
                coins -= costs[i];
            }
        }
        return count;
    }
}
