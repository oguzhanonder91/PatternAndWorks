package leetcode;

public class TwoSum {
    public static void main(String[] args) {

        TwoSum twoSum = new TwoSum();
        int[] nums = {3,2,4};
        int target = 6;
        int [] r =twoSum.twoSum(nums, target);
        System.out.println(r[0]+" "+r[1]);
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length  ; j++) {
                if(nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }

        }

        return result;
    }
}
