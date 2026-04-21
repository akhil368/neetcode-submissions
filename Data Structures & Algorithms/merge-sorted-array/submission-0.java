class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int total=m+n-1;

        while(i>=0 &&  j>=0) {
            if(nums1[i]>nums2[j]) {
                nums1[total]=nums1[i];
                i--;
                total--;
            } else {
                nums1[total]=nums2[j];
                j--;
                total--;

            }
        }
        while(total!=0 && i>=0 || j>=0) {
            if(i>=0) {
                nums1[total]=nums1[i];
                i--;
                total--;
            } else if(j>=0) {
                 nums1[total]=nums2[j];
                j--;
                total--;

            }

        }
        
    }
}