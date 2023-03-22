public class CheckIfTwoStringArraysareEquivalent1662 {
    public static void main(String[] args) {
        String[] word1 = {"ab","c"};
        String[] word2 = {"a","bc"};
        boolean ans = IsEqual(word1,word2);
        System.out.println(ans);
        System.out.println(ans);
    }

    private static boolean IsEqual(String[] word1, String[] word2) {
        return(String.join("", word1).equals(String.join("", word2)));
    }
}
