class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] cop =new int[nums.length];
        int strt=0;
        int end=nums.length-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                cop[strt++]=nums[i];
            }
            else{
                cop[end--]=nums[i];
            }
        }
        return cop;
    }
}  
