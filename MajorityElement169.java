public class MajorityElement169 {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int ans = MajorityElement(nums);
        System.out.println(ans);
        
    }

    private static int MajorityElement(int[] nums) {
        int count = 0;
        int elemnt = 0;
        for(int num : nums){
            if(count == 0){
                elemnt = num;
            }
            if(num == elemnt){
                count +=1;
            }else{
                count-=1;
            }
        }
        return elemnt;
    }
}
