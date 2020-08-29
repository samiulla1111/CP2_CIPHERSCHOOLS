class Solution {
    public int tribonacci(int n) {
		int zero = 0, one = 1, two = 1, sum = 0;
		if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
		for (int i = 3; i <= n; i++) {
			sum = zero + one + two;
			zero = one;
			one = two;
			two = sum;
		}
		return sum;   
    }
}