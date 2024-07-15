class Solution {
    public long maximumPoints(int[] enemyEnergies, int currentEnergy) {
        Arrays.sort(enemyEnergies);

        if (currentEnergy < enemyEnergies[0])
            return 0;

        long count = 0;
        int marked = enemyEnergies.length - 1;
        while (marked >= 0) {
            if (enemyEnergies[0] <= currentEnergy) {
                count += currentEnergy / enemyEnergies[0];
                currentEnergy %= enemyEnergies[0];
            }

            else {
                currentEnergy += enemyEnergies[marked];
                marked--;
            }
        }

        return count;
    }
}