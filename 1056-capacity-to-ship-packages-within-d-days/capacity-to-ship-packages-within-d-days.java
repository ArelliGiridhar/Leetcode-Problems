class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sc = 0, sum = 0;
        int n = weights.length;

        for (int i = 0; i < n; i++) {
            sc = Math.max(sc, weights[i]);
            sum += weights[i];
        }

        int low = sc, high = sum;
        int ans = sum;

        while (low <= high) {
            int mid = (low + high) / 2;
            int req = 1;
            int cosum = mid;

            for (int i = 0; i < n; i++) {
                if (cosum >= weights[i]) {
                    cosum -= weights[i];
                } else {
                    req++;
                    cosum = mid-weights[i];
                }
            }

            if (req <= days) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
