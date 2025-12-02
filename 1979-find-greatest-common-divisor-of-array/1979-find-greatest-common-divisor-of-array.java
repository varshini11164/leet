class Solution {
    public int findGCD(int[] nums) {
        
        int min = nums[0];
        int max = nums[0];

        // ✅ Find the true min and max
        for (int num : nums) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        // ✅ GCD of entire array = GCD(min, max)
        return gcd(max, min);
    }

    // ✅ Iterative Euclid (Fastest + Cleanest)
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}