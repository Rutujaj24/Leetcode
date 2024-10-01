class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] output = new int[length];
        
       
        for (int i = 0; i < length; i++) {
            output[i] = 1;
        }
        
       
        for (int i = 1; i < length; i++) {
            output[i] = output[i - 1] * nums[i - 1];
        }
        
        
        int suffix = 1; 
        for (int i = length - 1; i >= 0; i--) {
            output[i] *= suffix; 
            suffix *= nums[i]; 
        }
        
        return output;
    }
}