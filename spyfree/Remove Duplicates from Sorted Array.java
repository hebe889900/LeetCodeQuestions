public class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums == null )
            return 0;

        if (nums.length <= 1)
            return nums.length;

        int len = nums.length;
        int i = 1,j = 1;
        while(i<len && j<len){
            int d = nums[i-1];
            while(j<len && nums[j] == d ){
                j++;
            }
            if(j==len) return i;    
            nums[i] = nums[j];
            i++;j++;
        }
        return i;
    }
}
