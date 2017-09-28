/**
 * Problem 026. Remove Duplicates from Sorted Array
 * --Description:
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * --Example:
 * Given input array nums = [1,1,2],
 * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
 * It doesn't matter what you leave beyond the new length.
 */
public class Problem026 {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        if(nums.length==0){
            return 0;
        }
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        Problem026 test = new Problem026();
        int[] nums = new int[]{1, 1,2, 2,3,4};
        System.out.println(test.removeDuplicates(nums));
    }
}
