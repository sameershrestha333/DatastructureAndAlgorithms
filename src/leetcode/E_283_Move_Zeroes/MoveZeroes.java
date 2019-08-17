package leetcode.E_283_Move_Zeroes;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != 0)
                j++;
            else if (nums[i] == 0 && nums[i + 1] != 0) {
                int temp = nums[i + 1];
                nums[i + 1] = nums[i];
                nums[j] = temp;
                j++;
            }
        }
    }
}
