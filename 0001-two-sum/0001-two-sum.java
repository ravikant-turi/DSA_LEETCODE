class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int []arr1=new int[2];
        // ArrayList<Integer> s=new ArrayList<>();
        // int arr1[]=new int [2];
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j]==target){
        //             arr1[0]=i;
        //             arr1[1]=j;
                    

        //         }
        //     }
        // }
        // return arr1;
         int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        int[] result=new int[2];
        for(int i=0;i<n;i++){
            if(map.containsKey(target-nums[i])){
                result[1]=i;
                result[0]=map.get(target-nums[i]);
                return result;
            }
            map.put(nums[i],i);
        }
        return result;

    }
}