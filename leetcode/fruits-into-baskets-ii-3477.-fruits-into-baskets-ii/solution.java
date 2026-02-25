// Problem: 3477. Fruits Into Baskets II
// URL: https://leetcode.com/problems/fruits-into-baskets-ii/
// Language: java
class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        boolean[] used = new boolean[n];
        int unplaced = 0;

        for (int f : fruits) {
            boolean placed = false;
            for (int i = 0; i < n; i++) {
                if (!used[i] && baskets[i] >= f) {
                    used[i] = true;
                    placed = true;
                    break;
                }
            }
            if (!placed) unplaced++;
        }
        return unplaced;
    }
}
