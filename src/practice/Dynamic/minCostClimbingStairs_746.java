package practice.Dynamic;

public class minCostClimbingStairs_746 {
    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        int[] minCost = new int[len];
        minCost[0] = cost[0]; minCost[1] = cost[1];
        for (int i = 2; i <len; i++) {
            minCost[i] = Math.min(minCost[i-1],minCost[i-2])+cost[i];
        }
        return Math.min(minCost[len-1],minCost[len-2]);
    }
}
