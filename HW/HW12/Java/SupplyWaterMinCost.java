package HW12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SupplyWaterMinCost {
	public int minCostToSupplyWater(int n, int[] wells, int[][] pipes) {
        List<int[]> edges = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            edges.add(new int[]{0, i + 1, wells[i]});
        }
        for (int[] pipe : pipes) {
            edges.add(pipe);
        }
        Collections.sort(edges, Comparator.comparingInt(a -> a[2]));

        int[] parent = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            parent[i] = i;
        }
        
        int totalCost = 0;
        for (int[] edge : edges) {
      
            int h1 = edge[0];
            int h2 = edge[1];
            int cost = edge[2];
            int root1 = h1; 
            int root2 = h2;
            
            while (parent[root1] != root1) {
                root1 = parent[root1];
            }
            while (parent[root2] != root2) {
                root2 = parent[root2];
            }
            if (root1 != root2) {
                parent[root1] = root2;
                totalCost += cost;
            }
        }

        return totalCost;
    }
  
	public static void main(String[] args) {
		SupplyWaterMinCost sup = new SupplyWaterMinCost();
		int n = 2;
		int[] wells = {1,1};
		int[][] pipes = {{1,2,1}, {1,2,2}};
		System.out.print(sup.minCostToSupplyWater(n, wells, pipes));
	}
}
