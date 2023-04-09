//find duplicate for array of n integers range=[1,n]

class Solution {
  
    public int findDuplicate(int[] nums) {
        
        int h[]=new int[nums.length+1];
        for(int i=0;i<nums.length;i++)
        {
            if(h[nums[i]]==0){
            h[nums[i]]+=1;}
            else
            {
                return nums[i];
            }
        }
        return 0;
       
    }
}