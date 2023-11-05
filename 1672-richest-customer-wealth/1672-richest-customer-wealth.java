class Solution {
    public int maximumWealth(int[][] accounts) {
        
        //이차원 배열당 합을 구해서 새로운 배열에 넣음 
        int firstSum = 0;   
        int length = accounts.length;
        int[] result = new int[length];
        
        for(int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[i].length;j++){
                firstSum += accounts[i][j];
            }
            result[i] = firstSum;
            firstSum = 0; //초기화
        }
                
        int max = result[0]; //6
        
        for(int i=1;i<result.length;i++){
            if(result[i] > max){
                max = result[i];
            }           
        }
        
        System.out.println(max);
        
        
        return max;
        
    }
}