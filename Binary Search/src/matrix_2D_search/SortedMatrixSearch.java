package matrix_2D_search;

import java.util.Arrays;

// https://leetcode.com/problems/search-a-2d-matrix-ii/
// problem number 240

// this code only works if the matrix is sorted in both rows and colums, this matrix is not strictly sorted, strictly sorted matrix
// this code doesnt work for jagged array

public class SortedMatrixSearch {
	public static void main(String[] args) {
		int[][] arr = {{10,15,21},{12,17,27},{16,19,28}};
		int target = 28;
		for(int i =0; i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(Arrays.toString(search(arr,target)));
		
		
	}
	public static int[] search(int[][] arr, int target) {
		int row = 0;
		int col = arr[row].length-1;

		
		while(row<arr.length && col>=0) {
			
			if(arr[row][col] == target) {
				return new int[] {row,col};
			}
			else if(arr[row][col] > target) {
				col--;
				System.err.println(col);
			}
			else {
				row++;
			}
		}
		return new int[] {-1,-1};
	}
}
