import java.util.PriorityQueue;
import java.util.Scanner;

public class Knapsack {

    // Node structure to store information of each node in the decision tree for Branch and Bound
    static class Node implements Comparable<Node> {
        int level;
        int profit;
        int bound;
        int weight;

        public Node() {}

        public Node(Node cpy) {
            this.level = cpy.level;
            this.profit = cpy.profit;
            this.bound = cpy.bound;
            this.weight = cpy.weight;
        }

        @Override
        public int compareTo(Node other) {
            return other.bound - this.bound;
        }
    }

    // Function to solve the 0-1 Knapsack problem using Dynamic Programming
    public static int knapSackDP(int W, int[] wt, int[] val, int n) {
        int[][] K = new int[n + 1][W + 1];

        // Build table K[][] in bottom-up manner
        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= W; w++) {
                if (i == 0 || w == 0)
                    K[i][w] = 0;
                else if (wt[i - 1] <= w)
                    K[i][w] = Math.max(val[i - 1] + K[i - 1][w - wt[i - 1]], K[i - 1][w]);
                else
                    K[i][w] = K[i - 1][w];
            }
        }

        return K[n][W];
    }

    // Function to calculate upper bound for Branch and Bound
    static int bound(Node u, int n, int W, int[] p, int[] w) {
        if (u.weight >= W)
            return 0;

        int profit_bound = u.profit;
        int j = u.level + 1;
        int totweight = u.weight;

        while (j < n && totweight + w[j] <= W) {
            totweight += w[j];
            profit_bound += p[j];
            j++;
        }

        if (j < n)
            profit_bound += (W - totweight) * p[j] / w[j];

        return profit_bound;
    }

    // Function to solve the 0-1 Knapsack problem using Branch and Bound
    public static int knapsackBB(int[] p, int[] w, int n, int W) {
        PriorityQueue<Node> Q = new PriorityQueue<>();
        Node u = new Node(), v = new Node();

        v.level = -1;
        v.profit = 0;
        v.weight = 0;
        v.bound = bound(v, n, W, p, w);

        int maxProfit = 0;
        Q.add(v);

        while (!Q.isEmpty()) {
            v = Q.poll();

            if (v.bound > maxProfit) {
                u.level = v.level + 1;
                u.weight = v.weight + w[u.level];
                u.profit = v.profit + p[u.level];

                if (u.weight <= W && u.profit > maxProfit)
                    maxProfit = u.profit;

                u.bound = bound(u, n, W, p, w);

                if (u.bound > maxProfit)
                    Q.add(new Node(u));

                u.weight = v.weight;
                u.profit = v.profit;
                u.bound = bound(u, n, W, p, w);

                if (u.bound > maxProfit)
                    Q.add(new Node(u));
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of items:");
        int n = scanner.nextInt();

        int[] val = new int[n];
        int[] wt = new int[n];

        System.out.println("Enter the values of the items:");
        for (int i = 0; i < n; i++) {
            val[i] = scanner.nextInt();
        }

        System.out.println("Enter the weights of the items:");
        for (int i = 0; i < n; i++) {
            wt[i] = scanner.nextInt();
        }

        System.out.println("Enter the capacity of the knapsack:");
        int W = scanner.nextInt();

        System.out.println("Choose the method to solve the 0-1 Knapsack problem:");
        System.out.println("1. Dynamic Programming");
        System.out.println("2. Branch and Bound");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Maximum value that can be obtained (DP): " + knapSackDP(W, wt, val, n));
                break;
            case 2:
                System.out.println("Maximum value that can be obtained (BB): " + knapsackBB(val, wt, n, W));
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }
}
