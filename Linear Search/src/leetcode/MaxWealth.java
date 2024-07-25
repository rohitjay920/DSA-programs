package leetcode;

/*
 * Leetcode problem: 1672
 * https://leetcode.com/problems/richest-customer-wealth/description/
 */

public class MaxWealth {
	public static void main(String[] args) {
		int[][] accounts = {{2,4},{5,3},{6,7,4}};
		int sum = maxWealth(accounts);
		System.out.println(sum);
	}
	
	static int maxWealth(int[][] accounts) {
		//person = row
		//account = column
		int result = Integer.MIN_VALUE;
		for(int person = 0; person<accounts.length; person++) {
			//before starting a new column, take the sum of the current row
			int sum = 0;
			for(int account = 0; account<accounts[person].length; account++) {
				sum += accounts[person][account];
			}
			if(sum>result) {
				result = sum;
			}
		}
		
		return result;
	}
}
