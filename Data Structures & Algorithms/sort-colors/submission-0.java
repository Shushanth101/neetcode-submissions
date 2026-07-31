class Solution {
    public void sortColors(int[] nums) {
        int zeros = 0, ones = 0, twos = 0;
        
        for (int num : nums) {
            if (num == 0) zeros++;
            else if (num == 1) ones++;
            else if (num == 2) twos++;
        }
        
        int i = 0;
        while (i < zeros) {
            nums[i++] = 0;
        }
        while (i < zeros + ones) {
            nums[i++] = 1;
        }
        while (i < nums.length) {
            nums[i++] = 2;
        }
    }
}