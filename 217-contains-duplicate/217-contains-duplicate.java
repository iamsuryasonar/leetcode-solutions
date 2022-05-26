class Solution {
    public boolean containsDuplicate(int[] nums) {
        // HashMap<Integer,Integer> map = new HashMap<>();
        //  for(int i = 0; i<nums.length; i++){
        //     if(map.get(nums[i]) == null){
        //         map.put(nums[i],1);
        //     }else{
        //         return true;
        //     }
        // }
        // return false;
        HashSet<Integer> set = new HashSet<>();
            for(int i = 0; i<nums.length ; i++){
                if(set.add(nums[i])==false){
                return true;
            }
        }
      return false;
    }
}