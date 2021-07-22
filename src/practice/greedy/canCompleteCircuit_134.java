package practice.greedy;

public class canCompleteCircuit_134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int len = gas.length;
        for (int i = 0; i < len; i++) {
            int rest = gas[i] - cost[i]; // 记录剩余油量
            int index = (i + 1) % len;
            while (rest > 0 && index != i) { // 模拟以i为起点行驶一圈
                rest += gas[index] - cost[index];
                index = (index + 1) % len;
            }
            // 如果以i为起点跑一圈，剩余油量>=0，返回该起始位置
            if (rest >= 0 && index == i) return i;
        }
        return -1;
    }
}
