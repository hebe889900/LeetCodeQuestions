public class Solution {
    public int maxArea(int[] height) {
        if(height==null || height.length <= 1)
            return 0;

        int i=0, j=height.length-1;

        int Smax = Math.min(height[i],height[j])*(j-i);
        while(i<j){
            if(height[i]>height[j])
            {
                Smax = Math.max(Smax, height[j]*(j-i));
                j--;
            }
            else
            {
                Smax = Math.max(Smax, height[i]*(j-i));
                i++;
            }
         }
        return Smax;
    }
}
