public class Categorize_Box_According_to_Criteria2525 {
    public static void main(String[] args) {
        int length = 1000, width = 35, height = 700, mass = 300;
        String Ans = categorizeBox(length, width, height, mass);
        String Ans2 = categorizeBox2(length, width, height, mass);
        System.out.println(Ans);
        System.out.println(Ans2);
        System.out.println(Ans2);
    }

    private static String categorizeBox2(int length, int width, int height, int mass) {
        boolean bulky = false;
        boolean heavy = false;
        if (length >= Math.pow(10, 4) || width >= Math.pow(10, 4) || height >= Math.pow(10, 4)) {
            bulky = true;
        }
        long volume = (long) length * (long) width * (long) height;

        if ((length >= 10000 || width >= 10000 || height >= 10000 || volume >= 1e9) && (mass >= 100)) {
            return "Both";
        } else if ((length >= 10000 || width >= 10000 || height >= 10000 || volume >= 1e9) && (mass < 100)) {
            return "Bulky";
        }

        else if (mass >= 100 && (length < 10000 || width < 10000 || height < 10000 || volume < 1e9)) {
            return "Heavy";
        } else {
            return "Neither";
        }
    }

    private static String categorizeBox(int length, int width, int height, int mass) {
        long volume = (long) length * width * height;

        boolean bulky = false;
        boolean heavy = mass >= 100 ? true : false;

        if (length >= 10000 || width >= 10000 || height >= 1e4 || volume >= 1e9) {
            bulky = true;
        }

        if (bulky && heavy)
            return "Both";
        if (bulky)
            return "Bulky";
        if (heavy)
            return "Heavy";
        return "Neither";

    }
}
