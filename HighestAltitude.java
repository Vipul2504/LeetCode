public class HighestAltitude {
    public static void main(String[] args) {
        int[] gain = { -5, 1, 5, 0, -7 };
        int ans = findHighestAltitude(gain);
        System.out.println(ans);

    }

    private static int findHighestAltitude(int[] gain) {
        int altitude = 0;
        int max = 0;

        for (int i = 0; i < gain.length; i++) {
            altitude += gain[i];

            if (altitude > max) {
                max = altitude;
            }
        }
        return max;
    }
}
