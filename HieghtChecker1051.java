public class HieghtChecker1051 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,3,5,7,2,4,8,9};
        int ans = HieghtChecker(nums);
        System.out.println(ans);
    }

    private static int HieghtChecker(int[] heights) {
        int[] heightToFreq = new int[101];
        
        for (int height : heights) {
            heightToFreq[height]++;
        }
        
        int result = 0;
        int curHeight = 0;
        
        for (int i = 0; i < heights.length; i++) {
            while (heightToFreq[curHeight] == 0) {
                curHeight++;
            }
            
            if (curHeight != heights[i]) {
                result++;
            }
            heightToFreq[curHeight]--;
        }
        
        return result;
    }
}
