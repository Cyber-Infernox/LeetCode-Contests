class Solution {
    public int minChanges(int n, int k) {
        int countN = Integer.bitCount(n);
        int countK = Integer.bitCount(k);

        if (countK > countN) {
            return -1;
        }

        int changes = 0;
        for (int i = 0; i < 32; i++) {
            int bitN = (n >> i) & 1;
            int bitK = (k >> i) & 1;

            if (bitN == 1 && bitK == 0) {
                changes++;
            } else if (bitN == 0 && bitK == 1) {
                return -1;
            }
        }

        return changes;
    }
}