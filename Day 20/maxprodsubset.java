class Solution {
    public int findMaxProduct(int[] arr) {
        long mod = 1000000007;
        int n = arr.length;

        // Case: single element → return directly
        if (n == 1) {
            return arr[0];  // no modulo, keep sign
        }

        long product = 1;
        int negCount = 0, zeroCount = 0;
        int maxNeg = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zeroCount++;
                continue;
            }
            if (arr[i] < 0) {
                negCount++;
                maxNeg = Math.max(maxNeg, arr[i]); // least negative
            }
            product = (product * Math.abs(arr[i])) % mod;
        }

        // Case: all zeros
        if (zeroCount == n) return 0;

        // Case: odd negatives
        if (negCount % 2 == 1) {
            // Special case: only one negative and rest are zeros
            if (negCount == 1 && zeroCount + negCount == n) {
                return 0;
            }
            product = (product / Math.abs(maxNeg)) % mod;
        }

        return (int)(product % mod);
    }
}
}
