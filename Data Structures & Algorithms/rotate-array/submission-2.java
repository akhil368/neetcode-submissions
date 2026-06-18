class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        if (k == 0) return;

        swapElements(0,nums.length-1,nums);

        swapElements(0,k-1,nums);
        swapElements(k,nums.length-1,nums);

        

    }

    public void swapElements(int l,int r,int[] arr) {
        while(l<r) {
            int swap=arr[l];
            arr[l]=arr[r];
            arr[r]=swap;
            l++;
            r--;
        }
    }
}