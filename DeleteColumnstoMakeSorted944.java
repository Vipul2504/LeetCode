public class DeleteColumnstoMakeSorted944 {
    public static void main(String[] args) {
        String[] str = { "cba", "daf", "ghi" };
        int ans = minDeletionSize(str);
        System.out.println(ans);
    }

    private static int minDeletionSize(String[] A) {
        // int result = 0;
        // for (int i = 0; i < A[0].length(); i++) {
        // for (int j = 0; j < A.length - 1; j++) {
        // if (A[j].charAt(i) > A[j + 1].charAt(i))
        // ;
        // result++;
        // break;
        // }
        // }
        // return result;
        // Niche aur uper ka difference bata

        int result = 0;
        for (int i = 0; i < A[0].length(); i++) {
            for (int j = 0; j < A.length - 1; j++) {
                if (A[j].charAt(i) > A[j + 1].charAt(i)) {
                    result++;
                    break;
                }
            }
        }
        return result;
    }
}
