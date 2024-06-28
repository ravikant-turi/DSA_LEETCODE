class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0]; // starting point
        int fast = nums[0];  // starting point
        
		//waiting for collission
        do{
            slow = nums[slow];  // slow take one step
            fast = nums[nums[fast]]; // fast take two steps
        } while(slow != fast);
        
        fast = nums[0];  // fast place at starting point 
        while(slow != fast){ //once they collied while loop will break, that will be the duplicate  number
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}