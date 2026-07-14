class Solution {
    public int findDuplicate(int[] nums) {
        int slow =0;
        int fast =0;
        
            slow = nums[slow];
            fast = nums[nums[fast]];

        while(slow!=fast){
             slow = nums[slow];
            fast = nums[nums[fast]];
        }
        int ptr =0;
        while(ptr!=slow){
            ptr = nums[ptr];
            slow = nums[slow];
        }
        return ptr;
        
    }
}
