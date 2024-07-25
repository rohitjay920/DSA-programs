package weightedGraph;

import java.util.Scanner;


//Weight of the node is the sum of node numbers of all nodes pointing to that node
public class MaxWeight {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Read the number of cells
		int N = sc.nextInt();

		// Read the Edge array
		int[] Edge = new int[N];
		for (int i = 0; i < N; i++) {
			Edge[i] = sc.nextInt();
		}

		// Initialize an array to store the weights of each node
		int[] weights = new int[N];

		// Calculate the weights
		for (int i = 0; i < N; i++) {
			if (Edge[i] != -1) {
				weights[Edge[i]] += i;
				System.out.println("i: "+i);
				System.out.println("edge of i: "+Edge[i]);
				System.out.println("weight of each edge: "+weights[Edge[i]]);
				System.err.println("--------------------------");
			}
		}

		// Find the node with the maximum weight
		int maxWeight = -1;
		int maxWeightNode = -1;
		for (int i = 0; i < N; i++) {
			if (weights[i] > maxWeight) {
				maxWeight = weights[i];
				maxWeightNode = i;
			}
		}

		// Print the node with the maximum weight
		System.out.println(maxWeightNode);

		sc.close();
	}

}
