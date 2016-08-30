# Leetcode questions
[![Motto](https://img.shields.io/badge/motto-good%20good%20study%2C%20day%20day%20up-red.svg)](https://en.wikipedia.org/wiki/Day_Day_Up)

We will working on the Leetcode questions! Unit tests are recommended.

### Questions table

|Question:Remove Duplicates from Sorted Array |Unit test:161 cases: |Runtime Beat:54.77%: |Author: Cory|

public class solutuion{

  public int removeDupulcates(int[] nums ){
     
      int start = 0;
      
      for(int i = 1; i < nums.length;i++){
          if(nums[i] != nums[start]){
            nums[++start] = nums[i];
          }
      }
      return start + 1;
    }
}


|Question:Remove Duplicates from Sorted Array |Unit test:161 cases: |Runtime Beat:54.77%: |Author: xx254|

public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0 )
            return 0;
        if(nums.length == 1)
            return 1;
        int c = 0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]!=nums[i+1]){
                nums[++c] = nums[i+1];
            }
        }
        return c+1;
    }
}


|Question: Contains with most water| unit test:45  | Runtime beat: 78.10%   | Author: Cory  |

public class solution{

    public int containsWithMostWater(int[] height){
    
        if(height.length <= 1 || height == null) reurn 0;
        
        int max = 0, left = 0, right = height.length - 1, hLeft = height[left], hRight = height[right];
        
        while(left < right){
            max = Math.max(max, (right - left) * Math.min(hLeft, hRight));
            
            if(hLeft < hright){
                while(left < right && height[left] <= hLeft) left++;
                
                if(left < right) lLeft = height[left];
            }else{
                while(left < right && height[right] <= hRight) right--;
                
                if(left < right) hRight = height[right];
            }
          
          }
          
        return max;
    }
}

|Question: Contains with most water| unit test:45  | Runtime beat: 25.85%   | Author: xx254  |
public class Solution {
    public int maxArea(int[] height) {
        if(height==null || height.length==0 || height.length == 1)
            return 0;
        if(height.length==2)
            return Math.min(height[0],height[1]);
            
        int i=0, j=height.length-1;

        int Smax = Math.min(height[i],height[j])*(j-i);
        while(i<j){

            int a = height[i]>height[j]?j--:i++;
            int h = Math.min(height[i],height[j]);
            //把h放到展开放到下式中，就会Time Exceed，为什么呢！？
            Smax = Math.max(Smax, h*(j-i));
         }
        return Smax;
    }
    //可以继续优化的地方很多，to be continued...
}
