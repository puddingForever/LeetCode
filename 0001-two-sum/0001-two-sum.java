class Solution {
    public static void main(String[] args){
        
        int[] nums = {3,2,4};
        int target = 6;
        
        twoSum(nums,target);  // 1,6 6-4 = 2 
        
    }
    public static int[] twoSum(int[] nums, int target) {
        
        
        for(int i=0; i<nums.length; i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j] == target-nums[i]){
                    return new int[]{i,j};
                }
                
            }
        }
        
        return null;
        
    }
}