/**
 * 004.Median of Two Sorted Arrays
 *
 * --Problem Description:
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * Find the median of the two sorted arrays.
 * The overall run time complexity should be O(log (m+n)).
 *
 * --Example 1:
 * nums1 = [1, 3]
 * nums2 = [2]
 * The median is 2.0
 *
 * --Example 2:
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * The median is (2 + 3)/2 = 2.5
 */
public class Problem004 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length;
        int[] nums3 = new int[len1 + len2];
        int i = 0,j=0,k=0;
        while(i<len1&&j<len2){
            if (nums1[i] <= nums2[j]) {
                nums3[k++] = nums1[i++];
            }else{
                nums3[k++] = nums2[j++];
            }
        }
        while (i < len1) {
            nums3[k++] = nums1[i++];
        }
        while (j < len2) {
            nums3[k++] = nums2[j++];
        }
        if (k % 2 != 0) {
            return nums3[(k - 1) / 2];
        }else {
            return (nums3[k/2-1]+nums3[k/2])/2.0;
        }
    }

    public static void main(String[] args) {
        Problem004 test = new Problem004();
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3,4};
        System.out.println(test.findMedianSortedArrays(nums1,nums2));
    }
}
