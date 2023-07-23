class Solution {
    //0 means the originial value was <=0 or >n
    //-1 means the value is marked, its index + 1 exists in the array, so nums[2] == -1 means 3 was in the array
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            if(nums[i] < 0 || nums[i] > n) {
                nums[i] = 0;
            } 
        }
        for(int i = 0; i < n; i++) {
            if(nums[i] > 0) {
                walk(nums, nums[i]);
            }
        }
        for(int i = 0; i < n; i++) {
            if(nums[i] != -1) {
                return i + 1;
            }
        }
        return n + 1;
    }

    public void walk(int[] nums, int num) {
        int old = nums[num - 1];
        nums[num - 1] = -1;
        while(old > 0) {
            num = old;
            old = nums[num - 1];
            nums[num - 1] = -1;
        }
    }

}
