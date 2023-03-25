class Sumof1DArray {
    
    public static void main(String args[]){
        
     //Calling the first method. THis method is not very much optimized.    
    }
        
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for(int i =1; i<nums.length; i++){
            
            result[i] = result[i-1]+nums[i];
        }
        
        return result;
        
        
    }
}
