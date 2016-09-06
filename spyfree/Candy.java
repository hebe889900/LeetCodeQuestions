public class Solution {
    public int candy(int[] ratings) {
        
        int step = 1;
        
        int len = ratings.length;
        
        if(len <= 1) return len;
        
        int[] candy_head = new int[ratings.length];
        int[] candy_end = new int[ratings.length];
        
        candy_head[0] = 1;
        candy_end[len-1] = 1;
        
        for (int i=1;i<len;++i){
            if(ratings[i]>ratings[i-1]){
                step = step + 1;
            }
            else if(ratings[i] <= ratings[i-1]){
                step = 1;
            }
            
            candy_head[i] = step;
        }
        
        step = 1;
        for (int i=len-1;i>0;--i){
            if(ratings[i-1]>ratings[i]){
                step = step + 1;
            }
            else if(ratings[i-1] <= ratings[i]){
                step = 1;
            }
            
            candy_end[i-1] = step;
            
        }
        
        int sum = 0;
        
        for (int i=0;i<len;++i)
        {
            sum = sum + Math.max(candy_head[i],candy_end[i]);
        }
        
        return sum;
    }
}
