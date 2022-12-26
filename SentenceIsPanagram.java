import java.util.HashSet;

/**
 * SentenceIsPanagram
 */
public class SentenceIsPanagram {

    public static void main(String[] args) {
        String sentence = "abcdefghijklmnopqrstuvwxyz";
        boolean res = CheckIssentenceIspanagram(sentence);
        System.out.println(res);
    }

    private static boolean CheckIssentenceIspanagram(String sentence) {
        HashSet<Character> letters = new HashSet<>(26);
        for (int i = 0; i < sentence.length(); i++) {
            letters.add(sentence.charAt(i));
        }
        boolean ans = letters.size() >= 26;
        return ans;

    }
}