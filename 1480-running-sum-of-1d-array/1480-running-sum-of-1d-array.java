class Solution {
    public int[] runningSum(int[] nums) {
        
      //저장할 배열생성 
      int length = nums.length;
      int[] arr = new int[length];
    
      //합 저장 변수 
      int currentSum = 0;
        
      for(int i=0;i<nums.length;i++){
          currentSum += nums[i];
          arr[i] = currentSum;
      }
        
     return arr;
       
    }
}