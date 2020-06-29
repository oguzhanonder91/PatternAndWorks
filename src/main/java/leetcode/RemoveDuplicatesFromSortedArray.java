package leetcode;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int [] arrays = {1,1,2,5,5,7};
        System.out.println(removeDuplicates(arrays));
    }
    public static int removeDuplicates(int[] nums) {
        int j=0;
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i] != nums[j]){
                nums[++j] = nums[i];
            }
        }
    return ++j;
    }
}
