class Solution {
    public boolean isUgly(int n) {

        if (n <= 0) {
            return false;
        }

        

        while (n % 5 == 0) {
            n = n / 5;
        }

        return n == 1;
    }
}
