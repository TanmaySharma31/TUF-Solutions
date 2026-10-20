class Solution {
    public int paint(int A, int B, int[] C) {
        long max = 0;
        long sum = 0;

        for (int c : C) {
            max = Math.max(max, c);
            sum += c;
        }

        if (A == 1) {
            return (int) ((sum * B) % 10000003);
        } else if (A >= C.length) {
            return (int) ((max * B) % 10000003);
        }

        long left = max;
        long right = sum;

        while (left <= right) {
            long mid = left + (right - left) / 2;

            if (isPossible(C, A, mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return (int) ((left * B) % 10000003);
    }

    public boolean isPossible(int[] arr, int k, long limit) {
        int painters = 1;
        long total = 0;

        for (int nums : arr) {
            if (total + nums <= limit) {
                total += nums;
            } else {
                painters++;
                total = nums;

                if (painters > k) {
                    return false;
                }
            }
        }

        return true;
    }
}