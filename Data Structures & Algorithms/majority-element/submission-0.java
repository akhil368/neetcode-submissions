class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n=nums[Math.abs(nums.length/2)];
        return n;
    }
}