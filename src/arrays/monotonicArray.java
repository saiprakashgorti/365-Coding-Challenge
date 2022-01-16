package arrays;

public class monotonicArray {

    public static void main(String[] args) {
        int[] nums = {6, 5, 4, 3};
        boolean ans;
        ans = isMonotonic(nums);

        System.out.println(ans);

    }

    public static boolean isMonotonic(int[] nums) {
        return isIncreasing(nums) || isDecreasing(nums);
    }

    public static boolean isIncreasing(int[] nums) {
        for (int i = 0; i < nums.length - 1; ++i)
            if (nums[i] > nums[i + 1]) return false;
        return true;
    }

    public  static  boolean isDecreasing(int[] nums){
        for(int i=0; i<nums.length-1; ++i)
            if (nums[i] < nums[i + 1]) return false;
        return true;
    }
}
