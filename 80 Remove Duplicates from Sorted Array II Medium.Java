  
/*
Time Complexity(O(n))
Space Complexity(O(1))
*/
class Solution {
    public int removeDuplicates(int[] nums) {
        int uniqueIndex = 0;
        int count = 1;
        for(int i = 1; i < nums.length; i++){
            
            if(nums[i] != nums[uniqueIndex] )
            {            
                //not same
                count = 0;
                uniqueIndex++;
                nums[uniqueIndex] = nums[i];
                count++;
            } else {
                //same
                if(count<2){
                    uniqueIndex++;
                    nums[uniqueIndex] = nums[i];
                    count++;
                } else{
                    count++;
                }
            }
        }
        return uniqueIndex+1;
    }
}
