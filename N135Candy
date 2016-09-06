public class N135Candy{
  public int candy(int[] ratings){
      int length = ratings.length;
      if(length == 1) return 1;
      
      int[] candy = new int[length];
      Arrays.fill(candy, 1);
      
      for(int i = 1; i < length; i++){
        if(ratings[i] > rating[i - 1])
          candy[i] = candy[i - 1] + 1;
      }
      
      int miniCandies = candy[length - 1];
      
      for(int i = length - 2; i >= 0; i--){
            if(ratings[i] > ratings[i - 1] && candy[i] >= candy[i - 1])
                candy[i] = candy[i + 1] + 1;
        
            miniCandies += candy[i];
      }
      
      return miniCandies;
  }
}
