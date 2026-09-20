class Solution {
    public boolean hasDuplicate(int[] nums) {
        int[] set = nums;
        Arrays.sort(set);

        for(int i=0; i < set.length -1 ; i++){
            if(set[i]==set[i+1]) return true;
        }
        return false;
    }
}