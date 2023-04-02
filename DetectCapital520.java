public class DetectCapital520 {
    public static void main(String[] args) {
        String word = "USA";
        Boolean Ans = DetectCapital(word);
        System.out.println(Ans);
        System.out.println(Ans);
    }

    private static Boolean DetectCapital(String word) {
        int capitals = 0;
        for (char ch : word.toCharArray()) {
            if (Character.isUpperCase(ch))
                capitals++;
        }
        // case 1 and case 2
        if (capitals == word.length() || capitals == 0)
            return true;
        return capitals == 1 && Character.isUpperCase(word.charAt(0));
    }
}
