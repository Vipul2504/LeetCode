import java.util.HashMap;
import java.util.Map;

public class WordPattern290 {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        Boolean ans = wordpattern(pattern, s);
        System.out.println(ans);

    }

    /**
     * @param pattern
     * @param s
     * @return
     */
    private static Boolean wordpattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if (arr.length != pattern.length())
            return false;

        Map<Character, String> hs = new HashMap<Character, String>();

        for (int i = 0; i < arr.length; i++) {
            char c = pattern.charAt(i);
            String str = arr[i];
            if (hs.containsKey(c)) {
                if (!hs.get(c).equals(str))
                    return false;
            } else {
                if (hs.containsValue(str))
                    return false;
                hs.put(c, str);
            }
        }
        return true;
    }
}
