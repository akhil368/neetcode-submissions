class Solution {
    public int maxArea(int[] heights) {
       int l=0;
       int r=heights.length-1;
        int max=0;
       while(l<r) {
        int width=r-l;

        int currMax=Math.min(heights[l],heights[r]);

        int currSum=currMax*width;

        max=Math.max(currSum,max);

        if(heights[l]<heights[r]) {
            l++;
        }else {
            r--;
        }

       }
       return max;

    }
}
