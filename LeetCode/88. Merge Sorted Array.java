// Not a good solution 
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=m+n;i>m;i--) {
            nums1[i-1]=nums2[n-1];
            n--;
        }
        Arrays.sort(nums1);
    }
}