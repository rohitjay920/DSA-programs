package leetcode;

import java.util.Arrays;

/*
 * Leetcode problem: 1295
 * Given an array 'nums' of integers, return how many of them contain an even number of digits. 
 */

public class EvenDigits {
	public static void main(String[] args) {
		int[] nums = {12,3345,2,789,4,72567};
		int result = check(nums);
		System.out.println(result+": even number of digits in the array");
	}
	
	static int check(int[] arr) {
		int count = 0;
		int even_num_digits = 0;
		for(int i=0;i<arr.length;i++) {
			int digits = arr[i];
			while(digits>0) {
				count++;
				digits=digits/10;
			}
			if(count%2==0) {
				even_num_digits++;
			}
			
			count=0;
		}
		return even_num_digits;
	}
}
